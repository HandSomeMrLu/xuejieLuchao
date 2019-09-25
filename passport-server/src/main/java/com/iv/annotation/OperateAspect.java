package com.iv.annotation;

import com.auth0.jwt.interfaces.Claim;
import com.iv.entity.RoleInfo;
import com.iv.entity.UserInfo;
import com.iv.exception.BusException;
import com.iv.service.UserInfoService;
import com.iv.util.JWTUtil;
import org.apache.commons.lang.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.List;

@Component
@Aspect
public class OperateAspect {

    @Autowired
    UserInfoService userInfoService;

    @Pointcut("@annotation(com.iv.annotation.Auth)")
    public void pointCut() {
    }

    @Before("pointCut()")
    public void before(JoinPoint joinPoint) throws Exception {



        MethodSignature sign =  (MethodSignature)joinPoint.getSignature();
        Method method = sign.getMethod();
        Auth auth = method.getDeclaredAnnotation(Auth.class);
        String[] value = auth.value();

        String userId = JWTUtil.getReqValue("userId");

        if (!StringUtils.isEmpty(userId)) {
            UserInfo userInfo = userInfoService.findUserInfo(Long.parseLong(userId));
            List<RoleInfo> roles = userInfo.getRoles();
            for (RoleInfo role : roles) {
                if ("admin".equals(role.getRole())) {
                    return;
                }
            }
        }
        throw new BusException("Error: No right");
    }
}
