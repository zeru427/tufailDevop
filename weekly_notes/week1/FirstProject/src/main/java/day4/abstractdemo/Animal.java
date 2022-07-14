package day4.abstractdemo;

public abstract class Animal {
    public abstract void makeNoise();
    public abstract void eat();
    public void sleep() {
        System.out.println("Animal must get sleep to recharge");
    }
    public abstract void roam();
}
abstract class Feline extends Animal{
    @Override
    public void roam() {
        System.out.println("All ffelines will raqom ");
    }
}
class Lion {

}
class Tiger {

}
class Cat {

}