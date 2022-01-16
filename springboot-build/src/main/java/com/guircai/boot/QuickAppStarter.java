package com.guircai.boot;

import com.guircai.boot.config.SpringConfig;
import com.guircai.boot.config.SpringMVCConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 最快速的整合注解版SpringMVC和Spring的
 *
 * @author Guircai
 **/
public class QuickAppStarter extends AbstractAnnotationConfigDispatcherServletInitializer {

	// 根容器的配置（Spring的配置文件===Spring的配置类）
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[]{SpringConfig.class};
	}

	// web容器的配置（SpringMVC的配置文件===SpringMVC的配置类）
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[]{SpringMVCConfig.class};
	}

	// Servlet的映射，DispatcherServlet的映射路径
	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}
}
