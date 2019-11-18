package com.common.util;


import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import com.github.pagehelper.StringUtil;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author zhumaer
 * @since 6/20/2017 16:37 PM
 */
@Slf4j
public class IpUtil {
 

    private static final String ipPattern = "^(?:(?:[01]?\\d{1,2}|2[0-4]\\d|25[0-5])\\.){3}(?:[01]?\\d{1,2}|2[0-4]\\d|25[0-5])\\b";

    public static String getIpAddr(HttpServletRequest request) {
        String ip = "127.0.0.1";
        if (request != null) {
            ip = request.getHeader("x-forwarded-for");
            if (StringUtil.isEmpty(ip) || "unknown".equalsIgnoreCase(ip)) {
                ip = request.getHeader("Proxy-Client-IP");
            }

            if (StringUtil.isEmpty(ip) || "unknown".equalsIgnoreCase(ip)) {
                ip = request.getHeader("WL-Proxy-Client-IP");
            }

            if (StringUtil.isEmpty(ip) || "unknown".equalsIgnoreCase(ip)) {
                ip = request.getRemoteAddr();
            }
        }
        return ip;

    }

    public static String getRealIp(HttpServletRequest request) {
        String ip = "127.0.0.1";
        if (request == null) {
            return ip;
        }

        ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
            if (ip.equals("127.0.0.1") || ip.equals("0:0:0:0:0:0:0:1")) {
                InetAddress inet = null;
                try {
                    inet = InetAddress.getLocalHost();
                    ip = inet.getHostAddress();
                } catch (UnknownHostException e) {
                    log.error("getRealIp occurs error, caused by: ", e);
                }
            }
        }

        if (ip != null && ip.length() > 15) { //"***.***.***.***".length() = 15  
            if (ip.indexOf(",") > 0) {
                ip = ip.substring(0, ip.indexOf(","));
            }
        }
        return ip;
    }

    /**
     */
    public static String getServiceIp() {
        Enumeration<NetworkInterface> netInterfaces = null;
        String ipsStr = "";

        try {
            netInterfaces = NetworkInterface.getNetworkInterfaces();
            while (netInterfaces.hasMoreElements()) {
                NetworkInterface ni = netInterfaces.nextElement();
                Enumeration<InetAddress> ips = ni.getInetAddresses();
                Pattern pattern = Pattern.compile(ipPattern);
                while (ips.hasMoreElements()) {
                    String ip = ips.nextElement().getHostAddress();
                    Matcher matcher = pattern.matcher(ip);
                    if (matcher.matches() && !ip.equals("127.0.0.1")) {
                        ipsStr = ip;
                    }
                }
            }
        } catch (Exception e) {
            log.error("getServiceIp occurs error, caused by: ", e);
        }

        return ipsStr;
    }

}