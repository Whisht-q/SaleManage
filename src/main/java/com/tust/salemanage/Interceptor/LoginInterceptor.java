package com.tust.salemanage.Interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 获取请求的路径
        String requestURI = request.getRequestURI();

        if ("/".equals(requestURI) || "/login".equals(requestURI)) {
            return true;
        }

        Object username = request.getSession().getAttribute("username");
        if (username == null){
            request.getSession().setAttribute("message","请先登录");
            response.sendRedirect("/login");
            return false;
        }
        // 其他请求路径都拦截，重定向到登录页
        return true; // 返回 false 表示拦截该请求
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        // 请求处理后，视图渲染前执行的逻辑，可以为空
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        // 请求处理完成后执行，可以为空
    }
}
