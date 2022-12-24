package health.consultant;

import java.util.Scanner;

public class Menu {
	public static void Entry() {
		DataEntry dt = new DataEntry();
		dt.Intro();
		Scanner cChoice = new Scanner(System.in);
		while (true) {
			char Continue = cChoice.next().charAt(0);
			if (Continue == 'c' || Continue == 'C') {
				dt.Patient();
				break;
			} else
				System.out.println("Wrong input. Please try again.");
		}
	}

	public static void Menu1() {
		BmiBmr bb = new BmiBmr();
		bb.setWeight();
		bb.setHeight();
		bb.setGender();
		bb.setAge();
		bb.BMI();
		bb.bmiDetails();
		bb.BMR();
	}

	public static void Menu2() {
		BP_Management bp = new BP_Management();
		bp.BPrange();
		bp.BpConsult();
	}

	public static void Menu3() {
		System.out.println("a. Covid 19.");
		System.out.println("b. HIV.");
		System.out.println("c. Cancer.");
		System.out.println("d. Dengue.");
		System.out.println("e. Diarrhoea");
		System.out.println("f. Diabetes");
		System.out.println("g. Typhoid");
		System.out.println("h. Jaundice");
		System.out.println("0. Exit");
		System.out.print("\n");
		while (true) {
			System.out.print("Which diseases you want to check : ");
			char Dchoice = 0;
			Scanner Dsc = new Scanner(System.in);
			Dchoice = Dsc.next().charAt(0);
			System.out.print("\n");
			if (Dchoice == 'a' || Dchoice == 'A') {
				Diseases covid_19 = new Covid_19();
				covid_19.check_diseases();
				break;
			} else if (Dchoice == 'b' || Dchoice == 'B') {
				Diseases hiv = new HIV();
				hiv.check_diseases();
				break;
			} else if (Dchoice == 'c' || Dchoice == 'C') {
				Diseases cancer = new Cancer();
				cancer.check_diseases();
				break;
			} else if (Dchoice == 'd' || Dchoice == 'D') {
				Diseases dengue = new Dengue();
				dengue.check_diseases();
				break;
			} else if (Dchoice == 'e' || Dchoice == 'E') {
				Diseases diarrhoea = new Diarrhoea();
				diarrhoea.check_diseases();
				break;
			} else if (Dchoice == 'f' || Dchoice == 'F') {
				Diseases diabetes = new Diabetes();
				diabetes.check_diseases();
				break;
			} else if (Dchoice == 'g' || Dchoice == 'G') {
				Diseases typhoid = new Typhoid();
				typhoid.check_diseases();
				break;
			} else if (Dchoice == 'h' || Dchoice == 'H') {
				Diseases jaundice = new Jaundice();
				jaundice.check_diseases();
				break;
			} else if (Dchoice == '0') {
				break;
			} else
				System.out.println("Wrong input.");
		}
	}

	public static void Menu4() {
		Appointment ap = new Appointment();
		ap.take_appointment();
	}

	public static void Menu5() {
		Basic_Tips BT = new Basic_Tips();
		BT.bTips();
	}

	public static void Menu6() {
		Rating r = new Rating();
		r.rating();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entry();
		int choice;
		do {
			System.out.println();
			System.out.println("[ [ [ [ [ MENU ] ] ] ] ]");
			System.out.println();
			System.out.println("1. Check your BMI & BMR.");
			System.out.println("2. BP Management. ");
			System.out.println("3. Diseases.");
			System.out.println("4. Taking Appointment.");
			System.out.println("5. Basic tips for maintaining good health");
			System.out.println("6. Rate us.");
			System.out.println("7. Exit");
			System.out.print("\n");
			System.out.print("Enter your choice: ");
			Scanner scChoice = new Scanner(System.in);
			choice = scChoice.nextInt();
			System.out.print("\n");
			switch (choice) {
			case 1:
				Menu1();
				break;
			case 2:
				Menu2();
				break;
			case 3:
				Menu3();
				break;
			case 4:
				Menu4();
				break;
			case 5:
				Menu5();
				break;
			case 6:
				Menu6();
				break;
			case 7:
				System.out.println("***************Thanks for using our app***************");
				break;
			default:
				System.out.println("Wrong input. Please try again.");
			}
		} while (choice != 7);
	}
}
