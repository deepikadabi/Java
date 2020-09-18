import java.util.Scanner;
class Rev{
    public static void main(String args[])
    {
        int arr[] = new int[]{5,2,34,4,2,6,22,8,90,10};
        int l = arr.length;
        for(int i=l-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }

    }
}