package health.consultant;
import java.util.Scanner;

public class Diarrhoea extends Diseases {
	public Diarrhoea() {}
	public void check_diseases() {
		System.out.println("********Common symtoms of Diarrhoea********");
		System.out.println();
		System.out.println("i. Frequent loose, watery stools.");
		System.out.println("ii. Abdominal cramps.");
		System.out.println("iii. Abdominal pain.");
		System.out.println("iv. Fever.");
		System.out.println("v. Bleeding.");
		System.out.println("vi. Lightheadedness or dizziness from dehydration.");
		while(true) {
			System.out.println();
			System.out.println("Do you have above symtoms? ");
			System.out.print("Y/N: ");
			Scanner DiarrhoeaSc = new Scanner(System.in);
			char diarrhoea = DiarrhoeaSc.next().charAt(0);
			System.out.println();
			if(diarrhoea == 'Y' || diarrhoea == 'y') {
				System.out.println("You seems to have Diarrhoea.");
				System.out.println();
				System.out.println("Treatment:");
				System.out.println("1. Avoid caffeine, dairy products, and greasy, high fibre, or sugary foods");
				System.out.println("2. Placing a hot water bottle or wheat pack on your stomach, or taking paracetamol (e.g. Panadol), may provide some relief from abdominal cramps");
				System.out.println("3. Apply zinc and castor oil ointment or a barrier cream to affected areas if you, or your child, develops a rash (like nappy rash) from the diarrhoea");
				System.out.println("4. Avoid taking non-steroidal anti-inflammatory drugs (NSAIDs), such as aspirin, ibuprofen, or diclofenac, for pain relief as these medications can cause diarrhoea");
				System.out.println("5. Anti-diarrhoeal medications that slow diarrhoea (e.g. Imodium) should be avoided as these drugs prevent your body from getting rid of the bacteria or virus that may have caused the diarrhea.");
				System.out.println("6. Take regular consultation with your doctor.");
				break;
			}
			else if(diarrhoea == 'N' || diarrhoea == 'n') {
				System.out.println("You don't have Diarrhoea.");
				break;
			}
			else
				System.out.println("Wrong input. Press Y/N");
		}
	}
}
