import java.util.Scanner;

public class Assig_Day3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User Age here...!");
		int age=sc.nextInt();
		//System.out.println("User Age is: "+age);
		if(age>18)
		{
			System.out.println("User are eligible to vote in a national election..!");
		}
		else
		{
			System.out.println("access denied user, User are Not eligible to vote..!");
		}

	}

}
