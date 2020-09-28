import java.util.Scanner;


import java.util.Scanner;
public class day_58 {
    public static void main(String args[]){

        String [] days = {"sunday", "monday", " tuesday", "wednusday", "thrusday", "friday", "saturady"};
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        try{
        for(int i=0; i<days.length; i++){
            if(days[num] == days[i])
            {
                System.out.println(days[num]);
            }
        }
    }catch(ArrayIndexOutOfBoundsException a)
    {
        System.out.println(a);
    }
    }
}
