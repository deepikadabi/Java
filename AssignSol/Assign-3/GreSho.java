//Sort a ten element array in descending order.
import java.util.Scanner;
class GreSho{
    public static void main(String args[])
    {
        int arr[] = new int[]{5,2,34,4,2,6,22,8,90,10};
       // int ar[] = new int[10];
        for(int i=0;i<10;i++)
        {
           // int in=0;
            for(int j=i+1;j<10;j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    //in++;
                }
            }
        }

        //for(int i=0;i<10;i++){
            System.out.println("Smallest Number : "+arr[9]);
            System.out.println("Greatest Number : "+arr[0]);

        //}
        

    }
}