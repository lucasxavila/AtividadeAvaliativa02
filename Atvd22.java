import java.util.Scanner;

public class Atvd22 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um número inteiro: ");
    int numero = scanner.nextInt();
    boolean ehPrimo = true;
    String divisores = "";
    if (numero <= 1) {
      ehPrimo = false;
    } else {
      for (int i = 2; i <= numero / 2; i++) {
        if (numero % i == 0) {
          ehPrimo = false;
          divisores += i + ", ";
        }
      }
    }
    if (ehPrimo) {
      System.out.println(numero + " é um número primo.");
    } else {
      System.out.println(numero + " não é um número primo.");
      System.out.println("É divisível por: " + divisores.substring(0, divisores.length() - 2));
    }
  }
}