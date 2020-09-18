//Initialize one String type of array and print the elements using for each loop.

import java.util.Scanner;
class StringA{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of index : ");
        int num = sc.nextInt();
        String arr[] = new String[num+1];
       // System.out.println(arr.length);
        for(int i=0;i<arr.length;++i){
            arr[i] = sc.nextLine();
        }

       for(String a : arr)
        System.out.print(a+" ");

    }
}