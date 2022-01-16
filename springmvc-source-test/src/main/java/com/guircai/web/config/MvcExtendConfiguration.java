package com.guircai.web.config;

import com.guircai.web.view.MeiNvViewResolver;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 容器中有 WebMvcConfigurer 类型的组件（@Component\@Configuration）
 *
 * @author Guircai
 **/
@EnableWebMvc // 启用SpringMVC功能
@Configuration
public class MvcExtendConfiguration implements WebMvcConfigurer {

	@Override // 配置视图解析器
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.viewResolver(new MeiNvViewResolver());
	}
}
