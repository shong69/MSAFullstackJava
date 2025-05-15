package com.my.aop;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforePrint implements MethodBeforeAdvice{

	@Override // 해당 bean인 척 하기 위해 필요한 것들을 파라미터로 받고 있음
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println(method.getName()); //target 의 메소드 public abstract void com....func01()
		System.out.println(Arrays.deepToString(args)); // [1234]
		System.out.println(target); //com.my.module.module10
	}

}
