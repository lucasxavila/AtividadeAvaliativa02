import java.util.Scanner;

public class Atvd30 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Preço do pão: R$ ");
    double precoPao = scanner.nextDouble();
    if (precoPao <= 0) {
      System.out.println("Preço inválido.");
      return;
    }
    System.out.println("Panificadora Pão de Ontem - Tabela de preços");
    for (int i = 1; i <= 50; i++) {
      double precoTotal = i * precoPao;
      System.out.println(i + " - R$ " + String.format("%.2f", precoTotal));
    }
  }
}