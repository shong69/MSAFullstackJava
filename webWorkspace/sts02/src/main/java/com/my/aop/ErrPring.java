package com.my.aop;

import org.springframework.aop.ThrowsAdvice;

public class ErrPring implements ThrowsAdvice {
	public void afterThrowing(Exception ex) {
		System.out.println("===========================");
	}
}
