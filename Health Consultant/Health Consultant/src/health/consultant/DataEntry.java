package health.consultant;

import java.io.File;
import java.io.IOException;
import java.util.Formatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DataEntry {
	private String name;
	private String Lname;
	private int age;
	protected String gender;
	protected String bloodGroup;
	protected String fpassword;
	protected String spassword;
	protected String password;
	protected String Lpassword;

	public DataEntry() {} //Empty constructor

	public DataEntry(String name, int age, String bloodGroup) {		//parameterize constructor
		this.setName(name);
		this.setAge(age);
		this.bloodGroup = bloodGroup;
	}

	public void Intro() {
		System.out.println("********Welcome to Personal Health Consultant App********");
		System.out.println();
		System.out.println("Developers: ");
		System.out.println("   Name: MD Rabbi Islam Sajid");
		System.out.println("   Bsc in CSE(Student)");
		System.out.println();
		System.out.println("   Name: Emon Singha");
		System.out.println("   Bsc in CSE(Student)");
		System.out.println();
		System.out.print("Press c to continue: ");
	}

	public void Patient() {
		System.out.println();
		System.out.println("<<< To continue need an account >>>.");
		while (true) {
			System.out.println();
			System.out.println("##Do you have any account?");
			System.out.print("Y/N: ");
			Scanner loginSc = new Scanner(System.in);
			char login = loginSc.next().charAt(0);
			if (login == 'Y' || login == 'y') {
				while (true) {
					System.out.println();
					System.out.println("Log in to your account");
					System.out.print("User Name: ");
					Scanner scLName = new Scanner(System.in);
					Lname = scLName.nextLine();
					System.out.print("Password: ");
					Scanner scLPASS = new Scanner(System.in);
					Lpassword = scLPASS.nextLine();
					if (Lname.equals(name) && Lpassword.equals(password)) {
						break;
					} else if (Lname != name && Lpassword != password) {
						System.out.println("Incorrect User Name.");
						continue;
					} else if (Lname == name && Lpassword != password) {
						System.out.println("Incorrect Password.");
						continue;
					} else if (Lname != name && Lpassword == password) {
						System.out.println("Incorrect User Name.");
						continue;
					}
				}
				break;
			} else if (login == 'N' || login == 'n') {
				
				//File handling
				
				File myobj = new File("C:/Users/HP/Desktop/Database");
				myobj.mkdir();
				File obj = new File("C:/Users/HP/Desktop/Database/Data_Entry.txt");
				
				//Exception handling
				
				try {
					obj.createNewFile();
					Formatter obj2 = new Formatter("C:/Users/HP/Desktop/Database/Data_Entry.txt");
					System.out.println();
					System.out.println("##Create an account.");
					System.out.println();
					System.out.print("User Name: ");
					Scanner scName = new Scanner(System.in);
					setName(scName.nextLine());
					int flag = 1;
					do {
						try {
							System.out.print("Age: ");
							Scanner scAge = new Scanner(System.in);
							setAge(scAge.nextInt());
							flag = 2;
						} catch (InputMismatchException e) {
							System.out.println(e);
						} finally {
							if (flag == 2) {
								break;
							}
							System.out.println("Enter again: ");
						}
					} while (flag == 1);
					System.out.print("Gender: ");
					Scanner scGender = new Scanner(System.in);
					gender = scGender.nextLine();
					System.out.print("Blood group: ");
					Scanner scBlood = new Scanner(System.in);
					bloodGroup = scBlood.nextLine();
					obj2.format("%s %s %s %s\r\n", "Data of Patient:\n" + "Name: " + name, "\nAge: " + age,
							"\nGender: " + gender, "\nBlood Group: " + bloodGroup);
					obj2.close();
					flag = 2;
				} catch (IOException e) {
					System.out.println(e);
				}
				System.out.print("Create new password: ");
				Scanner fPasssc = new Scanner(System.in);
				fpassword = fPasssc.nextLine();
				while (true) {
					System.out.print("Confirm your password: ");
					Scanner sPasssc = new Scanner(System.in);
					spassword = sPasssc.nextLine();
					if (spassword.equals(fpassword)) {
						this.password = spassword;
						System.out.println();
						System.out.println("Account created Successfully and Stored in the databse.");
						break;
					} else
						System.out.println();
					System.out.println("Your password does not match. Please try again.");
					System.out.println();
				}
				break;
			} else
				System.out.println("Wrong input. Press Y/N.");
			System.out.println();
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
