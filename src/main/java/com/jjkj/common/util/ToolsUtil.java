package com.jjkj.common.util;

import java.io.IOException;
import java.net.URL;

public class ToolsUtil
{
    /**
     * 获取配置文件中的json字符串
     */
    public static String profitUserAndPassConfigJson(String url)
    {

        String profitConfigJson = "";
        try
        {
            // String fileName =
            // ToolsUtil.class.getClassLoader().getResource("/").toURI().getPath()
            // + "/profit_config.txt";

            ClassLoader classLoader = ToolsUtil.class.getClassLoader();
            URL resource = classLoader.getResource(url);
            String path = resource.getPath();
            String fileName = path;

            // String fileName =
            // ToolsUtil.class.getClassLoader().getResource("/").toURI().getPath()
            // + "com/kye/api/META-INF/accessControl.txt";
            profitConfigJson = FileUtil.readFile(fileName);
        }
        catch (IOException e)
        {
            profitConfigJson = "";
        }
        return profitConfigJson;
    }

    /**
     * 获取配置文件中的json字符串
     */
    private static String profitConfigJson()
    {

        String profitConfigJson = "";
        try
        {
            // String fileName =
            // ToolsUtil.class.getClassLoader().getResource("/").toURI().getPath()
            // + "/profit_config.txt";

            ClassLoader classLoader = ToolsUtil.class.getClassLoader();
            URL resource = classLoader.getResource("profit_config.txt");
            String path = resource.getPath();
            String fileName = path;

            // String fileName =
            // ToolsUtil.class.getClassLoader().getResource("/").toURI().getPath()
            // + "com/kye/api/META-INF/accessControl.txt";
            profitConfigJson = FileUtil.readFile(fileName);
        }
        catch (IOException e)
        {
            profitConfigJson = "";
        }
        return profitConfigJson;
    }

    public static void main(String[] args)
    {

        // List<DefinedProfitConfigVO> a=getProfitConfigFromJson();
        //
        // System.out.println(profitConfigJson());

        //		List<DefinedProfitConfigVO> a = getProfitConfigFromJson(14);

        System.out.println(ToolsUtil.profitUserAndPassConfigJson("src\\main\\resources\\userandpass.json"));
    }

    //	/**
    //	 * 
    //	 * @Title: getProfitConfigFromJson 
    //	 * @Description: 传入位置，找出相应的建立人，顺序 [0]规划师 [1]经理 [2] 总监
    //	 * @param location
    //	 * @return
    //	 * @return: List<DefinedProfitConfigVO>
    //	 */
    //	public static  List<DefinedProfitConfigVO> getProfitConfigFromJson(Integer location) {
    //		List<DefinedProfitConfigVO> definedProfitConfigVOs = new ArrayList<DefinedProfitConfigVO>();
    //
    //		JSONArray array = JSONArray.fromObject(profitConfigJson());
    //
    //		for (int i = 0; i < array.size(); i++) {
    //			JSONObject rs = (JSONObject) array.get(i);
    //			DefinedProfitConfigVO aobj = (DefinedProfitConfigVO) JSONObject.toBean(rs, DefinedProfitConfigVO.class);
    //
    //			int a = location;
    //			int b = aobj.getRechargeMan();
    //			
    //			if (a == b) {
    //				List<String> profitManList = new ArrayList<>();
    //				profitManList = new ArrayList<>(Arrays.asList(aobj.getProfitMan().split(",")));
    //
    //				aobj.setProfitManList(profitManList);
    //				definedProfitConfigVOs.add(aobj);
    //
    //				break;
    //			}
    //
    //		}
    //
    //		return definedProfitConfigVOs;
    //	}

    //	/**
    //	 * 
    //	 * @Title: getProfitConfigFromJson
    //	 * @Description: 读取建立配置
    //	 * @return
    //	 * @return: List<DefinedProfitConfigVO>
    //	 */
    //	private static List<DefinedProfitConfigVO> getProfitConfigFromJson() {
    //		List<DefinedProfitConfigVO> definedProfitConfigVOs = new ArrayList<DefinedProfitConfigVO>();
    //
    //		JSONArray array = JSONArray.fromObject(profitConfigJson());
    //
    //		for (int i = 0; i < array.size(); i++) {
    //			JSONObject rs = (JSONObject) array.get(i);
    //			DefinedProfitConfigVO aobj = (DefinedProfitConfigVO) JSONObject.toBean(rs, DefinedProfitConfigVO.class);
    //
    //			List<String> profitManList = new ArrayList<>();
    //			profitManList = new ArrayList<>(Arrays.asList(aobj.getProfitMan().split(",")));
    //
    //			aobj.setProfitManList(profitManList);
    //			definedProfitConfigVOs.add(aobj);
    //		}
    //
    //		return definedProfitConfigVOs;
    //	}
}
