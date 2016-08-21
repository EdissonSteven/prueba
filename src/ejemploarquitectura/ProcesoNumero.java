package ejemploarquitectura;

import java.util.Scanner;

public class ProcesoNumero extends Proceso {

    @Override
    public void pedirDato() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite su Base y Altura separadas por coma");
        procesar(scn.next());
        esperar(2000);
    }

    @Override
    protected void procesar(String dato) {
        String[] listadoEntradas = dato.split(",");
        if (listadoEntradas.length == 2) {
            try {
                int base, altura;
                base = Integer.parseInt(listadoEntradas[0]);
                altura = Integer.parseInt(listadoEntradas[1]);
                System.out.println("El área es: " + String.valueOf(base * altura));
            } catch (NumberFormatException ex) {
                System.err.println("Alguno de los argumentos no es numérico");
            }
        } else {
            System.err.println("El numéro de argumentos no corresponde");
        }
    }
}
