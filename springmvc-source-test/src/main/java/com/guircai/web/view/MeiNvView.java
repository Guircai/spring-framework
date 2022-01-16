package com.guircai.web.view;

import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author Guircai
 **/
public class MeiNvView implements View {

	// 自定义渲染逻辑
	@Override
	public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setCharacterEncoding("UTF-8");
		// response.setContentType("text/html;charset=utf-8");
		StringBuffer stringBuffer = new StringBuffer();
		String name = request.getParameter("name");
		stringBuffer.append("<h1>"+ name +"</h1>");
		stringBuffer.append("<h1>"+ model.get("info") +"</h1>");
		stringBuffer.append("<img src='https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fc-ssl.duitang.com%2Fuploads%2Fitem%2F202007%2F15%2F20200715215528_CBVcn.thumb.1000_0.jpeg&refer=http%3A%2F%2Fc-ssl.duitang.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1644898548&t=eca25acdc85afa2a405e2dfc0363fa25'>");

		response.getWriter().write(stringBuffer.toString());
	}
}
