package day4;

abstract class Animal {
    int maxAge;
       public Animal(){
           this.maxAge=120;
           System.out.println("Animal Cons");
        }
    public abstract void eat();
       public void party(){
           System.out.println("Party Hard");
       }
}
class Dog extends  Animal{
    public Dog(){
        System.out.println("Dog Cons");
    }
    @Override
    public void eat() {
        System.out.println("Dog eats meat");
    }
    //must override eat method
}
//is- a test
public class InheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}
