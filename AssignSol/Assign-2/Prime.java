//	Program to check whether number is prime or not.
import java.util.Scanner;
class Prime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int counter=0;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                counter++;
            }
        }
        if(counter>1)
        {
            System.out.println("NOt A prime ");
        }
        else
            System.out.println("Prime");
    }

}