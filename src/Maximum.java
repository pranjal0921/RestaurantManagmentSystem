import java.util.Scanner;
public class Maximum {
        public static void main(String[] args){
            Scanner s=new Scanner(System.in);
            System.out.println("Enter a number");
            int a=s.nextInt();
            System.out.println("Enter a number");
            int b=s.nextInt();
            System.out.println("Enter a number");
            int c=s.nextInt();
            if(a>b&&a>c){
                System.out.println( a+ " is maximum");
            }
            else if(b>a&&b>c){
                System.out.println("b is maximum");
            }
            else
                System.out.println("c is maximum");
        }
    }
