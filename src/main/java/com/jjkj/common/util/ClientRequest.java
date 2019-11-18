package com.jjkj.common.util;

public class ClientRequest<T> extends BaseRequest<T>
{

    private String uuid;

    public String getUuid()
    {
        return uuid;
    }

    public void setUuid(String uuid)
    {
        this.uuid = uuid;
    }

    public static void main(String[] args)
    {
        ClientRequest<String> sClientRequest = new ClientRequest<>();

        sClientRequest.setData("aaaaaaaaa");
        sClientRequest.setUuid("uuuuid");

        System.out.println(sClientRequest.toString());
    }

}
