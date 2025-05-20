package com.my.sts.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAop {
	
//	@Before("execution(* com.my.sts.service.*.func*(..))")
	public void beforeMethod(JoinPoint join) {
		System.out.println("진짜 수행 전..");
		//Advice와 같이 매개변수를 받아주는 JoinPoint 
		//this
		Object obj = join.getThis();
		//args
		Object[] args=join.getArgs();
		//name
		String name = join.getSignature().getName();
		System.out.println(name);
	}
//	@AfterReturning( returning = "val",pointcut = "execution(* com.my.sts.service.*.func*(..))")
	public void afterReturn(JoinPoint join, Object val) { //context파일에서 val을 returning의 값으로 지정해줌
		//cut의 return 값 출력
		System.out.println("진짜 수행 후..성공"+ val); 
	}
//	@AfterThrowing(throwing = "ex",pointcut = "execution(* com.my.sts.service.*.func*(..))")
	public void afterError(JoinPoint join, Exception ex) {
		//Exception 에러 메세지 출력
		System.out.println("진짜 수행 후..실패"+ex.getLocalizedMessage());
	}
//	@After("execution(* com.my.sts.service.*.func*(..))")
	public void afterMethod() {
		System.out.println("진짜 수행 후");
	}
	
	@Around("execution(* com.my.sts.service.*.func*(..))")
//	around에서는 ProceedingJoinPoing를 통해 join을 가져올 수 있다. join.proceed()를 기준으로 이전과 이후로 나뉜다. 
	public  Object around(ProceedingJoinPoint join) {
		System.out.println("before...");
		Object obj=null;
		try {
			obj= join.proceed();
			System.out.println("after success...");
		} catch (Throwable e) {
			System.out.println("after error...");
			e.printStackTrace();
		}
		System.out.println("after...");
		return obj;
	}
}
