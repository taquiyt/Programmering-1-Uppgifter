import java.util.Scanner;
public class GenderGame {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("What is your gender? (M or F):");
		String gender,fname,lname,married;
		int age;
		gender=input.nextLine();
		System.out.print("\nFirst Name:");
		fname=input.nextLine();
		System.out.print("\nLast Name:");
		lname=input.nextLine();
		System.out.print("\nAge:");
		age = input.nextInt();
		if(gender.equals("F") && age>20){
			System.out.println("Are you married," + fname +" y or n?");
			married =input.next();
			if (married.equals("y")){
				System.out.println("Then I shall call you Mrs." + lname);
			}else if (married.equals("n")){
				System.out.println("Then I shall call you Ms." + lname);
			}
		}else if(gender.equals("F") && age < 20){
			System.out.println("Then i Shall call you" + fname + " "+ lname);
		}else if (gender.equals("M") && age <20){
			System.out.println("Then I shall call you" + fname +" " +lname);
			}else if(gender.equals("M") && age >20){
				System.out.println("Then i shall call you Mr."+fname +" "+ lname);
			}
	}
}
