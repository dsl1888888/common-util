package com.jjkj.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogBasicUtil {

	private LogBasicUtil() {
	}

	private static final Logger logger;

	static {
		logger = LoggerFactory.getLogger(LogBasicUtil.class);
	}

	public static void info(String msg) {

		if (null == msg) {
			msg = "";
		}
		logger.info(msg);
	}

	public static void debug(String msg) {

		logger.info(msg);
	}

	public static void warn(String msg) {

		logger.info(msg);
	}

	public static void error(String msg) {
		logger.info(msg);
	}

	public static void infoMethodStart(String method) {

		if (null == method) {
			method = "";
		}
		logger.info(" Method " + method + " start....");
	}

	public static void infoMethodEnd(String method) {

		if (null == method) {
			method = "";
		}
		logger.info(" Method " + method + " end....");
	}
}
