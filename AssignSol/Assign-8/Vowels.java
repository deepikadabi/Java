import java.util.Scanner;

//52.	Input name of a person and count how many vowels it contains.  Use String class functions. 

public class Vowels {
    public static void main(String args[]){
        String name;
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        int count=0;
        for(int i=0; i<name.length(); i++){
            if(Character.toLowerCase(name.charAt(i)) == 'a' ||
               Character.toLowerCase(name.charAt(i)) == 'e' ||
               Character.toLowerCase(name.charAt(i)) == 'i' ||
               Character.toLowerCase(name.charAt(i)) == 'o' ||
               Character.toLowerCase(name.charAt(i)) == 'u'){
                count++;
            }

        }
        System.out.println(count);

    }
}
