import java.util.Scanner;
public class Dateable {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scan.nextInt();
        int sophia=age/2+7;
        System.out.println(age+" year olds should date someone who is at least "+sophia+" years old");
    }
}
