package functions;
// imports 
import java.util.Scanner;
/*
  int nomeVariavel = 10
  int nomeVariavel = (int) 10
  String numeroString = "10"
  int nomeVariavel = Integer(numeroString)
  * uma constante se cria colocando a palavra "final"
  final int numeroString2 = "15"
*/ 

public class Fn {
  public static void main(String[] args){
    try (Scanner keywords = new Scanner(System.in)) {
      System.out.print("Digite o nome do produto: ");
      String product = keywords.nextLine();
      System.out.print("Digite o preço do produto: ");
      float price = keywords.nextFloat();
      System.out.print("Digite seu cpf: ");
      int cpf = keywords.nextInt();
      String cpfStr = Integer.toString(cpf);

      System.out.format("O produto %s custa %.1f o cfp do comprador é %s \n",product,price,cpfStr);
    }
  }
}

