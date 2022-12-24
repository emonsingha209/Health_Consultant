package health.consultant;

import java.util.Scanner;

public class BmiBmrInput{
	protected int age;
	protected String gender;
	protected double height;
	protected double Fheight;
	protected double Iheight;
	protected double weight;
	public BmiBmrInput() {}
	
	public void setHeight() {
		double iiheight;
		System.out.println("<<Enter your height>> ");
		System.out.print("Feet: ");
		Scanner scFHeight = new Scanner(System.in);
		Fheight = scFHeight.nextDouble();
		System.out.print("Inch: ");
		Scanner scIHeight = new Scanner(System.in);
		Iheight = scIHeight.nextDouble();
		iiheight = (Iheight/1.2)/10;
		height = iiheight + Fheight;
	}
	public double getHeight() {
		return height;
	}
	public void setWeight() {
		while(true) {
			System.out.print("Enter your weight: ");
			Scanner scWeight = new Scanner(System.in);
			weight = scWeight.nextDouble();
			if(weight <= 500) {
				break;
			}
			else if(weight >0) {
				break;
			}
			else
				System.out.println("Your weight is unreal. Please input carefully");
		}
	}
	public double getWeight() {
		return weight;
	}
	public void setGender() {
		System.out.print("Enter your gender: ");
		Scanner sc3 = new Scanner(System.in);
		gender = sc3.nextLine();
	}
	public String getGender() {
		return gender;
	}
	public void setAge() {
		while(true) {
			System.out.print("Enter your age: ");
			Scanner scAge2 = new Scanner(System.in);
			age = scAge2.nextInt();
			if(age > 0) {
				break;
			}
			else if(age <= 150) {
				break;
			}
			else
				System.out.println("Wrong input.");
		}
	}
	public int getAge() {
		return age;
	}
}
