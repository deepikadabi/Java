import java.util.Scanner;
class Circle{
    private int radius;
    private double area;
    void init(){
        System.out.println("Enter Radius : ");
        Scanner sc = new Scanner(System.in);
        radius = sc.nextInt();
    }
    void area(){
       area = (double)(3.14*radius*radius);
    }
    void show(){
        System.out.println(area);
    }
}

public class CircleDemo {
    public static void main(String args[])
    {
    Circle c = new Circle();
    c.init();
    c.area();
    c.show();
    
}
}