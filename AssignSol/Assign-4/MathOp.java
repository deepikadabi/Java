import java.util.Scanner;
import java.lang.Math;

class MathOpe{
    private int sum;
    private int sub;
    private int mul;
    private double pow;
    void sum(int a, int b){
        sum = a+b;
    }
    void sub(int a, int b){
        sub = a-b;
    }
    void mul(int a, int b){
        mul = a*b;
    }
    void pow(int a, int b){
        pow = Math.pow(a, b);
    }
    void show(){
        System.out.println(sum+"   "+sub+"   "+mul+"   "+pow);
    }
}

public class MathOp {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entet two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        MathOpe m = new MathOpe();
        m.sum(a, b);
        m.sub(a, b);
        m.mul(a, b);
        m.pow(a, b);
        m.show();
    }
}
