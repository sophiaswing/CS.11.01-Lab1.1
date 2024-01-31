import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scan.nextInt();
        int sophia=100-age;
        System.out.println(age+" year olds should read at least "+sophia+" pages before giving up on a book");
    }
}
