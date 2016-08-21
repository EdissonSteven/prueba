package ejemploarquitectura;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Menu {

    private void mostrarMenu() {
        System.out.println("1. Procesar Texto");
        System.out.println("2. Procesar Números");
        System.out.println("3. Salir");
    }

    private void borrarPantalla() {
        for (int i = 0; i < 80; i++) {
            System.out.println("");
        }
    }

    private int ingresarSeleccion() {
        int seleccion;
        Scanner scn = new Scanner(System.in);
        try {
            seleccion = scn.nextInt();
        } catch (InputMismatchException e) {
            seleccion = 0;
        }
        return seleccion;
    }

    public int ejecutar() {
        borrarPantalla();
        mostrarMenu();
        return ingresarSeleccion();
    }
}
