package com.artworld.common.base.model;



import java.io.Serializable;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;


public class IdentityModel implements Serializable {

    public static final OffsetDateTime DEFAULT_DATE_TIME = OffsetDateTime.of(1970, 1, 1, 0, 0, 0, 0, ZoneOffset.ofHours(8));

    private Long id;

    private OffsetDateTime createTime;

    private OffsetDateTime updateTime;

    private OffsetDateTime deleteTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public OffsetDateTime getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(OffsetDateTime deleteTime) {
        this.deleteTime = deleteTime;
    }
}

