package homework_week_8;

// Java program to overload constructors
public class Program_25_ConstructorOverLoadingExample {

    int id;
    String name;
    int age;

    // creating two arg constructor
    Program_25_ConstructorOverLoadingExample(int i, String n) {
        id = i;
        name = n;
    }

    // creating three arg constructor
    Program_25_ConstructorOverLoadingExample(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        Program_25_ConstructorOverLoadingExample s1 = new Program_25_ConstructorOverLoadingExample(111, "Karan");
        Program_25_ConstructorOverLoadingExample s2 = new Program_25_ConstructorOverLoadingExample(222, "Aryan", 25);
        s1.display();
        s2.display();
    }
}
