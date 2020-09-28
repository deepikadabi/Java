//55.	Write a program to count no of words in the String.


public class CountW {
    public static void main(String[] args) {
        String str = "Jay deepika dabi rupali yash chetan";
        String[] arrOfStr = str.split(" ");
        int size = arrOfStr.length;
        System.out.println(size);         
    }
}
