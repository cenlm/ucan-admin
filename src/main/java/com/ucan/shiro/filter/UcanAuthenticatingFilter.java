package com.ucan.shiro.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

/**
 * 集成认证访问权限和rememberMe的过滤功能
 * 
 * @Description:
 * @author liming.cen
 * @date 2024-07-05 14:59:41
 * 
 */
public class UcanAuthenticatingFilter extends FormAuthenticationFilter {
    /**
     * 合并（authc、user）FormAuthenticationFilter、UserFilter的访问权限控制功能
     */
    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
        Subject subject = getSubject(request, response);
        boolean isAccessAllowed = false;
        // 当前用户是否已认证？
        boolean authenticated = subject.isAuthenticated();
        PrincipalCollection principals = subject.getPrincipals();
        // 用户已认证且principal不为空
        if (authenticated && principals != null && !principals.isEmpty()) {
            isAccessAllowed = true;
        } else if (!isLoginRequest(request, response) && isPermissive(mappedValue)) {
            isAccessAllowed = true;
        } else if (subject.isRemembered()) {// 用户已启用rememberMe功能，新用户，未认证
//            if (isLoginRequest(request, response)) {// 登录请求直接放行
//                isAccessAllowed = true;
//            }
            isAccessAllowed = true;
        }
        return isAccessAllowed;
    }

    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
        return super.onAccessDenied(request, response);
    }

}
