import java.util.Scanner;
public class person_test {
    public static void main(String[] args){
    Person p1=new Person();
    Person p2=new Person();
    p1.input();
    p2.input();
    System.out.println("elder details");
    if(p1.get_age()>=p2.get_age())
        p1.output();
    else
        p2.output();
}
}
