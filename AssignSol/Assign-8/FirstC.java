//56.	Write a program to convert very first character of every word in uppercase in a String.

public class FirstC {
    public static void main(String[] args) {
        String str = "Jay deepika dabi rupali yash chetan";
        String[] arrOfStr = str.split(" ");
        int size = arrOfStr.length;
       // str.substring(0, 1).toUpperCase() + str.substring(1);
        for(int i=0; i<size; i++)
            System.out.println((Character.toUpperCase(arrOfStr[i].charAt(0)))+arrOfStr[i]);
            System.out.println(arrOfStr[i].substring(0, 1).toUpperCase());
        System.out.println();
    }
}

