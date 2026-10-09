import java.util.Scanner;



public class UserInput{
	public static void main (String [] args){
		Scanner scan = new Scanner (System.in);
		
		
		System.out.println("---------input from user---------");
		System.out.print("Enter your name:");
		String name = scan.nextLine();
		
		System.out.print("Enter your gender:");
		char gender = scan.nextLine().charAt(0);
		
		System.out.print("Enter your adress:");
		String adress = scan.nextLine();
		
		System.out.print("Enter your age:");
		int age  = scan.nextInt();
		scan.nextLine();
		
		System.out.print(name + " Are you learning java?(true/false: " );
		boolean answer = scan.nextBoolean(); 
		System.out.println("--------------------------------------------------------\n");
		
		System.out.printf("Welcome %s, to NIIT%n", name);
		System.out.printf("You are a %c and you are living in %s.%n ", gender,adress);
		System.out.printf("You are %d years old. Nice meeting you%n", age);
		System.out.printf("Wow you said %b. it means that You are a professional Java Programmer%n",answer );
		
		
		System.out.println("Character at index 3 is " + gender);
		
		if(name.length() > 3){
            System.out.println("Character at index 3 of your name is: " + name.charAt(3));
        }
        
        scan.close();
	}
}