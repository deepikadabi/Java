//Write a program to find the simple interest. Take the principle amount, rate of interest and 
//time from user using Scanner class.
import java.util.Scanner;
class SI{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount, Rate & time : ");
        int a = sc.nextInt();
        float r = sc.nextFloat();
        int t = sc.nextInt();

        float si = (float)(a*r*t/100);
        System.out.println("Simple intrest is : "+si);
    }
}