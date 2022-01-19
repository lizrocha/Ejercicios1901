package ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("----Impuestos----");
        System.out.println("Ingrese la opcion correspondiente");
        System.out.println("Impuesto 1 → 2,45% sobre el valor total");
        System.out.println("Impuesto 2 → 15% sobre el valor total");
        System.out.println("Impuesto 3 → 3% sobre el valor total");

        int op = teclado.nextInt();
        int premio = (int) 23563899.00;
        switch (op){
            case 1 :
                int descuento = (int) (premio * 0.0245);
                System.out.println("descuento: $" + descuento);
                int montoFinal = premio - descuento;
                System.out.println("Su premio total es: $" + montoFinal);
                break;

            case 2 :
                int descuento2 = (int) (premio * 0.15);
                int montoFinal2 = premio - descuento2;
                System.out.println("Su premio total es: $" + montoFinal2);
                break;

            case 3 :
                int descuento3 = (int) (premio * 0.03);
                int montoFinal3 = premio - descuento3;
                System.out.println("Su premio total es: $" + montoFinal3);
                break;

            default :
                System.out.println("opcion no especificada");
                break;

        }
    }
}
