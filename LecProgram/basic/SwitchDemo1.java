import java.util.Scanner;
class SwitchDemo1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any character");
		char ch = sc.next().charAt(0);
		switch(ch){
			case 'a' :
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' :
			System.out.println(ch+" is a vowel lower");
				break;
			case 'A' :
			case 'E' :
			case 'I' :
			case 'O' :
			case 'U' :
			System.out.println(ch+" is a vowel UPPER");
				break;			
			default :
				System.out.println("not a vowel");
			
		}
	}
}
