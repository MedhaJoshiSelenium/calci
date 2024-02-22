package com.calci;

public class Calci {
private int num1;
private int num2;
public Calci() {
	
}
public Calci(int num1, int num2) {
	super();
	this.num1 = num1;
	this.num2 = num2;
}

public int add() {
	return num1+num2;
	
}
public int sub() {
	return num1-num2;
	
}
public int multi() {
	int x=5;
	return num1*num2;
	
}
public int div() {
	return num1/num2;
	
}
public int mod() {
	int k=10;
	return num1%num2;
	
}

}
