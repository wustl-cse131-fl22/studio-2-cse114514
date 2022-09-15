package studio2;
import java.util.Scanner;
public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your money for the day: ");
		int startamount = in.nextInt();
		
		System.out.println("Enter your win limit");
		int winlimit = in.nextInt();
		
		System.out.println("Enter a winchance between 1 and 10");
		int winchance = in.nextInt();
		
		System.out.println("Enter the total day you would play");
		int totalSimulations = in.nextInt();
		
		int ostartamount = startamount; 
		double totallose = 0.0;
		
		for (int i = 1; i < totalSimulations + 1; i++)
		{
			while (startamount < winlimit && startamount > 0)
			{
				int min = 1;
				int max = 10;
				int random = min + (int) (Math.random() * ((max - min) + 1));
				boolean win = random > winchance;
				if(win) 
				{
				startamount = startamount + 1;
				}
				else 
				{
					startamount = startamount - 1;  
				}
			}
			boolean winday = startamount == 20;
			if (winday)
				System.out.println("Simulation " + i + " : win");
			else
			{
				System.out.println("Simulation " + i + " : lost");
				totallose = totallose + 1;
			}
			startamount = ostartamount;
		}
		System.out.println("Total lose: " + totallose);
		double loserate = totallose / totalSimulations;
		System.out.println("Ruin Rate from Simulation:" + loserate);
		
	}

}
