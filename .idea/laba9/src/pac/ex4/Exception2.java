package pac.ex4;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }catch(Exception e) {
            System.out.println("Exception happened!");
        }
       // catch (NumberFormatException e){    //ошибка  - NumberFormatException уже "пойман"
       //     System.out.println("Not correct number");
       // }
        finally {
            System.out.println("finally");
        }
    }

    public static void main(String[] args) {
        Exception2 e2 = new Exception2();
        e2.exceptionDemo();
    }
}