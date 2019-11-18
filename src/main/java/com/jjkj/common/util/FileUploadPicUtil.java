package com.jjkj.common.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class FileUploadPicUtil
{
    private FileUploadPicUtil()
    {
    }

    private static final Logger logger = LoggerFactory.getLogger(FileUploadPicUtil.class);

    public static List<String> uploadBtachForPic(CommonsMultipartFile[] files)
    {

        List<String> list = new ArrayList<>();

        //存储格式 存储位置：example
        //\\data\\images\\business_license_img\\20180412\\e5e84b76-cf6b-4e3f-a7c1-cb123676bb0c.png

        // 时间
        String dateTimePath = DateUtil.getFormatDateString(new Date(), "yyyyMMdd");

        // 上传位置
        // 设定文件保存的目录
        String path1 = "/data" + ContsantUtil.FilePath.file + "/" + dateTimePath + "/";
        
        //use query 
        String path2 =  ContsantUtil.FilePath.file + "/" + dateTimePath + "/";

        File f = new File(path1);
        if (!f.exists())
            f.mkdirs();

        for (int i = 0; i < files.length; i++)
        {
            // 获得原始文件名
            String fileName = files[i].getOriginalFilename();

            if (null == fileName || "".equals(fileName))
            {
                logger.info("文件名 empty or null, iteration next File:");
                continue;
            }
            logger.info("原始文件名:" + fileName);

            //get suffix
            int location = fileName.lastIndexOf(".");
            String suffix = fileName.substring(location);

            // 新文件名
            String newFileName = UUID.randomUUID().toString().replaceAll("-", "") + "" + suffix;// fileName;
            if (!files[i].isEmpty())
            {
                try
                {
                    FileOutputStream fos = new FileOutputStream(path1 + newFileName);
                    InputStream in = files[i].getInputStream();
                    int b = 0;
                    while ((b = in.read()) != -1)
                    {
                        fos.write(b);
                    }
                    fos.close();
                    in.close();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }

            logger.info("" + "上传图片到:" + path1 + newFileName);

            list.add(path2 + newFileName);

        }

        return list;

    }
    
    
    public static  Map<String, String> uploadBtachForPicSingle(CommonsMultipartFile[] files)
    {

        Map<String, String> map=new HashMap<>();
                
        List<String> list = new ArrayList<>();

        //存储格式 存储位置：example
        //\\data\\images\\business_license_img\\20180412\\e5e84b76-cf6b-4e3f-a7c1-cb123676bb0c.png

        // 时间
        String dateTimePath = DateUtil.getFormatDateString(new Date(), "yyyyMMdd");

        // 上传位置
        // 设定文件保存的目录
        String path1 = "/data" + ContsantUtil.FilePath.file + "/" + dateTimePath + "/";
        
        //use query 
        String path2 =  ContsantUtil.FilePath.file + "/" + dateTimePath + "/";

        File f = new File(path1);
        if (!f.exists())
            f.mkdirs();

        for (int i = 0; i < files.length; i++)
        {
            // 获得原始文件名
            String fileName = files[i].getOriginalFilename();

            if (null == fileName || "".equals(fileName))
            {
                logger.info("文件名 empty or null, iteration next File:");
                continue;
            }
            logger.info("原始文件名:" + fileName);
            
            //get suffix
            int location = fileName.lastIndexOf(".");
            String suffix = fileName.substring(location);

            // 新文件名
            String newFileName = UUID.randomUUID().toString().replaceAll("-", "") + "" + suffix;// fileName;
            if (!files[i].isEmpty())
            {
                try
                {
                    FileOutputStream fos = new FileOutputStream(path1 + newFileName);
                    InputStream in = files[i].getInputStream();
                    int b = 0;
                    while ((b = in.read()) != -1)
                    {
                        fos.write(b);
                    }
                    fos.close();
                    in.close();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }

            logger.info("" + "上传图片到:" + path1 + newFileName);

            list.add(path2 + newFileName);
            
            map.put("orginalName", fileName);
            map.put("newName", newFileName);
            map.put("locationUrl", path2 + newFileName);

        }

        return map;

    }
}
