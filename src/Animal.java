public class Animal {
    void eat() {
        System.out.println("eating");
    }

    public static void main(String[] args) {
        Cat c = new Cat();
        Puppy d=new Puppy();
        d.bark();
        c.eat();
        c.meow();
        d.weep();

    }
}
class Dog extends Animal{
    void bark()
    {
        System.out.println("barking");
    }
}
class Cat extends Animal{
    void meow()
    {
        System.out.println("meowing");
    }
}
class Puppy extends Dog{
    void weep()
    {
        System.out.println("weeping");
    }
}

