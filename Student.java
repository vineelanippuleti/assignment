package com.example.StudentMarks.domain;

public class Student {
	private String stname;
	private  int m1;
	private int m2;
	private int m3;
	private  int n1;
	private int n2;
	private int n3;
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	public int getN3() {
		return n3;
	}
	public void setN3(int n3) {
		this.n3 = n3;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	public int getTotal()
	{
		return m1+m2+n3;
	}
	public int getAvg()
	{
		return (m1+m2+m3)/3;
	}
	public int getTotall()
	{
		return n1+n2+n3;
	}
	public int getAvg1()
	{
		return (n1+n2+n3)/3;
	}
	

}
