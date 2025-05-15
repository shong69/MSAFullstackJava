package com.my.module;

public class Module10 implements MyModule2{

	public int su=9999;
	@Override
	public void func01() {
		System.out.println("run func01()...");
		
	}
	public void func02(int su) {
		System.out.println("run func02()..."+su);
		System.out.println("run func02()..."+this.su);
	}
	public String func03() {
		return "run func03()...";
	}
	public void func04() {
		System.out.println("run func04()...");
	}

}
