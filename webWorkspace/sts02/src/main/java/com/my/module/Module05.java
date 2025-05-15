package com.my.module;

import java.util.Properties;
import java.util.Set;

import org.apache.log4j.Logger;

public class Module05 implements MyModule {
	Logger logger = Logger.getLogger(getClass());
	Properties props;
	public void setProps(Properties props) {
		this.props = props;
	}
	@Override
	public void func01() {
		//DEBUg<INFO<WARN<ERROR<FATAL
		logger.debug(props);//debug 레벨로 로그 출력
		logger.info(props);
		logger.warn(props);
		logger.error(props);
		logger.fatal(props);

	}

}
