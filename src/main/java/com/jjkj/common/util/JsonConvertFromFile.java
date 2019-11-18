package com.jjkj.common.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class JsonConvertFromFile
{

    private JsonConvertFromFile()
    {
    }

    private static final Logger logger = LoggerFactory.getLogger(JsonConvertFromFile.class);

    public static void main(String[] args)
    {
        //		JsonConvertFromFile.readAsStringFromFile("src/main/resources/userandpass.json");
        //        JsonConvertFromFile.readAsStringFromFile("http://172.161.1.246:90/tree_data.json");
        //        JsonConvertFromFile.fileToString("http://172.161.1.246:90/tree_data.json");
        JsonConvertFromFile.fileToString("src/main/resources/userandpass.json");
    }

    public static String fileToString(String url)
    {

        String string = "";
        FileInputStream fis = null;
        try
        { 
            fis = new FileInputStream(url);
            byte[] data = new byte[1024];
            int i = 0;
            int n = fis.read();
            while (n != -1)
            {
                data[i] = (byte) n;
                i++;
                n = fis.read();
            }

            String s = new String(data, 0, i);
            string = s;

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fis.close();
            }
            catch (Exception e)
            {
            }
        }

        logger.info(string);
        return string;
    }

    /**
     * 
     *
     * 
     * 
     * @param args
     * 
     */

    public static String readAsStringFromFile(String fileUrl)
    {

        String str = "";


        JsonParser parser = new JsonParser();

        try
        {
 

            JsonObject object = (JsonObject) parser.parse(new FileReader(fileUrl));

            str = object.toString();
            logger.info(object.toString());
            

        }
        catch (JsonIOException e)
        {

            e.printStackTrace();

        }
        catch (JsonSyntaxException e)
        {

            e.printStackTrace();

        }
        catch (FileNotFoundException e)
        {

            e.printStackTrace();

        }
        return str;

    }

   

}
