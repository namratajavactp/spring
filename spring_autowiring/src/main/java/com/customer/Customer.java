package com.customer;

public class Customer 
{
	private String name;
	private String address;
	private int age;
 
	public Customer(String name, String address, int age) {
		System.out.println("string,string,int called");
		this.name = name;
		this.address = address;
		this.age = age;
	}
 
	public Customer(String name, int age, String address) {
		System.out.println("string,int,string called");
		this.name = name;
		this.age = age;
		this.address = address;
	}
	//getter and setter methods
	public String toString(){
		return " name : " +name + "\n address : "
               + address + "\n age : " + age;
	}
 
}