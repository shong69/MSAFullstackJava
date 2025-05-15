package com.my.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundPrint implements MethodInterceptor {
//기존에는 springframework.aop..패키지를 상속받았지만
//around에서는 org.aopalliance.. 패키지를 상속받아야 한다.
//spring을 의존성으로 받으면 다른 aop 패키지가 같이 들어오지만 around는 들어오지 않기 때문에
//spring-aop 의존성을 따로 받아야 하는 이유
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("실행 전");
		Object obj = null;
		try {			
			obj=invocation.proceed(); //실행
		}catch (Exception e) {
			System.out.println("after err...");
		}
		System.out.println("after returning(+err)...");
		return obj;//수행 결과를 리턴
	}

}
