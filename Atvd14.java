import java.util.Scanner;

public class Atvd14 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int[] numeros = new int[10];
    
    for (int index = 0; index < 10; index++) {
      System.out.print("Digite o " + (index + 1) + "º Número: ");
      numeros[index] = teclado.nextInt();
    }
    for (int index = 0; index < 10; index++) {
      if (numeros[index] % 2 == 0) {
        System.out.println(numeros[index] + ": Par");
      } else {
        System.out.println(numeros[index] + ": Ímpar");
      }
    }
  }
}