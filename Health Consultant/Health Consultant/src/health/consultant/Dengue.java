package health.consultant;
import java.util.Scanner;

public class Dengue extends Diseases {
	private char dengue;
	public Dengue() {}
	public void check_diseases() {
		System.out.println("********Common symtoms of Dengue********");
		System.out.println();
		System.out.println("##The most common symptom of dengue is fever with any of the following:");
		System.out.println("i. Nausea, vomiting");
		System.out.println("ii. Rash");
		System.out.println("iii. Aches and pains (eye pain, typically behind the eyes, muscle, joint, or bone pain)");
		System.out.println("iv. Any warning sign, contact with specialist doctor ASAP.");
		while(true) {
			System.out.println();
			System.out.println("Do you have above symtoms? ");
			System.out.print("Y/N: ");
			Scanner DengueSc = new Scanner(System.in);
			dengue = DengueSc.next().charAt(0);
			if(dengue == 'Y' || dengue == 'y') {
				System.out.println("You seems to have Dengue.");
				System.out.println("Treatment:");
				System.out.println("1. See a healthcare provider if you develop a fever or have symptoms of dengue. Tell him or her about your travel.");
				System.out.println("2. Rest as much as possible");
				System.out.println("3. Take acetaminophen (also known as paracetamol outside of the United States) to control fever and relieve pain.");
				System.out.println("4. Do not take aspirin or ibuprofen!");
				System.out.println("5. Drink plenty of fluids such as water or drinks with added electrolytes to stay hydrated.");
				System.out.println("6. For mild symptoms, care for a sick infant, child, or family member at home.");
				break;
			}
			else if(dengue == 'N' || dengue == 'n') {
				System.out.println();
				System.out.println("Then check the symtoms of SEVERE Dengue.");
				System.out.println("i. Stomach or belly pain, tenderness");
				System.out.println("ii. Vomiting (at least 3 times in 24 hours)");
				System.out.println("iii. Bleeding from the nose or gums");
				System.out.println("iv. Vomiting blood, or blood in the stool");
				System.out.println("v. Feeling tired, restless, or irritable");
				while(true) {
					System.out.println();
					System.out.println("Do you have above symtoms? ");
					System.out.print("Y/N:");
					Scanner SDengueSc = new Scanner(System.in);
					char Sdangue = SDengueSc.next().charAt(0);
					if(Sdangue == 'Y' || Sdangue == 'y') {
						System.out.println();
						System.out.println("You have SEVERE Dangue!!");
						System.out.println("Treatment: ");
						System.out.println("i. Look at a healthcare provider or go to the emergency room immediately.");
						System.out.println("ii. Seek for medical emergency and requires immediate medical attention or hospitalization.");
						System.out.println("iii. While traveling, find health care abroad.");
						break;
					}
					else if(dengue == 'N' || dengue == 'n') {
						System.out.println();
						System.out.println("You are safe.");
						break;
					}
					else
					{
						System.out.println("Wrong input. Press Y/N.");
					}
				}
				break;
			}
			else
				System.out.println("Wrong input. Press Y/N");
		}
	}

}
