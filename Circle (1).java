package com.encapsulation;
import java.util.Scanner;

public class Circle 
{

  private double radius;
  
  public double getrad()
  {
	  return radius;
  }
  public void setrad(double radius)
  {
	this.radius = radius;
  }

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius:- ");
		double radius = sc.nextDouble();
		
		double area = 3.14*radius*radius;
		
		Circle c1 = new Circle();
		c1.setrad(radius);
		System.out.println(c1.getrad());
		
		System.out.println("Area of circle is:- "+area);
		
		

	}

}
