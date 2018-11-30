
import java.util.ArrayList;
import java.util.Scanner;
public class ConversionRunner
	{
		static Scanner userInput_int = new Scanner(System.in);
		static Scanner userInput_String = new Scanner(System.in);
		static Scanner userInput_double = new Scanner(System.in);
		public static void main(String[] args)
			{
				greetUser();
				do
					{
						int userChoice = pickConversionType();
						switch(userChoice)
						{
							case 1:
								temperatureConversion();
								break;
							case 2:
								weightConversion();
								break;
							case 3:
								DistanceConverter.distanceConversion();
								break;
							case 4:
								TimeConversion.timeConverter();
								break;
						
						} 
					} while(askRepeat());
			}
		public static void greetUser()
			{
				System.out.println("Hello, User! Welcome to the Universal Converter.");
				System.out.println("You can perform many kinds of conversions with this tool. Let's get started!");
			}
		public static int pickConversionType()
		{
			System.out.println("\nWhat kind of conversions would you like to do today?"
					+ "\n 1) Temperature"
					+ "\n 2) Weight"
					+ "\n 3) Distance"
					+ "\n 4) Time");

			int choice = userInput_int.nextInt();
			if(choice > 0 && choice < 5)
				{
					return choice;
				}
			else
				{
					System.out.println("I guess that's none of them. Goodbye!");
					return 0;
				}
		}

  public static void timeConversion()
		{
			String[] timeUnits = {"Milliseconds", "Seconds", "Minutes", "Hours", "Days", "Weeks", "Years", "Decades", "Centuries"};
			boolean choosingStartingUnit = true;
			String startingUnit = "";
			while (choosingStartingUnit)
				{
					System.out.println("What's your unit of time you want to convert from?");
					for (String s: timeUnits)
						{
							System.out.println(" " + s);
						}
					startingUnit = userInput_String.nextLine();
					for (String s: timeUnits)
						{
							if (startingUnit.toLowerCase().equals(s.toLowerCase()))
								choosingStartingUnit = false;
						}
				}
			
			boolean choosingEndingUnit = true;
			boolean sameUnit = false;
			while (choosingEndingUnit)
				{
					System.out.println("What's your unit of time you want to convert to?");
					for (String s: timeUnits)
						{
							System.out.println(s);
						}
					String endingUnit = userInput_String.nextLine();
					for (String s: timeUnits)
						{
							if (endingUnit.toLowerCase().equals(s.toLowerCase()))
								{
									if (endingUnit.toLowerCase().equals(startingUnit.toLowerCase()))
										sameUnit = true;
									
									else
										choosingStartingUnit = false;
								}
						}
				}
		}
  public static void temperatureConversion()
	  {
		  double temp = 0;
		  double conversionFactor = 5;
		  conversionFactor /= 9;
		  int unitFrom = 0;
		  int unitTo = 0;
		  String[] capUnits = {"Farenheit", "Celsius", "Kelvin", "Rankine"};
		  boolean pickedGoodUnit = false;
		  
		  System.out.println("What's the temperature you'd like to convert?");
		  temp = userInput_double.nextDouble();
		  while(!pickedGoodUnit)
			  {
				  System.out.println("What system of temperature is that?");
				  for(int j = 1; j <= capUnits.length; j++)
					  {
						  System.out.println(" " + j + ") " + capUnits[j-1]);
					  }
				  unitFrom = userInput_int.nextInt();
				  if(unitFrom > 0 && unitFrom < 5)
					  {
						  pickedGoodUnit = true;
					  }
				  else
					  {
						  System.out.println("Please pick one of the available temperature systems.");
					  }
			  }
		  pickedGoodUnit = false;
		  while(!pickedGoodUnit)
			  {
				  System.out.println("Now, what temperature system would you like to convert to?");
				  for(int j = 1; j <= capUnits.length; j++)
					  {
						  System.out.println(" " + j + ") " + capUnits[j-1]);
					  }
				  unitTo = userInput_int.nextInt();
				  if(unitTo > 0 && unitTo < 5)
					  {
						  pickedGoodUnit = true;
					  }
				  else
					  {
						  System.out.println("Please pick one of the available temperature systems.");
					  }
			  }
		  switch(unitFrom)
		  	{
		  		case 1:
		  			temp -= 32;
		  			temp *= conversionFactor;
		  			break;
		  		case 2:
		  			break;
		  		case 3:
		  			temp -= (double)273.15;
		  			break;
		  		case 4:
		  			temp -= 32;
		  			temp *= conversionFactor;
		  			temp -= (double)273.15;
		  			break;
		  	}
		  switch(unitTo)
		  	{
		  	case 1:
		  		temp /= conversionFactor;
		  		temp += 32;
	  			break;
	  		case 2:
	  			break;
	  		case 3:
	  			temp += 273.15;
	  			break;
	  		case 4:
	  			temp /= conversionFactor;
		  		temp += 32;
	  			temp += 273.15;
	  			break;
		  	}
		  System.out.printf("The temperature is %.3f\n", temp);
	  }
  
  
  public static void weightConversion() {
	  String[] weightunits = {"kilogram", "gram", "ton", "pound","ounce"};
	  boolean choosingStartWeight = true;
	  String startingUnit = "";
	  while(choosingStartWeight) {
		  System.out.println("What's the unit of weight you want to convert from?");
		  for(String a: weightunits) {
			  System.out.println(a);
			
		  }
		  Scanner userInput = new Scanner(System.in);
		  startingUnit = userInput.nextLine();
		  
		  
		  for(String a : weightunits) {
			  if (startingUnit.toLowerCase().equals(a.toLowerCase()))
					choosingStartWeight = false;
		  }
		  
		  
	  }
	 
	  
	  System.out.println("Put in the value of this weight.");
	  Scanner userInput2 = new Scanner(System.in);
	  double startingValue = userInput2.nextDouble();
	  
	 
	  
	  boolean choosingEndWeight = true;
	  boolean sameUnit = false;
	
		  System.out.println("What's the unit of weight you want to convert to?");
		  for(String a : weightunits) {
			  System.out.println(a);
		  }
		  Scanner userInput = new Scanner (System.in);
		  String endingUnit = userInput.nextLine();
		  for(String a : weightunits) {
			  if (endingUnit.toLowerCase().equals(a.toLowerCase()))
					{
						if (endingUnit.toLowerCase().equals(startingUnit.toLowerCase()))
							sameUnit = true;
						
						else
							choosingStartWeight = false;
						
						
					}
		  
			 
		  }
	  
		  
		  if(startingUnit.equals("kilogram")) {
			   if(endingUnit.equals("gram")) {
				   double endingValue1 = startingValue*1000;
				   System.out.println("The result is "+ endingValue1 + " grams.");
			   }
			   if(endingUnit.equals("ton")) {
				   double endingValue2 = startingValue/1000;
				   System.out.println("The result is "+ endingValue2 + " tons.");
			   }
			   if(endingUnit.equals("pound")) {
				   double endingValue3 = startingValue*2.20462;
				   System.out.println("The result is "+ endingValue3 + " pounds.");
			   }
			   
			   if(endingUnit.equals("ounce")) {
				   double endingValue4 = startingValue*35.274;
				   System.out.println("The result is "+ endingValue4 + " ounces.");
			   } 
			   
			  
			  }
		  
		  
		  if(startingUnit.equals("gram")) {
			   if(endingUnit.equals("kilogram")) {
				   double endingValue5 = startingValue/1000;
				   System.out.println("The result is "+ endingValue5 + " grams.");
			   }
			   if(endingUnit.equals("ton")) {
				   double endingValue6 = startingValue/1000000;
				   System.out.println("The result is "+ endingValue6 + " tons.");
			   }
			   if(endingUnit.equals("pound")) {
				   double endingValue7 = startingValue*0.00220462;
				   System.out.println("The result is "+ endingValue7 + " pounds.");
			   }
			   
			   if(endingUnit.equals("ounce")) {
				   double endingValue8 = startingValue*0.035274;
				   System.out.println("The result is "+ endingValue8 + " ounces.");
			   }
			   
			  }
		  
		  if(startingUnit.equals("ton")) {
			   if(endingUnit.equals("kilogram")) {
				   double endingValue5 = startingValue*1000;
				   System.out.println("The result is "+ endingValue5 + " kilograms.");
			   }
			   if(endingUnit.equals("gram")) {
				   double endingValue6 = startingValue*1000000;
				   System.out.println("The result is "+ endingValue6 + " grams.");
			   }
			   if(endingUnit.equals("pound")) {
				   double endingValue7 = startingValue*2000;
				   System.out.println("The result is "+ endingValue7 + " pounds.");
			   }
			   
			   if(endingUnit.equals("ounce")) {
				   double endingValue8 = startingValue*32000;
				   System.out.println("The result is "+ endingValue8 + " ounces.");
			   }
			  
			  }
		  
		  if(startingUnit.equals("pound")) {
			   if(endingUnit.equals("kilogram")) {
				   double endingValue5 = startingValue*0.453592;
				   System.out.println("The result is "+ endingValue5 + " kilograms.");
			   }
			   if(endingUnit.equals("gram")) {
				   double endingValue6 = startingValue*453.592;
				   System.out.println("The result is "+ endingValue6 + " grams.");
			   }
			   if(endingUnit.equals("ton")) {
				   double endingValue7 = startingValue*0.0005;
				   System.out.println("The result is "+ endingValue7 + "tons.");
			   }
			   
			   if(endingUnit.equals("ounce")) {
				   double endingValue8 = startingValue*16;
				   System.out.println("The result is "+ endingValue8 + " ounces.");
			   }
			   
			  }
		 
		  if(startingUnit.equals("ounce")) {
			   if(endingUnit.equals("kilogram")) {
				   double endingValue5 = startingValue*0.0283495;
				   System.out.println("The result is "+ endingValue5 + " kilograms.");
			   }
			   if(endingUnit.equals("gram")) {
				   double endingValue6 = startingValue*28.3495;
				   System.out.println("The result is "+ endingValue6 + " grams.");
			   }
			   if(endingUnit.equals("ton")) {
				   double endingValue7 = startingValue*0.000031249974509375;
				   System.out.println("The result is "+ endingValue7 + "tons.");
			   }
			   
			   if(endingUnit.equals("pound")) {
				   double endingValue8 = startingValue*0.062499949018750007579;
				   System.out.println("The result is "+ endingValue8 + " pounds.");
			   }
			  
			   
			  }
	  
	 
  }

  //this is coco's final version
  public static boolean askRepeat()
	  {
		  System.out.println("Would you like to \n"
		  		+ "1) Calculate another conversion, or \n"
		  		+ "2) Are you finished?");
		  int userChoice = userInput_int.nextInt();
		  switch(userChoice)
		  {
			  case 1:
				  return true;
			  case 2:
				  return false;
			  default:
				  break;
		  }
		  return false;
	  }

	}
 


