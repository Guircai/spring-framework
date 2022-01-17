package com.guircai.web.config;

import com.guircai.web.view.MeiNvViewResolver;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DelegatingWebMvcConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * 容器中有 WebMvcConfigurer 类型的组件（@Component\@Configuration）
 * 	不要这个注解回到以前默认模式，所有组件 DispatcherServlet初始化的时候没有，直接用配置文件中指定的默认的组件
 * 	没有预留拓展接口，需要我们自己重新替换
 * 1、WebMvcComfigurer+@EnableWebMvc 定制和拓展SpringMVC功能
 * 2、@EnableWebMvc导入的类会加入SpringMVC的很多核心组件，拥有默认功能
 * 3、这些默认功能在拓展的时候给接口 WebMvcConfigurer（访问者，拿到真正的内容进行修改）可以介入
 * 4、MeiNvViewResolver+InternalResourceViewResolver
 * 5、@EnableWebMvc开启了SpringMVC == <mvc:annotation-driven/>，即使是以前自己也要配置默认视图解析器
 *
 * @author Guircai
 **/
@EnableWebMvc // 启用SpringMVC功能，能修改SpringMVC底层行为就会很方便只需要实现 WebMvcConfigurer即可
@Configuration
public class MvcExtendConfiguration implements WebMvcConfigurer {

	/**
	 * 配置视图解析器，升级了这个组件的功能
	 *
	 * @param registry
	 */
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		// 另外一种
		// MvcExtendConfiguration extends DelegatingWebMvcConfiguration
		// 1、拿到父类@Bean的方法，还是给容器中放了组件
		// 2、只是为了实现一个效果，就是让 DelegatingWebMvcConfiguration 的类或者子类在容器
		// 3、只要这个 DelegatingWebMvcConfiguration 生效，他从容器中拿到所有的configure进行
		registry.viewResolver(new MeiNvViewResolver()); // 判断美女
		// 完全改变	没有 InternalResourceViewResolver

		// 不修改源码如下操作
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("");
		viewResolver.setSuffix(".jsp"); // controller的返回值就不用写jsp
		registry.viewResolver(viewResolver);
	}
}
