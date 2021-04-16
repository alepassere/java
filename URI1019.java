import java.util.Scanner;
public class URI1019{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int segundo, minutos, horas, entrada;
                
        // entrada
        segundo = teclado.nextInt();
        minutos = teclado.nextInt();
        horas = teclado.nextInt();
        entrada = teclado.nextInt();
    
        // processamento
         horas  =  segundo / 3600;
         segundo = segundo % 3600;
         minutos = segundo / 60;
         segundo = segundo % 60;
         segundo = segundo;

         // Saida
         System.out.printf(horas +";"segundo + minutos + horas);
        
    }
}
