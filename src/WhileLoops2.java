import java.util.Scanner;
public class WhileLoops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double input;
		double newNumbers = 1;
		double i = 1;
		double avg;
		double originalInput;
		double Max;
		double Min;
		
		System.out.println("Enter the numbers you want to use, after the last number type in -1");
		Scanner keyboard = new Scanner(System.in);
		input = keyboard.nextDouble();
		
		originalInput = input; 
		Max = originalInput;
		Min = originalInput;
		
		while (input >=0 && newNumbers > 0)
		{
			newNumbers = keyboard.nextDouble();
			if (newNumbers > Max)
				Max = newNumbers;
			
			if (newNumbers < Min && newNumbers > 0)
				Min = newNumbers;
			
			
			if (i >0)
			i = i + 1;
			
			if (newNumbers == -1)
			{
				newNumbers++;
				i = i - 1;
			}
				
			input = input + newNumbers;
			
			
			
		}
		
		avg = input / i;
		System.out.println("Max is " + Max);
		System.out.println("Min is " + Min);
		System.out.println("Sum is " + input);
		System.out.println("Average of the numbers is " + avg);
		System.out.println("numbers typed: " + i);
		
		
	}

}
