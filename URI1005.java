import java.util.Scanner;
public class URI1005{
    
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);

        double A;
        double B;
        double Media;

        A = teclado.nextDouble();
        B = teclado.nextDouble();

        Media=(A*3.5 + B*7) /11;

        System.out.println("média = %5f/n, media");

    }
}
