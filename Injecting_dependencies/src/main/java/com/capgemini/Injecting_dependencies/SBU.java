package com.capgemini.Injecting_dependencies;


import java.util.Arrays;
import java.util.List;

public class SBU {
private int sbuId;
private String sbuName;

private String sbuHead;


public SBU()
{
	
}
public SBU(int sbuId, String sbuName, String sbuHead) {
	this.sbuId = sbuId;
	this.sbuName = sbuName;
	this.sbuHead = sbuHead;
}

public int getSbuId() {
	return sbuId;
}

public void setSbuId(int sbuId) {
	this.sbuId = sbuId;
}

public String getSbuName() {
	return sbuName;
}

public void setSbuName(String sbuName) {
	this.sbuName = sbuName;
}

public String getSbuHead() {
	return sbuHead;
}

public void setSbuHead(String sbuHead) {
	this.sbuHead = sbuHead;
}

@Override
public String toString() {
	return "SBU [sbuId=" + sbuId + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + ", emp=" + emp + "]";
}

public String toString1() {
	return "SBU [sbuId=" + sbuId + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead +  "]";
}

List<Employee> emp=Arrays.asList(
		new Employee(1,"shiva",52000,"product",22),
		new Employee(2,"satya",42000,"sales",24));



}
