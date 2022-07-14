package day3;
class Animal {
    int maxAge=120;

    public Animal() {
        System.out.println("Animal class default constructor");
    }

    public Food eat(){
        System.out.println("Animal eats food");
        return null;
    }
    public static void drink(){
        System.out.println("Animal drinks WATER");
    }
}
class Dog extends  Animal{
    int maxAge = 30;        //hiding    -
    public Dog() {
        System.out.println("Dog class default constructor");
    }
    public void displayDetails(){
        int maxAge= 10;
        System.out.println("Maximum age is :"+maxAge);
        System.out.println("Maximum age of dog is :"+this.maxAge);
        System.out.println("Maximum age of animal is :"+super.maxAge);
    }
    //hiding
    public static void drink(){
        System.out.println("DOG drinks WATER");
    }
    //** overriding - when a child class re writes the super class method
    //In any object-oriented programming language, Overriding is a feature that allows a subclass or child class to
    // provide a specific implementation of a method that is already provided by one of its super-classes or parent classes.
    public Pizza eat(){
        System.out.println("Dog eats meat");
        super.eat();
        return null;
    }
}
//is- a test
public class InheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.displayDetails();
        d.eat();
        d.drink();
    }
}
