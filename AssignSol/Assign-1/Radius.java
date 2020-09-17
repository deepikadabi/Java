//	Write a program that takes radius of a circle as input. Read the entered radius using Scanner class.
//  Then calculate and print the area and circumference of the circle.
import java.util.Scanner;
class Radius{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius : ");
        float i = sc.nextFloat();
        float area = (float)(3.14 * i * i);
        float cir = (float)(2 * 3.14 * i);
        System.out.println("Area of " +i+ " is : "+area+ "\nCircumference of "+i+ " is : "+cir);
    }
}