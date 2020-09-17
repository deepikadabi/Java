import java.util.Scanner;
class InputDemo1{
    public static void main(String args[]){
        Scanner sc = new Scanner("123 321");
        int i = sc.intNext();
        int j = sc.intNext();
        int k =i+j;
        System.out.println(k);
    }
}