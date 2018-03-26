
public class ToGo extends DineIn
{
	@Override
	void display()
	{
		//display bill
		System.out.println(" ");
		System.out.println("===================================");
		System.out.println("Total bill : RM" + df.format(totalPrice));
		System.out.println("===================================");
		System.out.println(" ");
		System.out.println(".* Thank you for choosing Kuro Cafe! *.");
		System.out.println(" Have a nice day! \\( ^v^ )/ ");
	}
}
