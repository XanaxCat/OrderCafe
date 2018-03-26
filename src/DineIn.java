import java.util.Scanner;
import java.text.DecimalFormat;

public class DineIn 
{
	//declare variables
	Scanner in = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.00");
	int option;
	int quantity;
	int choose;
	double price;
	double totalPrice = 0;
	double tax = 0.05;
	double taxPrice;
	double finalPrice;
	
	//set get method
	void setoption(int opt)
	{
		option = opt;
	}
	
	int getoption()
	{
		return option;
	}
	
	void setquantity(int qty)
	{
		quantity = qty;
	}
	
	int getquantity()
	{
		return quantity;
	}
	
	//menu method
	void menu()
	{
		//display menu
		System.out.println(" ");
		System.out.println("===========================");
		System.out.println("    = Kuro Cafe Menu =");
		System.out.println("---------------------------");
		System.out.println(" (1) Latte : RM8.90");
		System.out.println(" (2) Macchiato : RM9.90");
		System.out.println(" (3) Cappuccino : RM8.90");
		System.out.println(" (4) Espresso : RM5.90");
		System.out.println(" (5) Iced Coffee : RM6.90");
		System.out.println(" (6) Iced Matcha : RM7.90");
		System.out.println(" (7) Iced Water : RM0.50");
		System.out.println("===========================");
		
		//do while loop
		do
		{			
			//ask user to choose from menu
			System.out.println(" ");
			System.out.println("What would you like to have?");
			option = in.nextInt();
			
			//if else price
			if(option == 1)
			{
				price = 8.90;
			}
			
			else if(option == 2)
			{
				price = 9.90;
			}
			
			else if(option == 3)
			{
				price = 8.90;
			}
			
			else if(option == 4)
			{
				price = 5.90;
			}
			
			else if(option == 5)
			{
				price = 6.90;
			}
			
			else if(option == 6)
			{
				price = 7.90;
			}
			
			else if(option == 7)
			{
				price = 0.50;
			}
			
			
			//ask user for quantity
			System.out.println(" ");
			System.out.println("How many cups would you like?");
			quantity = in.nextInt();
			
			//calculation
			totalPrice = totalPrice + (price*quantity);
			
			//ask user if they want to order more
			System.out.println(" ");
			System.out.println("Would you like to add more order?");
			System.out.println(" (1) Yes");
			System.out.println(" (2) No");
			choose = in.nextInt();
			
		}while (choose != 2);
		
	}
	
	//display method
	void display()
	{
		//calculate service tax & final price
		taxPrice = totalPrice * tax;
		finalPrice = totalPrice + taxPrice;
		
		//display bill
		System.out.println(" ");
		System.out.println("Your bill is RM" + df.format(totalPrice));
		System.out.println("5% service tax : RM" + df.format(taxPrice));
		System.out.println("===================================");
		System.out.println("Total bill (incl. tax) : RM" + df.format(finalPrice));
		System.out.println("===================================");
		System.out.println(" ");
		System.out.println(".* Thank you for choosing Kuro Cafe! *.");
		System.out.println(" Have a nice day! \\( ^v^ )/ ");
	}
	
}
