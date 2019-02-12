package com.itecbrazil.acls.security;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;
import itec.security.auth.login.AuthFilter;
import itec.security.auth.login.AuthFilterImplCondition;

@Component
@Conditional(AuthFilterImplCondition.class)
public class AuthFilterImpl extends AuthFilter {

	@Override
	public void posLogin() {
	}

}
