public class Student {
    int roll_no;
    Address address;
    String name;
    public Student(int r, String n, Address add) {
        roll_no = r;
        name = n;
        address = add;
    }
    public static void main(String[] args)
    {
        Address a=new Address("university_campus", "udaipur", "rajasthan", 5);
        Student S=new Student(001, "pranjal", address1);
        s.display();
    }
    void display()
    {
        System.out.println(roll_no+" "+name);
        System.out.println(address.street_name+" "+address.city+" "+address.state+" "+address.house_no);
    }

}

