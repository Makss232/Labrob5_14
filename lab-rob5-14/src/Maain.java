import java.util.Scanner;

public class Maain {
    public static void main(String[] args) {
        Scanner maksim = new Scanner(System.in);

        System.out.print("Введіть перше ім'я: ");
        String firstName = maksim.nextLine();

        System.out.print("Введіть друге ім'я: ");
        String secondName = maksim.nextLine();

        if (firstName.equalsIgnoreCase(secondName)) {
            System.out.println("Імена однакові.");
        } else {
            System.out.println("Імена різні.");
        }
    }
}
