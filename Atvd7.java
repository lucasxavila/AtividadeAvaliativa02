import java.util.Scanner;
public class Atvd7 
{
  public static void main(String[] args) 
  {
    int numero, maiorNumero = 0;
    Scanner scanner = new Scanner(System.in);
    for (int i = 1; i <= 5; i++) 
    {
      System.out.print("Coloque o " + i + "º número: ");
      numero = scanner.nextInt();
      if (numero > maiorNumero) 
      {
        maiorNumero = numero;
      }
    }
    System.out.println("O maior número é: " + maiorNumero);
    scanner.close();
  }
}

