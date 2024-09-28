package com.encapsulation;

public class EncapsulationEx
{
 private int id;
 private String name;
 
 public int getId()
 {
	 return id;
 }
 public void setId(int id)
 {
	 this.id = id;
 }
 public String getName()
 {
	 return name;
 }
 public void setName(String name)
 {
	 this.name =  name;
 }
 
 public static void main(String[]args)
 {
	 EncapsulationEx e1 = new EncapsulationEx();

	 e1.setId(2);
	 System.out.println(e1.getId());
	 
	 e1.setName("Karuna");
	 System.out.println(e1.getName());
 }
}
