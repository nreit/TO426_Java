// AUTHOR: NICK REITNOUR

import java.util.Scanner;

public class HomeworkOne {
	public static void main(String[] args)
	{
		//initialize variables that I will be using to evaluate input and perform logic tests
		double traderPerformance = 0.0; 
		int numberTenPercentPlus = 0;
		int numberNegativeTenPercentMinus = 0;
		int traderCount = 0;
		int programCounter = 0;

		//allows program to take input from users
		Scanner sc = new Scanner(System.in);

		//allows user to change the number of traders they have each week (EXTRA CREDIT)
		System.out.print("Enter number of traders: ");
		traderCount = sc.nextInt();

		//as long as the number of inputted numbers is less than the number of traders, perform the following logic
		while (programCounter < traderCount)
		{
			//user inputs the trader performance
			System.out.print("Enter performance: ");
			traderPerformance = sc.nextDouble();

			//count if trader performance is greater than 10%
			if ((programCounter <= traderCount) && (traderPerformance >= 10.0))
			{
				programCounter = programCounter + 1;
				numberTenPercentPlus = numberTenPercentPlus + 1;
			//count if trader performance is less than -10%
			} else if ((programCounter <= traderCount) && (traderPerformance <= -10.0))
			{
				programCounter = programCounter + 1;
				numberNegativeTenPercentMinus = numberNegativeTenPercentMinus + 1;
			//if doesn't meet either criteria above, still count that there was a trader that had some performance
			} else {
				programCounter = programCounter + 1;
			}
		}

		//print out the results for the user to see
		String message = "\n" + "Number of traders:   " + traderCount + "\n" + "Number of traders that performed better than 10%:   " + numberTenPercentPlus + "\n" + "Number of traders that perofrmed worse than 10%: " + numberNegativeTenPercentMinus + "\n";
		System.out.println(message);
	}
}
