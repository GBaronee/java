import java.io.IOException;
import java.util.Scanner;

public class teste {
 
    public static void main(String[] args) throws IOException {
 
        try (Scanner ler = new Scanner(System.in)) {
            int a;
            int b;

            System.out.println();
            a = ler.nextInt();

            System.out.println();
            b = ler.nextInt();
            
            int x = a + b;

            System.out.println("X = " + x);
        }
 
    }
 
}