package day6;

public class Main {
    public static void main(String[] args)  {
        try{
            int arr[] = new int[10];
            System.out.println(arr[5]);
            int a = 1, b = 0;
            System.out.println(a/b);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Your array is out of bounds.");
        }
        catch(ArithmeticException e){
            System.out.println("That's bad math! Can't compute.");
            //
            try {
                throw new Exception("Also some other error occurred");
            } catch (Exception ex) {
                System.out.println("There must be something else wrong... inside nested catch");
            }
        }
        catch(Exception e){
            System.out.println("There must be something else wrong...");
        }
        finally {
            System.out.println("Done checking exceptions");
        }
    }
  }