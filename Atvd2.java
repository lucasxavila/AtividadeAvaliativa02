import java.util.Scanner;

public class Atvd2 
{
  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);
    String nome;
    String senha = "";

    System.out.print("Digite seu nome: ");
    nome = scanner.nextLine();
    System.out.print("Digite sua senha: ");
    senha = scanner.nextLine();
    while (senha.equals(nome))
    {
      System.out.print("Senha inválida. Informe a senha novamente: ");
      if (scanner.hasNext());
      {
        senha = scanner.next();
      }
    }
    System.out.println("Senha válida");
    scanner.close();
  }
}