import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter the key: ");
        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine();
        while(key.length() != 8)
        {
            System.out.println("Invalid key length. Key must be 8 characters long.");
            System.out.println("Enter a valid key: ");
            key = scanner.nextLine();
        }
        Cipher cipher= new Cipher(key);

    }
}
