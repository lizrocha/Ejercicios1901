package ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("-----Campaña publicitaria-----");
        System.out.print("Ingresa los dias transcurridos:");
        int dias = teclado.nextInt();

        int multiplicacion = dias * 2;

        System.out.print("El monto total es "+multiplicacion);
    }
}
