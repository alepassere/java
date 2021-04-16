import java.util.Scanner; /
public class exercicio2{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
      
      float lado, area;
      // entrada
        System.out.println("digite o valor do lado do quadrado");
       lado = input.nextFloat();

       // processamento
       area=lado *lado;

       // saida
       System.out.printf("area de um quadrado");


    }
}