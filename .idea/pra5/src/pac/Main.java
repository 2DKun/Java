package pac;

public class Main {

    public static void main(String[] args) {
        Palindrom pal = new Palindrom();
        No2zero no = new No2zero();
        reflection ref = new reflection();


        System.out.println("Задача про нули");
        System.out.println(no.rec(5, 8));
        System.out.println("Задача про запись числа наоборот");
        System.out.println(ref.rec(158, 0));
        System.out.println("Задача про палиндом");
        if (pal.rec("level")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
