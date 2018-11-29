import java.util.Scanner;

public class Currency
	{
		
		public static void main(String[] args)
			{
				String[] Units = {"USD", "CNY", "EUR", "GBP", "MXN"};
				boolean choosingCurrency = true;
				while (choosingCurrency)
					{
						System.out.println("What's your unit of currency you want to convert from?");
						for (String c: Units)
							{
								System.out.println(c);
							}
						Scanner userInput = new Scanner (System.in);
						String startingCurrency = userInput.nextLine();
						
				
				        System.out.println("How much?");
				        Scanner userInput1 = new Scanner (System.in);
				        int amount = userInput1.nextInt();
				
			
						System.out.println("What's your unit of currency you want to convert to?");
						for (String c: Units)
							{
								System.out.println(c);
							}
						Scanner userInput2 = new Scanner (System.in);
						String endingCurrency = userInput.nextLine();
			    

			         }

	          }
	}
