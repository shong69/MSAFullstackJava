package com.my.service;

import com.my.module.Module01;
import com.my.module.MyModule;

public class Service01 {
	MyModule module;
	public Service01() {
	}
	public Service01(MyModule module) {
		this.module = module;
	}
	
	
	/** Ioc -> DI 객체 주입 받기
	 * @param module
	 */
	public void setModule(MyModule module) {
		this.module = module;
	}
	public void serv01() {
		
	}
	
	public void serv01(MyModule my) {
		MyModule module = my;
		module.func01();
	}
}
