//Create a class MathOperation containing overloaded methods ‘multiply’ to calculate multiplication of following arguments. 
//    a.	 two integers 
//    b.	 three floats 
//    c.	 all elements of array 
//    d.	one double and one integer 

class MathOperation{
    private double ans1;

    void mul(int a, int b){
        ans1 = (a*b);
    }

    void mul(int a, Float b){
        ans1 = (a*b);
    }
    void mul(float a, float b, float c){
        ans1 = a*b*c;
    }
    void mul(double a, int b){
        ans1 = a*b;
    }
    void show(){
        System.out.println(ans1);
    }

}
public class MulOverload {
    public static void main(String args[]){
        MathOperation m = new MathOperation();
        m.mul(2,4);     //int,int
        m.show();
        m.mul(2, 3,4);   //int, int, int
        m.show();
        m.mul(2, 2.4f);      //int, double
        m.show();
        m.mul(2.4,5);       //double, int
        m.show();
    }
}
