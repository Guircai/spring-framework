package com.guircai.boot;

import com.guircai.boot.servlet.HelloServlet;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.Wrapper;
import org.apache.catalina.startup.Tomcat;

/**
 * 怎么启动起来？
 * Tomcat启动
 * SPI机制下 QuickAppStarter生效创建ioc容器配置 DispatcherServlet等各种组件
 *
 * 导入各种starter依赖，SpringBoot封装了很多的自动配置，帮我们给容器中放了很多组件
 * SpringBoot封装了功能的自动配置
 *
 * WebServerFactory做到了
 *
 * @author Guircai
 **/
public class Main {
	public static void main(String[] args) throws LifecycleException, InterruptedException {
		// 自己写Tomcat启动源码
		Tomcat tomcat = new Tomcat();

		tomcat.setPort(8888);
		tomcat.setHostname("localhost");
		tomcat.setBaseDir(".");

		// Tomcat的工作目录
		Context context = tomcat.addWebapp("/boot", System.getProperty("user.dir"));

		// DispatcherServlet
		// DispatcherServlet servlet = new DispatcherServlet();

		// 给Tomcat里面添加一个Servlet
//		Wrapper hello = tomcat.addServlet("/boot", "hello", new HelloServlet());
		// tomcat.addServlet("/boot", "hello", new HelloServlet());

//		hello.addMapping("/666");;// 指定处理的请求

		// 自己创建 DispatcherServlet 对象，并且创建ioc容器，DispatcherServlet里面的ioc容器
		// 启动Tomcat 注解版MVC利用Tomcat SPI机制
		tomcat.start();

		// 服务器等待
		tomcat.getServer().await();
	}
}
