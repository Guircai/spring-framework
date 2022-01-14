package com.guircai.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * SpringMVC只扫描controller组件
 *
 * @author Guircai
 **/
@ComponentScan(value = "com.guircai.web", includeFilters = {
		@ComponentScan.Filter(type = FilterType.ANNOTATION, value = Controller.class)
}, useDefaultFilters = false)
@Configuration
public class SpringMVCConfig {
	// SpringMVC的子容器，能扫描到Spring中的组件
}
