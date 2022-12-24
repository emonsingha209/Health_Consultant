package health.consultant;

import java.util.Scanner;

public class Jaundice extends Diseases {
	private char jaundiceChoice;
	public Jaundice() {}
	public void check_diseases() {
		System.out.println("********Common symtoms of Jaundice********");
		System.out.println("1. Fever.");
		System.out.println("2. Chills(feelings of coldness accompanied by shivering).");
		System.out.println("3. Abdominal pain.");
		System.out.println("4. Flu-like symptoms.");
		System.out.println("5. Change in skin color.");
		System.out.println("6. Dark-colored urine and/or clay-colored stool.");
		System.out.println("7. Chronic hepatitis or inflammation of the liver.");
		System.out.println("8. Pyoderma gangrenosum (a type of skin disease).");
		System.out.println("9. Acute hepatitis A, B or C.");
		System.out.println("10. Polyarthralgias (inflammation of the joints).");
		System.out.println();
		while(true) {
			System.out.println();
			System.out.println("Do have above symtoms?");
			System.out.print("Y/N: ");
			Scanner jnSc = new Scanner(System.in);
			jaundiceChoice = jnSc.next().charAt(0);
			if(jaundiceChoice == 'Y' || jaundiceChoice == 'y') {
				System.out.println();
				System.out.println("You seems to have Jaundice fever.");
				System.out.println();
				System.out.println("Treatment:");
				System.out.println("i. Anemia-induced jaundice may be treated by boosting the amount of iron in the blood by either taking iron supplements \nor eating more iron-rich foods.");
				System.out.println("ii. Hepatitis-induced jaundice requires antiviral or steroid medications.");
				System.out.println("iii. Doctors can treat obstruction-induced jaundice by surgically removing the obstruction.");
				System.out.println("iv. If the jaundice has been caused by use of a medication, treatment for involves changing to an alternative medication.");
				break;
			}
			else if(jaundiceChoice == 'N' || jaundiceChoice == 'n') {
				System.out.println("You don't have Jaundice fever.");
				break;
			}
			else
				System.out.println("Wrong input. Press Y/N.");
		}
	}

}
