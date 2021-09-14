import java.util.Scanner;

public class question5{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the preferred text: ");
	String str = sc.nextLine();
	int[] freq = new int[str.length()];
	char minChar = str.charAt(0), maxChar = str.charAt(0);
	
	int i , j ,min, max;

	char string[] = str.toCharArray();

	for(i=0; i<string.length;i++){
	freq[i] = 1;
	for(j=+1;j<string.length;j++){
	if(string[i] == string[j] && string[i] != '0' ){
		freq[i]++;
		}
	   }
	}

 	min = max =freq[0];
	for(i=0;i <freq.length; i++){
	 if (min > freq[i] && freq[i] != '0'){
		min = freq[i];
		minChar = string[i];
	}
	 
	if(max < freq[i]){
	max = freq[i];
	maxChar = string[i];
	}
	}
	System.out.println(" Minimum occuring chracter:" + minChar);
	System.out.println("Maximum occuring chracter: " + maxChar);

 }
}