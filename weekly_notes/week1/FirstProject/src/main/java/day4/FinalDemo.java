package day4;
/*final keyword
-----------------

class final 	- it cannot be inherited
method final 	- it cannot be overridden
variable final	- it cannot be changed once assigned,
*/
 class A
{
   final int MAX_AGE=120;
        void display(){
        }
}
class B extends A
{
    @Override
    void display() {
        super.display();
    }
}
public class FinalDemo {
}
