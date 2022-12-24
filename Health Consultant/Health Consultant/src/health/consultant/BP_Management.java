package health.consultant;
import java.util.Scanner;
public class BP_Management {
	private int SysNum;
	private int DiaNum;
	public BP_Management() {}
	public void BPrange() {
			Scanner scBp = new Scanner(System.in);
			char bpchoice = 0;
			System.out.println("(a) Upper 230/140");
			System.out.println("(b) 181/111 – 230/140");
			System.out.println("(c) 160/100 – 180/110");
			System.out.println("(d) 140/90 – 159/99");
			System.out.println("(e) 120/80 – 139/89");
			System.out.println("(f) 91/61 – 119/79");
			System.out.println("(g) 80/50 – 90/60");
			System.out.println("(h) Below 80/50");
			System.out.print("\n");
			System.out.print("Enter range: ");
			bpchoice = scBp.next( ).charAt(0);
			System.out.print("\n");
			switch(bpchoice) {
			case 'a':
				System.out.println("**Fatal!!! Complex situation.**");
				break;
			case 'b':
				System.out.println("**Hypertensive Crisis (Seek Emergency Care)**");
				System.out.println("Extremely high blood pressure can cause headache, nausea, vision changes, mental confusion, chest pain and \nshortness of breath. It is considered a hypertensive emergency if you have a blood pressure reading over \n185/110 combined with any of these symptoms. Call 999 and seek medical attention immediately.");
				break;
			case 'c':
				System.out.println("**Stage 2 Hypertension (High Blood Pressure and High Risk)**");
				System.out.println("Blood pressure readings in this range put you at higher risk for life-threatening problems such as heart \nattack and stroke. It’s important to your health to lower your blood pressure through a combination of medication\n and lifestyle changes.");
				break;
			case 'd':
				System.out.println("**Stage 1 Hypertension (High Blood Pressure)**");
				System.out.println("Hypertension increases your risk of life-threatening problems such as heart attacks and stroke. Blood pressure \nin this range may also damage the heart and kidneys, particularly in those who already have chronic medical \nproblems affecting these organs.");
				break;
			case 'e':
				System.out.println("**Pre-hypertension or High Normal.**");
				System.out.println("The good news is you don’t have hypertension. However, your blood pressure is higher than recommended for most \nadults. Research suggests that people with pre-hypertension are more likely to have a heart attack or stroke \ncompared to those with lower blood pressure. People with pre-hypertension often develop hypertension, so having \nyour blood pressure checked regularly is important.");
				break;
			case 'f':
				System.out.println("**Normal Blood Pressure.**");
				System.out.println("Maintain it.");
				break;
			case 'g':
				System.out.println("**Hypotension (Low Blood Pressure)**");
				System.out.println("What this means is the blood pressure in your arteries is lower than what is considered normal. However, there’s \nusually no need to be concerned about low blood pressure unless you’re experiencing dizziness, fainting, \nnausea or fatigue. Hypotension may not even be diagnosed unless you’re experiencing these symptoms.");
				break;
			case 'h':
				System.out.println("**Severe Hypotension (Very Low Blood Pressure)**");
				System.out.println("Very low blood pressure could also have an underlying cause and indicate a serious heart problem or infection. In \nsome instances severe hypotension can result in shock, causing confusion, clammy skin and rapid shallow \nbreathing. Very low blood pressure can also be caused by an endocrine problem, pregnancy and dehydration.");
			default:
					System.out.println("Wrong input. Enter lower case alphabet (a/b/c)");
					break;
			}
		
	}
	public void BpConsult() {
		System.out.println("\n");
		System.out.println("Good to know  >>");
		System.out.print("\n");
		System.out.println("High blood pressure: ");
		System.out.println("1. Maintain a healthy weight. Strive for a body mass index (BMI) between 18.5 and 24.9.");
		System.out.println("2. Eat healthier. Eat lots of fruit, veggies and low-fat dairy, and less saturated and total fat.");
		System.out.println("3. Reduce sodium. Ideally, stay under 1,500 mg a day, but aim for at least a 1,000 mg per day reduction. ");
		System.out.println("4. Get active. Aim for at least 90 to 150 minutes of aerobic and/or dynamic resistance exercise per week and/or three sessions of isometric resistance exercises per week. ");
		System.out.println("5. Limit alcohol. Drink no more than 1-2 drinks a day. (One for most women, two for most men.)");
		System.out.print("\n\n");
		System.out.println("Low blood pressure: ");
		System.out.println("1. Use more salt. Experts usually recommend limiting salt in your diet because sodium can raise blood pressure, sometimes dramatically. For people with low blood pressure, that can be a good thing. But because excess sodium can lead to heart failure, especially in older adults, it's important to check with your doctor before increasing the salt in your diet.");
		System.out.println("2. Drink more water. Fluids increase blood volume and help prevent dehydration, both of which are important in treating hypotension.");
		System.out.println("3. Wear compression stockings. The elastic stockings commonly used to relieve the pain and swelling of varicose veins can help reduce the pooling of blood in your legs. Some people tolerate elastic abdominal binders better than they do compression stockings.");
		System.out.println("4. Medications. Several medications can be used to treat low blood pressure that occurs when you stand up (orthostatic hypotension). For example, the drug fludrocortisone, which boosts your blood volume, is often used to treat this form of low blood pressure. Doctors often use the drug midodrine (Orvaten) to raise standing blood pressure levels in people with chronic orthostatic hypotension. It works by restricting the ability of your blood vessels to expand, which raises blood pressure.");
		
	}
}