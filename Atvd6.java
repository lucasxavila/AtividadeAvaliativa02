public class Atvd6 
{
  public static void main(String[] args) 
  {
  for (int i = 1; i <= 20; i++) 
  {
    System.out.println(i);
  }
  StringBuilder output = new StringBuilder();
  for (int i = 1; i <= 20; i++) 
  {
    output.append(i).append(" ");
  }     System.out.println(output.toString().trim());
  }
}