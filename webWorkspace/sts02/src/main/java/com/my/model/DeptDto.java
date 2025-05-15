package com.my.model;

public class DeptDto {
	private int deptno;
	private String dname, log;
	public DeptDto() {
		// TODO Auto-generated constructor stub
	}
	
	public DeptDto(int deptno, String dname, String log) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.log = log;
	}

	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
	}

	@Override
	public String toString() {
		return "DeptDto [deptno=" + deptno + ", dname=" + dname + ", log=" + log + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + deptno;
		result = prime * result + ((dname == null) ? 0 : dname.hashCode());
		result = prime * result + ((log == null) ? 0 : log.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DeptDto other = (DeptDto) obj;
		if (deptno != other.deptno)
			return false;
		if (dname == null) {
			if (other.dname != null)
				return false;
		} else if (!dname.equals(other.dname))
			return false;
		if (log == null) {
			if (other.log != null)
				return false;
		} else if (!log.equals(other.log))
			return false;
		return true;
	}
	
}
