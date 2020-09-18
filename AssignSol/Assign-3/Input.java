//Write a program to print the total number of one-D arrays in a two-D array and the number of 
//elements in every one-D array present in the two-D arrays.
import java.util.Scanner;
class input{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int t, e; 
        t = scanner.nextInt(); 
        e = scanner.nextInt(); 

        int[][] arr = new int[t][e]; 

        for (int i = 0; i < arr.length; i++) { 
            //e = scanner.nextInt(); 
            //arr[i] = new int[e]; 
            for (int j = 0; j < arr[i].length; j++) { 
                arr[i][j] = scanner.nextInt(); 
            } 
        } 

        for(int i=0; i < arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j]+" ");
            } 
            System.out.println("");
        }


    }
}