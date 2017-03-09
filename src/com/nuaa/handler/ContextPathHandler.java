package com.nuaa.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jfinal.handler.Handler;
import com.jfinal.kit.StrKit;

public class ContextPathHandler extends Handler {

	private String contextPathName;

	public ContextPathHandler() {
		contextPathName = "CONTEXT_PATH";
	}

	public ContextPathHandler(String contextPathName) {
		if (StrKit.isBlank(contextPathName)) {
			throw new IllegalArgumentException("contextPathName can not be blank.");
		}
		this.contextPathName = contextPathName;
	}

	@Override
	public void handle(String target, HttpServletRequest request, HttpServletResponse response, boolean[] isHandled) {
		request.setAttribute(contextPathName, request.getContextPath());
		next.handle(target, request, response, isHandled);
	}

}
