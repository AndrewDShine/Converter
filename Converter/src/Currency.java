import java.util.Scanner;

public class Currency
	{
		
		public static void CurrencyRunner()
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
						startingCurrency = startingCurrency.toLowerCase();
						for (String c: Units)
							{
								if(startingCurrency.toLowerCase().equals(c.toLowerCase()))
									choosingCurrency = false;
							}
				
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
						endingCurrency = endingCurrency.toLowerCase();
						for (String c: Units)
							{
								if(endingCurrency.toLowerCase().equals(c.toLowerCase()))
									choosingCurrency = false;
							}
			            
						if(startingCurrency.equals("usd"))
							{
								if(endingCurrency.equals("usd"))
									{
										System.out.println(amount + " USD is equal to " + amount + " USD");
									}
								else if(endingCurrency.equals("cny"))
									{
										System.out.println(amount + " USD is equal to " + (int)(amount*6.95) + " CNY");
									}
								else if(endingCurrency.equals("eur"))
									{
										System.out.println(amount + " USD is equal to " + (int)(amount*0.88) + " EUR");
									}
								else if(endingCurrency.equals("gbp"))
									{
										System.out.println(amount + " USD is equal to " + (int)(amount*0.78) + " GBP");
									}
								else if(endingCurrency.equals("mxn"))
									{
										System.out.println(amount + " USD is equal to " + (int)(amount*20.41) + " MXN");
									}
							 }

						else if(startingCurrency.equals("cny"))
							{
								if(endingCurrency.equals("usd"))
									{
										System.out.println(amount + " CNY is equal to " + (int)(amount*0.14) + " USD");
									}
								else if(endingCurrency.equals("cny"))
									{
										System.out.println(amount + " CNY is equal to " + amount + " CNY");
									}
								else if(endingCurrency.equals("eur"))
									{
										System.out.println(amount + " CNY is equal to " + (int)(amount*0.13) + " EUR");
									}
								else if(endingCurrency.equals("gbp"))
									{
										System.out.println(amount + " CNY is equal to " + (int)(amount*0.11) + " GBP");
									}
								else if(endingCurrency.equals("mxn"))
									{
										System.out.println(amount + " CNY is equal to " + (int)(amount*2.93) + " MXN");
									}
							 }

						else if(startingCurrency.equals("eur"))
							{
								if(endingCurrency.equals("usd"))
									{
										System.out.println(amount + " EUR is equal to " + (int)(amount*1.13) + " USD");
									}
								else if(endingCurrency.equals("cny"))
									{
										System.out.println(amount + " EUR is equal to " + (int)(amount*7.86) + " CNY");
									}
								else if(endingCurrency.equals("eur"))
									{
										System.out.println(amount + " EUR is equal to " + amount + " EUR");
									}
								else if(endingCurrency.equals("gbp"))
									{
										System.out.println(amount + " EUR is equal to " + (int)(amount*0.88) + " GBP");
									}
								else if(endingCurrency.equals("mxn"))
									{
										System.out.println(amount + " EUR is equal to " + (int)(amount*23.08) + " MXN");
									}
							 }

						else if(startingCurrency.equals("gbp"))
							{
								if(endingCurrency.equals("usd"))
									{
										System.out.println(amount + " GBP is equal to " + (int)(amount*1.28) + " USD");
									}
								else if(endingCurrency.equals("cny"))
									{
										System.out.println(amount + " GBP is equal to " + (int)(amount*8.88) + " CNY");
									}
								else if(endingCurrency.equals("eur"))
									{
										System.out.println(amount + " GBP is equal to " + (int)(amount*1.13) + " EUR");
									}
								else if(endingCurrency.equals("gbp"))
									{
										System.out.println(amount + " GBP is equal to " + amount + " GBP");
									}
								else if(endingCurrency.equals("mxn"))
									{
										System.out.println(amount + " GBP is equal to " + (int)(amount*26.08) + " MXN");
									}
							 }

						else if(startingCurrency.equals("mxn"))
							{
								if(endingCurrency.equals("usd"))
									{
										System.out.println(amount + " MXN is equal to " + (int)(amount*0.05) + " USD");
									}
								else if(endingCurrency.equals("cny"))
									{
										System.out.println(amount + " MXN is equal to " + (int)(amount*0.34) + " CNY");
									}
								else if(endingCurrency.equals("eur"))
									{
										System.out.println(amount + " MXN is equal to " + (int)(amount*0.04) + " EUR");
									}
								else if(endingCurrency.equals("gbp"))
									{
										System.out.println(amount + " MXN is equal to " + (int)(amount*0.038) + " GBP");
									}
								else if(endingCurrency.equals("mxn"))
									{
										System.out.println(amount + " MXN is equal to " + (int)amount + " MXN");
									}
							 }
						else
							{
								System.out.println("Sorry. This is not valid.");
							}

			         }
				choosingCurrency=false;

	          }
	}
