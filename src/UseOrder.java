import java.util.Scanner;
public class UseOrder {

	public static void main(String[] args) 
	{
		//declare variables
		Scanner in = new Scanner(System.in);
		int rdyOrder;
		int place;
		
		//welcome the user
		System.out.println(".* Welcome to Kuro Cafe *.");
		System.out.println(" ");
		System.out.println("Are you ready to order? \\(^v^ )/");
		System.out.println(" (1) Yes");
		System.out.println(" (2) No");
		rdyOrder = in.nextInt();
		
		//if else ready to order
		if (rdyOrder == 1)
		{
			System.out.println(" ");
			System.out.println("Would you like to have here or to go?");
			System.out.println(" (1) Dine in");
			System.out.println(" (2) To go");
			place = in.nextInt();
			
			//if else dine in/to go
			if (place == 1)
			{
				DineIn dine = new DineIn();
				dine.menu();
				dine.display();
			}
			
			else if (place == 2)
			{
				ToGo go = new ToGo();
				go.menu();
				go.display();
			}
		}
		
		else if (rdyOrder == 2)
		{
			System.out.println(" ");
			System.out.println("Why are you even here then?! (>_< \")");
		}
		
		in.close();

	}

}
