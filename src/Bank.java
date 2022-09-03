public class Bank {
    float getInterest()
    {
        return 0;
    }
    public static void main(String[] args)
    {
        Bank b;
        b=new SBI();
        System.out.println("interest is:" +b.getInterest());
        b=new ICICI();
        System.out.println("interest is:" +b.getInterest());
    }
}
class SBI extends Bank{
    float getInterest()
    {
        return 8.3f;
    }
}
class ICICI extends Bank{
    float getInterest()
    {
        return 9.5f;
    }
}
