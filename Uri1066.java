import java.util.Scanner;

public class Uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numero, QtPar, QtImp, QtPos, QtNeg;

        QtPar = 0;
        QtImp = 0;
        QtPos = 0;
        QtNeg = 0;

        for (int cont=1; cont<=5; cont++){
            numero = teclado.nextInt();
            if (numero % 2 ==0){
                QtPar++;
            }
            else{
                QtImp++;
            }

            if (numero > 0){
                QtPos++;
            }
            else if (numero < 0){
                QtNeg++;
            }
        }
        System.out.println(QtPar + "valor(es) par(es)");
        System.out.println(QtImp + "valor(es) impar(es)");
        System.out.println(QtPos + " valor(es) positivo(s)");
        System.out.println(QtNeg + "valor(es) negativo(s)");
    }
}