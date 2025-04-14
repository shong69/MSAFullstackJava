package com.pm.test;

public class Student implements Comparable<Student>{
	private int id;
	private int lang;
	private int eng;
	private int math;
	
	private int avgScore;
	private int totalScore;
	
	private boolean isDel=false; 
	public Student() {}
	public Student(int id, int lang, int eng, int math) {
		this.id = id;
		this.lang = lang;
		this.eng = eng;
		this.math = math;
		
		this.avgScore = (lang + eng + math)/3;
		this.totalScore = lang + eng + math;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLang() {
		return lang;
	}
	public void setLang(int lang) {
		this.lang = lang;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getAvgScore() {
		return avgScore;
	}

	public int getTotalScore() {
		return totalScore;
	}
	

	public void setAvgScore(int avgScore) {
		this.avgScore = avgScore;
	}
	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}
	public boolean isDel() {
		return isDel;
	}
	public void setDel(boolean isDel) {
		this.isDel = isDel;
	}
	
	@Override
	public int compareTo(Student o) {
		return o.totalScore - this.totalScore;
	}
}
