//41.	Write a program to demonstrate this() construct functionality.
class Demo{
    int id;
    String name;

    Demo(){
        this(1,"deepika");
        System.out.println("Default constructor");
    }
    Demo(int id, String name){
        this.id = id;
        this.name = name;
        System.out.println("Param Constructor");
    }
}

public class thisCon {
    public static void main(String args[]){
    Demo d = new Demo();
}
}
