package health.consultant;

public class BmiBmr extends BmiBmrInput {
	private double mHeight;
	private double CMHeight;
	private double bmi;
	private double male_bmr;
	private double female_bmr;
	
	public BmiBmr() {}
	public double getCMHeight() {
		CMHeight = height*30.48;
		return CMHeight;
	}
	public void BMI() {
		mHeight = height*0.3048;
		bmi = weight/(mHeight*mHeight);
		System.out.print("\n");
		System.out.println("Your BMI: "+bmi);
	}
	public void BMR() {
		System.out.println();
		if((gender.equals("Male")) || (gender.equals("male"))) {
			male_bmr = 66 + (13.7*getWeight()) + (5*getCMHeight()) + (6.8*getAge());
			System.out.println("Your BMR: "+male_bmr);
		}
		else if((gender.equals("Female")) || (gender.equals("female"))) {
			female_bmr = 655 + (9.6*getWeight()) + (1.8*getCMHeight()) + (4.7*getAge());
			System.out.println("Your BMR: "+female_bmr);
		}
		else
			System.out.println("Can't find gender");
	}
	public void bmiDetails() {
		System.out.print("\n");
		if(bmi < 18.5)
		{
			System.out.println("<<<<You are UNDERWEIGHT. You need to maintain the steps below.>>>>\n");
			System.out.println("1. Eat more frequently, you may feel full faster.");
			System.out.println("2. Choose nutrient-rich foods.");
			System.out.println("3. Try smoothies and shakes."); 
			System.out.println("4. Be cautious when you drink any kind of drinks.");
			System.out.println("5. Make every bite count.");
			System.out.println("6. Have a small sweet dish after every meal.");
			System.out.println("7. Have an occasional treat."); 
			System.out.println("8. Exercise regularly and walk in the morning.");
		}
		else if(bmi >= 18.5 && bmi < 25.0)
		{
			System.out.println("<<<<Your bmi is NORMAL. Maintain it.>>>>");
			System.out.println("...GOOD LUCK...!!\n");
		}
		else if(bmi>= 25.0 && bmi < 30.0)
		{
			System.out.println("<<<<You are OVERWEIGHT. You need to maintain the steps below.>>>>\n");
			System.out.println("1. Maintain a balance diet. ");
			System.out.println("2. Consume less “bad” fat and more “good” fat.");
			System.out.println("3. Consume less processed and sugary foods.");
			System.out.println("4. Eat more servings of vegetables and fruits.");
			System.out.println("5. Eat plenty of dietary fiber.");
			System.out.println("6. Focus on eating low–glycemic index foods.");
			System.out.println("7. Get the family involved in your journey.");
			System.out.println("8. Engage in regular aerobic activity.");
			System.out.println("9. Exercise regularly and walk in the morning.");
		}
		else if(bmi >= 30.0)
		{
			System.out.println("<<<<OBESITY!!! Maintain the steps below.>>>>\n");
			System.out.println("1. Maintain a balance diet. ");
			System.out.println("2. Avoid oily and junk foods.");
			System.out.println("3. Avoid smoking and drinks");
			System.out.println("4. Consume less processed and sugary foods.");
			System.out.println("5. Eat more vegetables and fruits.");
			System.out.println("6. Eat plenty of dietary fiber.");
			System.out.println("7. Focus on eating low–glycemic index foods.");
			System.out.println("8. Get the family involved in your journey.");
			System.out.println("9. Engage in regular aerobic activity.");
			System.out.println("10. Exercise regularly and walk in the morning.");
			System.out.println("11. Consult a specialist ASAP...");
		}
		else
			System.out.println("Invalid BMI");
	}
}
