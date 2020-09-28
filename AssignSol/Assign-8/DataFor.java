//53. Input data exactly in the following format, and print sum of all integer values.

import java.util.Scanner;
public class DataFor {
    public static void main(String args[]){
        String str = "67, 89, 23, 67, 12, 55, 66"; 
        String[] arrOfStr = str.split("[,?.@] +"); 

        int size = arrOfStr.length;
      int [] arr = new int [size];
      for(int i=0; i<size; i++) {
         arr[i] = Integer.parseInt(arrOfStr[i]);
      }
      int sum=0;
        for (int a=0; a<arr.length; a++) 
            sum += arr[a];
            System.out.println(sum); 

    } 
    }

