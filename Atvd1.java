import java.util.Scanner;
public class Atvd1 
{
  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);
    float nota = -1;

    while (nota < 0 || nota > 10)
    {
      System.out.print("Informe sua nota (entre 0 e 10): ");
      if (scanner.hasNextFloat());
      {
        nota = scanner.nextFloat();
        if (nota < 0 || nota > 10)
        {
          System.out.println("Nota inválida. Informe um número entre 0 e 10.");
        }
      }
    }
    System.out.println("Nota informada: " + nota);
    scanner.close();
  }
}