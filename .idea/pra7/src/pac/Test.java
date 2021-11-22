package pac;

public class Test {
    public static void main(String[] args) {
        System.out.println("\nDeque:");
        System.out.println(new Game3("24680", "13579").play());
        System.out.println(new Game3("12345", "67890").play());
        System.out.println(new Game3("13029", "42685").play());
        System.out.println("\nStack:");
        System.out.println(new Game1("24680", "13579").play());
        System.out.println(new Game1("12345", "67890").play());
        System.out.println(new Game1("13029", "42685").play());
        System.out.println("\nQueue:");
        System.out.println(new Game2("13579", "13579").play());
        System.out.println(new Game2("12345", "67890").play());
        System.out.println(new Game2("13029", "42685").play());
    }

}
