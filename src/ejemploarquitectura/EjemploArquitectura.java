package ejemploarquitectura;

public class EjemploArquitectura {

    public static void main(String[] args) {
        Menu miMenu = new Menu();
        int opcion;
        Proceso[] listaProceso
                = {new ProcesoTexto(), new ProcesoNumero(), new ProcesoSalir()};
        while (true) {
            opcion = miMenu.ejecutar();
            if (validarOpcion(opcion)) {
                listaProceso[opcion - 1].pedirDato();
            }
        }
    }

    private static boolean validarOpcion(int opcion) {
        return (opcion == 1 || opcion == 2 || opcion == 3);
    }
}
