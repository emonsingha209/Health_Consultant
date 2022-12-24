package health.consultant;
import java.util.Scanner;

public class Typhoid extends Diseases {
	private char typhoidChoice;
	public Typhoid() {}
	public void check_diseases() {
		System.out.println("********Common symtoms of Typhoid********");
		System.out.println("Typhoid fever and paratyphoid fever have similar symptoms. People usually have a sustained fever (one that doesn’t come and go) that can be as high as 103–104°F (39–40°C).");
		System.out.println("1. Weakness");
		System.out.println("2. Stomach pain");
		System.out.println("3. Headache");
		System.out.println("4. Diarrhea or constipation");
		System.out.println("5. Cough");
		System.out.println("6. Loss of appetite");
		while(true) {
			System.out.println();
			System.out.println("Do have above symtoms?");
			System.out.print("Y/N: ");
			Scanner tySc = new Scanner(System.in);
			typhoidChoice = tySc.next().charAt(0);
			if(typhoidChoice == 'Y' || typhoidChoice == 'y') {
				System.out.println();
				System.out.println("You seems to have Typhoid fever.");
				System.out.println("Treatment:");
				System.out.println("i. Keep taking antibiotics for as long as the doctor has recommended.");
				System.out.println("ii. Wash your hands carefully with soap and water after using the bathroom.");
				System.out.println("iii. Do not prepare or serve food for other people.");
				System.out.println("iv. Take ciprofloxacin (for non-pregnant adults) and ceftriaxone(upon consultation only).");
				System.out.println("v. Other than antibiotics, it is important to rehydrate by drinking adequate water.");
				System.out.println("vi. In more severe cases, where the bowel has become perforated, surgery may be required.");
				break;
			}
			else if(typhoidChoice == 'N' || typhoidChoice == 'n') {
				System.out.println("You don't have Typhoid fever.");
				break;
			}
			else
				System.out.println("Wrong input. Press Y/N.");
		}
	}
}
