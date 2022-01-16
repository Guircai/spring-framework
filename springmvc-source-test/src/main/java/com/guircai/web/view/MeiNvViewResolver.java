package com.guircai.web.view;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

/**
 * @author Guircai
 **/
@Order // SpringBoot整合的时候，自定义视图解析器最好制定顺序
@Component
public class MeiNvViewResolver implements ViewResolver {

	@Override
	public View resolveViewName(String viewName, Locale locale) throws Exception {
		// 我们直解析 meinv
		if (viewName.startsWith("meinv:")) {
			return new MeiNvView();
		}
		return null;
	}
}
