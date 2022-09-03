import java.util.Scanner;
public class Person {
    private String name;
    private int age;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
        name=sc.next();
        System.out.println("enter age");
        age= sc.nextInt();
    }
    public void output(){
        System.out.println("name:" +name);
        System.out.println("age:" +age);
    }
    int get_age(){
        return age;
    }
}
