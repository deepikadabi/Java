import java.util.Scanner;
class Search{
    public static void main(String args[]){
        int arr[] = new int[]{5,2,34,4,2,6,22,8,90,10};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to search : ");
        int num = sc.nextInt();
        int flag=0;
        for(int i=0;i<arr.length;i++)
        {
            if(num == arr[i])
            {
                flag=1;
            }
           
        }

        if(flag==1)
        System.out.println("Present in Array!!!");

        else
        System.out.println("Not Present in Array!!!");
    }
}