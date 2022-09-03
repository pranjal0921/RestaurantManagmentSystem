import java.util.Scanner;
public class Even {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter");
        int n=in.nextInt();
        int sum=0;
        int i=0;
        int result=1;
        while(result<n)
        {
            if(i%2==0)
            {
                if(i%3==0)
                {
                    sum=sum+i;
                }
                result=result+1;
            }
            i=i+1;
        }
        System.out.println(sum);
    }
}
