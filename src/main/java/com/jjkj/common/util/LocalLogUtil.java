package com.jjkj.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author jjkjdebby@gmail.com | jjkjli 2018年4月16日 上午10:29:49
 */
public class LocalLogUtil {

	// 包装 Hierarchical Domain
	private static String HIERARCHICAL_SET = PropertiesUtils.readProperties("/properties/application.properties",
			"HIERARCHICAL_SET");
	private static String DOMAIN_SET = PropertiesUtils.readProperties("/properties/application.properties",
			"DOMAIN_SET");

	private static final Logger logger;

	// /** 业务领域 */
	// public static String domain;
	// /** 作用层次 controller service */
	// public static String hierarchical;

	static {
		logger = LoggerFactory.getLogger(LocalLogUtil.class);
	}

	/**
	 * 
	 * @param msg
	 *            method Name
	 */
	public static void info_start(String msg) {

		info(HIERARCHICAL_SET, DOMAIN_SET, msg + ".. START ......");
	}

	/**
	 * 
	 * @param msg
	 *            method Name
	 */
	public static void info_end(String msg) {

		info(HIERARCHICAL_SET, DOMAIN_SET, msg + ".. END ......");
	}

	public static void info(String msg) {

		info(HIERARCHICAL_SET, DOMAIN_SET, msg);
	}

	public static void debug(String msg) {
		debug(HIERARCHICAL_SET, DOMAIN_SET, msg);
	}

	public static void warn(String msg) {
		warn(HIERARCHICAL_SET, DOMAIN_SET, msg);
	}

	public static void error(String msg) {
		error(HIERARCHICAL_SET, DOMAIN_SET, msg);
	}

	/**
	 * 
	 * @param domain
	 *            业务领域
	 * @param hierarchical
	 *            作用层次
	 */
	public static void info(String hierarchical, String domain, String msg) {
		if (null == domain) {
			domain = "";
		}
		if (null == hierarchical) {
			hierarchical = "";
		}
		if (null == msg) {
			msg = "";
		}
		logger.info("hierarchical in " + HIERARCHICAL_SET + " | domain in " + DOMAIN_SET + " | " + msg);
	}

	/**
	 * 
	 * @param domain
	 *            业务领域
	 * @param hierarchical
	 *            作用层次
	 */
	public static void debug(String hierarchical, String domain, String msg) {
		if (null == domain) {
			domain = "";
		}
		if (null == hierarchical) {
			hierarchical = "";
		}
		if (null == msg) {
			msg = "";
		}
		logger.info("hierarchical in " + HIERARCHICAL_SET + " | domain in " + DOMAIN_SET + " | " + msg);
	}

	/**
	 * 
	 * @param domain
	 *            业务领域
	 * @param hierarchical
	 *            作用层次
	 */
	public static void warn(String hierarchical, String domain, String msg) {
		if (null == domain) {
			domain = "";
		}
		if (null == hierarchical) {
			hierarchical = "";
		}
		if (null == msg) {
			msg = "";
		}
		logger.warn("hierarchical in " + HIERARCHICAL_SET + " | domain in " + DOMAIN_SET + " | " + msg);
	}

	/**
	 * 
	 * @param domain
	 *            业务领域
	 * @param hierarchical
	 *            作用层次
	 */
	public static void error(String hierarchical, String domain, String msg) {
		if (null == domain) {
			domain = "";
		}
		if (null == hierarchical) {
			hierarchical = "";
		}
		if (null == msg) {
			msg = "";
		}
		logger.error("hierarchical in " + HIERARCHICAL_SET + " | domain in " + DOMAIN_SET + " | " + msg);
	}

	public static void main(String[] args) {

		// LocalUtil.debug("method ");
		// LocalUtil.info_start("queryMerchantsAuditResult");
		System.out.println("REDIS_VERIFICATION_CODE_KEY");
	}
}
