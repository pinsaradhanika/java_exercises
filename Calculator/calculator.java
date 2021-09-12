import java.util.Scanner;

public class calculator{
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
  	  
	  System.out.println("Enter the 1st digit:");
	  int A = sc.nextInt();
	  System.out.println("Enter the 2nd Digit:");
	  int B = sc.nextInt();
	  
  	  System.out.println("Enter the operator");
	  char operator = sc.next().charAt(0);

	  double answer;

	  switch(operator){
  	      case '+' :
		answer = A+B;
		System.out.println("Answer is "+answer);
		break;

	      case '-' :
		answer = A-B;
		System.out.println("Answer is "+answer);
		break;

	      case '*' :
		answer = A*B;
		System.out.println("Answer is "+answer);
		break;

	      case '/' :
		 answer = (double)A/B;
		System.out.println("Answer is "+answer);
		break;
	
	     default:
		System.out.println("Error.....incorrect input");
	     }

  }
}