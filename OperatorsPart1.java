public class OperatorsPart1{
	public static void main (String [] args){
		//Assignment Operator(=)
		
		
		int num = 200;
		
		System.out.printf("Number is %d%n",num);
		
		//Arithmetic Operator(+ - * / %)
		int num1 = 50;
		int num2= 200;
		
		int addition = num1 + num2; 
		int subtraction = num1 - num2; 
		int multiplication = num1 * num2; 
		double division = (double)num1 / num2;
		int remainder = num1 % num2; 
		
		
		//Compound assignment operator(+=,-=,/=,%=)
		int number1 = 20;
		int number2 = 2;
		
		number1 += number2;
		number1 -= number2;
		number1 *= number2;
		number1 /= number2;
		number1 %= number2;
		
		
		System.out.println("----Arithmetic output-------------------");
		System.out.printf("%d + %d = %d%n ",num1,num2,addition);
		System.out.printf("%d - %d = %d%n ",num1,num2,subtraction);
		System.out.printf("%d x %d = %d%n ",num1,num2,multiplication);
		System.out.printf("%d / %d = %.2f%n ",num1,num2,division);
		System.out.printf("%d %% %d = %d%n ",num1,num2,remainder);
		System.out.println("--------------------------------------");
		
		
		System.out.println("----------------Compound Assignment output------------------------------------");
		System.out.printf("The value of number1 has been updated to %d%n",number1);
		number1 += number2;
		
		System.out.printf("The value of number1 has been updated to %d%n",number1);
		number1 -= number2;
		
		System.out.printf("The value of number1 has been updated to %d%n",number1);
		number1 *= number2;
		
		System.out.printf("The value of number1 has been updated to %d%n",number1);
		number1 /= number2;
		
		System.out.printf("The value of number1 has been updated to %d%n",number1);
		number1 %= number2;
		System.out.println("----------------------------------------------------");
		
		
		//Relational operator (>,<,>=,<=,==,!=)
		int x = 90;
		int y = 51;
		
		
		boolean isGreater = x > y;
		boolean isLessThan  = x < y;
		boolean isGreaterorEqualTo = x >= y;
		boolean isLessThanorEqualTo = x >= y;
		boolean isEqualTo = x == y;
		boolean isNotEqualTo = x != y;
		
		
		
		System.out.println("----------------Relational-----------------");
		System.out.printf("Is %d > %d = %b%n",x,y,isGreater);
		System.out.printf("Is %d < %d = %b%n ",x,y,isLessThan);
		System.out.printf("Is %d >= %d = %b%n ",x,y,isGreaterorEqualTo);
		System.out.printf("Is %d <= %d = %b%n",x,y, isLessThanorEqualTo);
		System.out.printf("Is %d == %d = %b%n ",x,y,isEqualTo);
		System.out.printf("Is %d != %d = %b%n ",x,y,isNotEqualTo);
		
	}
}