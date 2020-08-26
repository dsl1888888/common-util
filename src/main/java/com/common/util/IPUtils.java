package com.common.util;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;

public class IPUtils {
	
	public static String getMyIp()   {
		
		try {
			if (isWin()) {
				return getWinIP();
			}
			return getLinuxIP();
		} catch (Exception e) { 
			
			return "127.0.0.1";
		}finally { 
		}
		
		
	}

	private static String getWinIP() throws UnknownHostException {
		InetAddress ia = InetAddress.getLocalHost();
		return ia.getHostAddress();
	}

	private static String getLinuxIP() throws SocketException {
		Enumeration<NetworkInterface> allNetInterfaces = NetworkInterface.getNetworkInterfaces();
		InetAddress ia = null;
		while (allNetInterfaces.hasMoreElements()) {
			NetworkInterface netInterface = allNetInterfaces.nextElement();
			Enumeration<InetAddress> addresses = netInterface.getInetAddresses();
			while (addresses.hasMoreElements()) {
				ia = addresses.nextElement();
				if ((ia != null) && ((ia instanceof Inet4Address))) {
					return ia.getHostAddress();
				}
			}
		}
		return null;
	}

	public static boolean isWin() {
		String osName = System.getProperty("os.name").toUpperCase();
		if (osName.indexOf("WIN") > -1) {
			return true;
		}
		return false;
	}
}
