package com.jjkj.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jjkj.common.enums.DomainEnum;
import com.jjkj.common.enums.HierarchicalEnum;

public class LogUtil {

	// private LogUtil() {
	// }

	private static final Logger logger;

	public static String domain;

	public static String hierarchical;

	static {
		logger = LoggerFactory.getLogger(LogUtil.class);
	}

	public static void info(String msg) {
		if (null == domain) {
			domain = "";
		}
		if (null == hierarchical) {
			hierarchical = "";
		}
		if (null == msg) {
			msg = "";
		}
		logger.info("hierarchical in " + hierarchical + " | domain in " + domain + " | " + msg);
	}

	public static void debug(String msg) {
		if (null == domain) {
			domain = "";
		}
		if (null == hierarchical) {
			hierarchical = "";
		}
		if (null == msg) {
			msg = "";
		}
		logger.info("hierarchical in " + hierarchical + " | domain in " + domain + " | " + msg);
	}

	public static void warn(String msg) {
		if (null == domain) {
			domain = "";
		}
		if (null == hierarchical) {
			hierarchical = "";
		}
		if (null == msg) {
			msg = "";
		}
		logger.info("hierarchical in " + hierarchical + " | domain in " + domain + " | " + msg);
	}

	public static void error(String msg) {
		if (null == domain) {
			domain = "";
		}
		if (null == hierarchical) {
			hierarchical = "";
		}
		if (null == msg) {
			msg = "";
		}
		logger.info("hierarchical in " + hierarchical + " | domain in " + domain + " | " + msg);
	}

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
		logger.info("hierarchical in " + hierarchical + " | domain in " + domain + " | " + msg);
	}

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
		logger.info("hierarchical in " + hierarchical + " | domain in " + domain + " | " + msg);
	}

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
		logger.warn("hierarchical in " + hierarchical + " | domain in " + domain + " | " + msg);
	}

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
		logger.error("hierarchical in " + hierarchical + " | domain in " + domain + " | " + msg);
	}

	public static void main(String[] args) {

		// demo

		LogUtil.info(HierarchicalEnum.REST.name(), DomainEnum.SSO.name(), "msg");
		LogUtil.debug(HierarchicalEnum.REST.name(), DomainEnum.SSO.name(), "msg");
		LogUtil.warn(HierarchicalEnum.REST.name(), DomainEnum.SSO.name(), "msg");
		LogUtil.error(HierarchicalEnum.REST.name(), DomainEnum.SSO.name(), "msg");

		// LogUtil logUtil=new LogUtil();
		// logUtil.setDomain(DomainEnum.SSO.name());
		// logUtil.setHierarchical(HierarchicalEnum.REST.name());
		//
		//
		// logUtil.info("msg ��Ϣ ");

		// LogUtil logUtil=new LogUtil();
		LogUtil.setDomain(DomainEnum.SSO.name());
		LogUtil.setHierarchical(HierarchicalEnum.REST.name());

		LogUtil.info("msg  aaaaaaaa ");

		// local util ,��ȡ �����ļ��� ������, Ȼ����� ��־

		// logger.info(msg);
		//
		// logger.info(msg);
		//
		// logger.error(msg);
		//
		// logger.warn(msg);

	}

	public static String getDomain() {
		return domain;
	}

	public static void setDomain(String domain) {
		LogUtil.domain = domain;
	}

	public static String getHierarchical() {
		return hierarchical;
	}

	public static void setHierarchical(String hierarchical) {
		LogUtil.hierarchical = hierarchical;
	}

}
