import java.util.Scanner;

public class Doubleselection{
	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Enter FullName:");
		String fullName = scan.nextLine();
		
		System.out.print("Enter Username:");
		String username = scan.nextLine();
		
		System.out.print("Enter password:");
		String password  = scan.nextLine();
		
		
		
		if(username.equals("johnnydeep") && password.equals("12345")){
			System.out.println("Acess Granted");
			System.out.println(fullName + "you are welcome");
		}
		else{
			System.out.println("Acess Denied");
		}
			
			
	}
}