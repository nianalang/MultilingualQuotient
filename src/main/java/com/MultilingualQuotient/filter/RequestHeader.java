package com.MultilingualQuotient.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class RequestHeader implements HandlerInterceptor{
	/**
	 * afterHandler : 在执行Handler完成后执行此方法，使用于统一的异常处理，统一的日志处理等；
	 */
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {

	}

	/**
	 * postHandler :
	 * 进入Handler方法之后，返回ModelAndView之前执行，使用场景从ModelAndView参数出发，比如，将公用的模型数据在这里传入到视图，也可以统一指定显示的视图等；
	 */
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {

	}
	/**
	 * 在进入Handler方法之前执行了，使用于身份认证，身份授权，登陆校验等，比如身份认证，用户没有登陆，拦截不再向下执行，返回值为 false
	 * ，即可实现拦截；否则，返回true时，拦截不进行执行；
	 */
	public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object arg2) throws Exception {	
		  httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");  
		  
	        httpServletResponse.setHeader("Access-Control-Allow-Headers", "Content-Type,Content-Length, Authorization, Accept,X-Requested-With");  
	  
	        httpServletResponse.setHeader("Access-Control-Allow-Methods","PUT,POST,GET,DELETE,OPTIONS");  
	  
	        httpServletResponse.setHeader("X-Powered-By","Jetty");  
	  
	  
	        String method= httpServletRequest.getMethod();  
	  
	        if (method.equals("OPTIONS")){  
	            httpServletResponse.setStatus(200);  
	            return false;  
	        }  
	  
	        return true;  
	}

	
	
}
