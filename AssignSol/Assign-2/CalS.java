//19.	Calculate  series : 12+22+32+42+.........+n2
import java.util.Scanner;
class CalS{
    public static void main(String args[]){
        System.out.println("Enter num : ");
        Scanner sc = new Scanner(System.in);
        int num=0;
        int sum=0;
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            num = i*10+2;
            sum=num+sum;
        }
        System.out.println(sum);

    }
}