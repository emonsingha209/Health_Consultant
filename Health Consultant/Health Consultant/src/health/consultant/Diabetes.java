package health.consultant;
import java.util.Scanner;
public class Diabetes extends Diseases {
	private int diabetesChoice;
	public Diabetes() {}
	public void check_diseases() {
		System.out.println("********Common symtoms of Diabetes********");
		System.out.println();
		System.out.println("1. Type-1 Diabetes.");
		System.out.println("i. Urinating often");
		System.out.println("ii. Feeling very thirsty");
		System.out.println("iii. Feeling very hungry—even though you are eating");
		System.out.println("iv. Extreme fatigue");
		System.out.println("v. Blurry vision");
		System.out.println("vi. Cuts/bruises that are slow to heal");
		System.out.println("vii. Weight loss—even though you are eating more (type 1)");
		System.out.println();
		System.out.println("2. Type-2 Diabetes.");
		System.out.println("i. Increased thirst");
		System.out.println("ii.Frequent urination");
		System.out.println("iii. Increased hunger");
		System.out.println("iv. Unintended weight loss");
		System.out.println("v. Fatigue");
		System.out.println("vi. Blurred vision");
		System.out.println("vii. Slow-healing sores");
		System.out.println("viii. Frequent infections");
		System.out.println("xi. Areas of darkened skin, usually in the armpits and neck");
		System.out.println();
		System.out.println("3. None of above.");
		while(true) {
			System.out.println();
			System.out.println("Which type of diabetes do you have?");
			System.out.print("Select 1/2/3: ");
			Scanner diabetesSc = new Scanner(System.in);
			diabetesChoice = diabetesSc.nextInt();
			System.out.print("\n");
			if(diabetesChoice == 1) {
				System.out.println("You have type-1 Diabetes.");
				System.out.println();
				System.out.println("Treatment:");
				System.out.println("i. Taking insulin");
				System.out.println("ii. Carbohydrate, fat and protein counting");
				System.out.println("iii. Frequent blood sugar monitoring");
				System.out.println("iv. Eating healthy foods");
				System.out.println("v. Exercising regularly and maintaining a healthy weight");
				System.out.println("vi. Random blood sugar test.");
				System.out.println("vii. Fasting blood sugar test. ");
				break;
			}
			else if(diabetesChoice == 2) {
				System.out.println("You have type-2 Diabetes.");
				System.out.println("");
				System.out.println("Treatment:");
				System.out.println("i. Weight loss");
				System.out.println("ii. Healthy eating");
				System.out.println("iii. Regular exercise");
				System.out.println("iv. Possibly, diabetes medication or insulin therapy");
				System.out.println("v. Blood sugar monitoring");
				System.out.println("vi. Glycated hemoglobin (A1C) test");
				System.out.println("vii. Random blood sugar test. ");
				System.out.println("viii. Fasting blood sugar test");
				System.out.println("xi. Oral glucose tolerance test.");
				System.out.println("");
				break;
			}
			else if(diabetesChoice == 3) {
				System.out.println("You don't have Diabetes.");
				break;
			}
			else
				System.out.println("Wrong input. Choose 1/2/3.");
		}
	}
}
