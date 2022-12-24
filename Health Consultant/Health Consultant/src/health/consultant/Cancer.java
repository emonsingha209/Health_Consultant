package health.consultant;
import java.util.Scanner;
public class Cancer extends Diseases { 	// inherited
	private int cancerChoice;
	public Cancer() {}
	public void check_diseases() {
		System.out.println("********Common types of CANCER********");
		System.out.println("1. Bladder Cancer");
		System.out.println("2. Breast Cancer");
		System.out.println("3. Colon and Rectal Cancer");
		System.out.println("4. Kidney Cancer");
		System.out.println("5. Leukemia");
		System.out.println("6. Liver Cancer");
		System.out.println("7. Lung Cancer");
		System.out.println("8. Pancreatic Cancer");
		System.out.println("9. Prostate Cancer");
		System.out.println("10. Skin Cancer");
		System.out.println("11. Thyroid Cancer");
		System.out.println("0. Exit");
		while(true) {
			System.out.print("Select your type of Cancer: ");
			Scanner cancerSc = new Scanner(System.in);
			cancerChoice = cancerSc.nextInt();
			if(cancerChoice == 1) {
				System.out.println();
				System.out.println("***Symtoms of Bladder Cancer***");
				System.out.println("i. Blood or blood clots in the urine.");
				System.out.println("ii. Pain or burning sensation during urination.");
				System.out.println("iii. Frequent urination.");
				System.out.println("iv. Feeling the need to urinate many times throughout the night.");
				System.out.println("v. Feeling the need to urinate, but not being able to pass urine.");
				System.out.println("vi. Lower back pain on 1 side of the body.");
				System.out.println();
				System.out.println("Do you have above symtoms?");
				while(true) {
					System.out.print("Y/N: ");
					Scanner BladderSc = new Scanner(System.in);
					char bladder = BladderSc.next().charAt(0);
					if(bladder == 'Y' || bladder == 'y') {
						System.out.println("You seems to have BLADDER CANDER.");
						System.out.println("Treatment:");
						System.out.println("1. Consult with doctors as soon as possible. Take surgaries");
						System.out.println("2. Using cystoscopy to examine inside.");
						System.out.println("3. Removing a sample of tissue for testing.");
						System.out.println("4. Examining a urine sample (urine cytology)");
						System.out.println("5. Imaging tests.");
						System.out.println("6. Take regular consultation with your doctor.");
						break;
					}
					else if(bladder == 'N' || bladder == 'n') {
						System.out.println("You don't have bladder cander.");
						break;
					}
					else
						System.out.println("Wrong input. Press Y/N");
				}
				break;
			}
			else if(cancerChoice == 2) {
				System.out.println("");
				System.out.println("***Under developing***");
				break;
			}
			else if(cancerChoice == 3) {
				System.out.println("");
				System.out.println("***Under developing***");
				break;
			}
			else if(cancerChoice == 4) {
				System.out.println("");
				System.out.println("***Under developing***");
				break;
			}
			else if(cancerChoice == 5) {
				System.out.println("");
				System.out.println("***Under developing***");
				break;
			}
			else if(cancerChoice == 6) {
				System.out.println("");
				System.out.println("***Under developing***");
				break;
			}
			else if(cancerChoice == 7) {
				System.out.println("");
				System.out.println("******Symtoms of Lung Cancer******");
				System.out.println("i. A cough that doesn’t go away after 2 or 3 weeks");
				System.out.println("ii. A long-standing cough that gets worse");
				System.out.println("iii. Chest infections that keep coming back");
				System.out.println("iv. Coughing up blood");
				System.out.println("v. An ache or pain when breathing or coughing");
				System.out.println("vi. Persistent breathlessness");
				System.out.println("vii. Persistent tiredness or lack of energy");
				System.out.println("viii. Loss of appetite or unexplained weight loss");
				System.out.println();
				System.out.println("Do you have above symtoms?");
				while(true) {
					System.out.print("Y/N: ");
					Scanner LungSc = new Scanner(System.in);
					char lung = LungSc.next().charAt(0);
					if(lung == 'Y' || lung == 'y') {
						System.out.println();
						System.out.println("You seems to have LUNG CANDER.");
						System.out.println("Treatment:");
						System.out.println("i. Surgery.An operation where doctors cut out cancer tissue.");
						System.out.println("ii. Chemotherapy.Using special medicines to shrink or kill the cancer. The drugs can be pills you take or medicines given in your veins, or sometimes both.");
						System.out.println("iii. Radiation therapy.Using high-energy rays (similar to X-rays) to kill the cancer.");
						System.out.println("iv. Targeted therapy.Using drugs to block the growth and spread of cancer cells. The drugs can be pills you take or medicines given in your veins.");
						System.out.println("v. Complementary Medicine is acupuncture, dietary supplements, massage therapy, hypnosis, and meditation");
						System.out.println("vi. Alternative medicineis usedinstead ofstandard treatments. Examples include special diets, megadose vitamins, herbal preparations, special teas, and magnet therapy.");
						break;
					}
					else if(lung == 'N' || lung == 'n') {
						System.out.println("You don't have lung cander.");
						break;
					}
					else
						System.out.println("Wrong input. Press Y/N");
				}
				break;
			}
			else if(cancerChoice == 8) {
				System.out.println("");
				System.out.println("***Under developing***");
				break;
			}
			else if(cancerChoice == 9) {
				System.out.println("");
				System.out.println("***Under developing***");
				break;
			}
			else if(cancerChoice == 10) {
				System.out.println("");
				System.out.println("***Under developing***");
				break;
			}
			else if(cancerChoice == 11) {
				System.out.println("");
				System.out.println("***Under developing***");
				break;
			}
			else if(cancerChoice == 0) {
				break;
			}
		}
	}
}
