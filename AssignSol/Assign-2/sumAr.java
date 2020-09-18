import java.util.Scanner;
class sumAr{
    public static void main(String args[])
    {
        int arr[] = new int[]{1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        for(int i=0;i<10;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println(sum);
        System.out.println(sum/10);

    }
}