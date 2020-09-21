//37.	Create a class Person with properties (name and age) with following features. 
//  a.	Default age of person should be 18.
//  b.	A person object can be initialized with name and age.
//  c.	Method to display name and age of person
//Create another class PersonDemo ( main class ) that demonstrates the functionalities of Person class by creating Person object and calling methods.


import java.util.Scanner;

class PersonDemo{
    private String name;
    private int age;

    PersonDemo(int age, String name){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println(name+"  "+age);
    }
}
public class Person {
    public static void main(String args[]){
        java.util.Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name : ");
        String name = sc.next();
        PersonDemo p = new PersonDemo(18, name);
        p.display();

    }
}
