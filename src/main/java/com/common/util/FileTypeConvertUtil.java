package com.common.util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.UUID;

import org.xhtmlrenderer.pdf.ITextFontResolver;
import org.xhtmlrenderer.pdf.ITextRenderer;

import com.itextpdf.text.pdf.BaseFont;

/**
 * 文件格式转换工具类
 *java实现HTML转PDF

https://my.oschina.net/960823/blog/1588166
 */
public class FileTypeConvertUtil
{

    /**
     * 将HTML转成PD格式的文件。html文件的格式比较严格
     * 
     * @param htmlFile
     * @param pdfFile
     * @throws Exception
     */
    // <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
    // "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd ">
    public static void html2pdf(String htmlFile, String pdfFile) throws Exception
    {
        // step 1
        String url = new File(htmlFile).toURI().toURL().toString();
        System.out.println(url);
        // step 2
        OutputStream os = new FileOutputStream(pdfFile);
        ITextRenderer renderer = new ITextRenderer();
        renderer.setDocument(url);

        // step 3 解决中文支持
        ITextFontResolver fontResolver = renderer.getFontResolver();
        if ("linux".equals(getCurrentOperatingSystem()))
        {
            fontResolver.addFont("/usr/share/fonts/chiness/simsun.ttc", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
        }
        else
        {
            fontResolver.addFont("c:/Windows/Fonts/simsun.ttc", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
        }

        renderer.layout();
        renderer.createPDF(os);
        os.close();

        System.out.println("create pdf done!!");

    }

    public static void html2pdfDirectURL(String url, String pdfFile) throws Exception
    {
        // step 1
        // String url = new File(htmlFile).toURI().toURL().toString();
        System.out.println(url);
        // step 2
        OutputStream os = new FileOutputStream(pdfFile);
        ITextRenderer renderer = new ITextRenderer();
        renderer.setDocument(url);

        // step 3 解决中文支持
        // ITextFontResolver fontResolver = renderer.getFontResolver();
        // if("linux".equals(getCurrentOperatingSystem())){
        // fontResolver.addFont("/usr/share/fonts/chiness/simsun.ttc",
        // BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
        // }else{
        // fontResolver.addFont("c:/Windows/Fonts/simsun.ttc",
        // BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
        // }

        renderer.layout();
        renderer.createPDF(os);
        os.close();

        System.out.println("create pdf done!!");

    }

    public static String getCurrentOperatingSystem()
    {
        String os = System.getProperty("os.name").toLowerCase();
        System.out.println("---------当前操作系统是-----------" + os);
        return os;
    }

    public static void main(String[] args)
    {
        // String htmlFile = "/home/lbj/sign.jsp";
        // String pdfFile = "/home/lbj/sign.pdf";
        // String htmlFile = "d:/table.html";
        String htmlFile = "d:/table.html";
        // String pdfFile = "d:/testoone2.pdf";
        // String pdfFile = "d:/emailpdf/"+UUID.randomUUID().toString()+".pdf";

        File file = new File("d:/emailpdf");
        // 如果文件夹不存在则创建
        if (!file.exists() && !file.isDirectory())
        {
            System.out.println("//不存在");
            file.mkdir();
        }
        else
        {
            System.out.println("//目录存在");
        }

        String pdfFile = "d:/emailpdf/" + UUID.randomUUID().toString() + ".pdf";

        try
        {
            // FileTypeConvertUtil.html2pdf(htmlFile, pdfFile);
//            FileTypeConvertUtil.html2pdfDirectURL("http://tools.haohaods.com:999/table.html", pdfFile);
//            FileTypeConvertUtil.html2pdfDirectURL("http://tools.haohaods.com:999/table1.html", pdfFile);
            FileTypeConvertUtil.html2pdfDirectURL("http://192.168.0.167", pdfFile);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println("localtion =  " + pdfFile);
    }
    
    
  //读取文件到byte[]
    private static byte[] getFileBytes(String file) {
        try {
            File f = new File(file);
            int length = (int) f.length();
            byte[] data = new byte[length];
            new FileInputStream(f).read(data);
            return data;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
//    https://blog.csdn.net/lemisky/article/details/99329625
    public static byte[] getBytesByFile(String filePath) {
        try {
            File file=new File(filePath);
            //获取输入流
            FileInputStream fis = new FileInputStream(file);
 
            //新的 byte 数组输出流，缓冲区容量1024byte
            ByteArrayOutputStream bos = new ByteArrayOutputStream(1024);
            //缓存
            byte[] b = new byte[1024];
            int n;
            while ((n = fis.read(b)) != -1) {
                bos.write(b, 0, n);
            }
            fis.close();
            //改变为byte[]
            byte[] data = bos.toByteArray();
            //
            bos.close();
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
