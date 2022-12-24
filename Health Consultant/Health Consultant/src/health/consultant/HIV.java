package health.consultant;
import java.util.Scanner;

public class HIV extends Diseases {
	private char hivChoice;
	public HIV() {}
	public void check_diseases() {
		System.out.println("********Common symtoms of HIV********");
		System.out.print("\n");
		System.out.println("1: Fever.");
		System.out.println("2: Fatigue and headache.");
		System.out.println("3: Swollen lymph nodes, achy muscles and joint pain.");
		System.out.println("4: Skin rash.");
		System.out.println("5: Nausea, vomiting and diarrhoea");
		System.out.println("6: Sore throat and dry cough.");
		System.out.println("7: Night sweats");
		while(true) {
			System.out.println("Do you have above symtoms?");
			System.out.print("Y/N: ");
			Scanner hivSc = new Scanner(System.in);
			hivChoice =  hivSc.next().charAt(0);
			if(hivChoice == 'Y' || hivChoice == 'y') {
				System.out.println("You seems to be positve for HIV.");
				System.out.println("##Testing positive for HIV often leaves a person overwhelmed with questions and concerns. It’s important to remember that HIV can be treated effectively with HIV medicines.");
				System.out.println("##Prompt medical care and treatment with HIV medicines as soon as possible is the best way to stay healthy.");
				System.out.println("##After testing positive for HIV, a person’s first visit with a health care provider includes a review of the person’s health and medical history, a physical exam, and several lab tests");
				System.out.println("##The health care provider also explains the benefits of HIV treatment and discusses ways to reduce the risk of passing HIV to others.");
				break;
			}
			else if(hivChoice == 'N' || hivChoice == 'n') {
				System.out.println("You are out of danger.");
				System.out.println("Prevention:");
				System.out.println("1. Avoid taking drugs with same syringe.");
				System.out.println("2. Don't take blood from random blood-bank or random person.");
				System.out.println("3. Follow ethical and religion rules.");
				System.out.println("4. Use condom while having sex.");
				break;
			}
			else
				System.out.println("Wrong input. Press Y/N.");
		}
	}

}
