public class account {
    private String name;
    private float balance;
    public account(String n, float bal){
        name=n;
        balance=bal;
    }
    public void deposit(float amount){
        System.out.println("update rcord");
        balance+=amount;
        record();
    }
    public void record(){
        System.out.println("name" +name);
        System.out.println("balance" +balance);
    }
    public static void main(String[] args){
        account a1=new account("pranjal", 210);
        account a2=new account("prakhar", 330);
        a1.record();
        a2.record();
        a1.deposit(400);
        a2.deposit(210);
    }
}
