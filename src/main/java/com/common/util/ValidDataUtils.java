package com.common.util;

import com.fgsc.enums.RespEnum;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.List;
import java.util.Set;

/**
 * @author marver
 * 2019/7/2
 * @description 验证工具类
 */
public class ValidDataUtils {
    private static Validator validator;

    static {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }
    /**
     * 校验对象
     * @param object        待校验对象
     * @param groups        待校验的组
     */
    public static void validateEntity(Object object, Class<?>... groups) {
        Set<ConstraintViolation<Object>> constraintViolations;
        if(object instanceof List){
            List list = (List)object;
            for (int i = 0; i < list.size(); i++) {
                validateEntity(list.get(i),groups);
            }
        }else {
            constraintViolations = validator.validate(object, groups);
            if (!constraintViolations.isEmpty()) {
                ConstraintViolation<Object> constraint = (ConstraintViolation<Object>)constraintViolations.iterator().next();
                throw new FgException(RespEnum.SYSTEM_PARAM.getCode(), constraint.getMessage());
            }
        }
    }
}
