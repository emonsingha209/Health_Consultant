package health.consultant;

import java.util.Scanner;

public class Covid_19 extends Diseases {
	private int covidChoice;
	public Covid_19() {}
	public void check_diseases() {
		System.out.println("********Common symtoms of COVID-19********");
		System.out.print("\n");
		System.out.println("1. Most common symptoms:");
		System.out.println("i. Fever");
		System.out.println("ii. Dry cough");
		System.out.println("iii. Tiredness");
		System.out.print("\n");
		System.out.println("2. Less common symptoms:");
		System.out.println("i. Aches and pains"); 
		System.out.println("ii. Sore throat"); 
		System.out.println("iii. Diarrhoea"); 
		System.out.println("iv. Conjunctivitis");
		System.out.println("v. Headache"); 
		System.out.println("vi. Loss of taste or smell");
		System.out.println("vii. Rash on skin, or discolouration of fingers or toes");
		System.out.print("\n");
		System.out.println("3. Serious symptoms:");
		System.out.println("i. Difficulty breathing or shortness of breath");
		System.out.println("ii. Chest pain or pressure");
		System.out.println("iii. Loss of speech or movement");
		System.out.print("\n");
		System.out.println("4. None of the above.");
		System.out.print("\n");
		while(true) {
			System.out.print("Select 1/2/3/4: ");
			Scanner covidSc = new Scanner(System.in);
			covidChoice = covidSc.nextInt();
			System.out.print("\n");
			if(covidChoice == 1) {
				System.out.println("May or may not be COVID-19. Follow health tips. For further quires dial NCC : 333/ IEDCR: 10655");
				break;
			}
			else if(covidChoice == 2) {
				System.out.println("Pre-stage of COVID-19. Take isolation immediately.For further quires dial NCC : 333/ IEDCR: 10655");
				System.out.print("\n");
				System.out.println("<<<<NB: People with mild symptoms who are otherwise healthy should manage their symptoms at home.>>>>");
				break;
			}
			else if(covidChoice == 3) {
				System.out.println("Seek immediate medical attention. Take isolation immediately. Call immediately NCC : 333/ IEDCR: 10655");
				break;
			}
			else if(covidChoice == 4) {
				System.out.println("You are not affected by COVID-19.");
				break;
			}
			else
				System.out.println("Wrong input. Choose 1/2/3/4.");
		}
		System.out.print("\n");
		if(covidChoice == 4) {
			System.out.println("Good to know:");
			System.out.println("1. Dont go outside without any reason.");
			System.out.println("2. Use mask if need to go outside.");
			System.out.println("3. Wash you hands several times in a day.");
			System.out.println("4. Avoid public gathering and public transportation.");
			System.out.println("5. Maintain a minimum distance of 3Feet(1M) from a person.");
			System.out.println("6. Always wash your clothes after coming from outside.");
			System.out.println("7. Use a tissue paper while sneezing or use your elbow.");
		}
		else
			System.out.println("What to do:");
			System.out.println("1. Participate in a public health interview through phone or online.");
			System.out.println("2. Stay home except to get medical care.");
			System.out.println("3. Call before you go to the doctor.");
			System.out.println("4. Isolate yourself from people and animals in your home.");
			System.out.println("5. Wear a cloth face covering.");
			System.out.println("6. Clean your hands often");
			System.out.println("7. Cover your coughs and sneezes");
			System.out.println("8. Clean “high-touch” surfaces every day, like counters, tabletops, doorknobs, bathroom fixtures, toilets, phones, keyboards, tablets, and bedside tables etc.");
			System.out.println("9. Don’t share personal items with anyone, including dishes, drinking glasses, cups, eating utensils, towels or bedding with people or pets in your home.");
			System.out.println("10. Use hot water to take breadth and dring tea with various spices.");
			System.out.println("11. Update your conditon to IEDCR-10655 / Can call NCC- 333");
	}
}
