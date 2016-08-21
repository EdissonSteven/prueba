package ejemploarquitectura;

import java.util.Scanner;

public class ProcesoTexto extends Proceso {

    @Override
    public void pedirDato() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite su nombre");
        procesar(scn.nextLine());
        esperar(2000);
    }

    @Override
    protected void procesar(String dato) {
        if (dato.isEmpty()) {
            System.out.println("Hola Mundo");
        } else {
            System.out.println("Hola " + dato);
        }
    }
}
