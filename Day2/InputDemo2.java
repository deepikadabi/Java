import java.util.Scanner;
class InputDemo2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int i = sc.nextInt();
        System.out.println("Enter another number : ");
        int j=sc.nextInt();
        int k = i+j;
        System.out.println("sum : "+k);
    }
}