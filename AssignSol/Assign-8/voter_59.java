import java.io.IOException;
import java.util.Scanner;
class Voter{
    int id;
    String name;
    int age;
    Voter(int id, String name, int age) throws Exception{
        this.id = id;
        this.name = name;
        this.age = age;
        if(age<18){
            throw new Exception();
        }
    }
}

public class voter_59{
    public static void main(String args[]){
        int id, age;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id, name & age :");
        id = sc.nextInt();
        name = sc.next();
        age = sc.nextInt();
        try{
            Voter v = new Voter(id,name,age);
        }
        catch(Exception ex){
            System.out.println("Invalid age entered");
        }
    }
}



