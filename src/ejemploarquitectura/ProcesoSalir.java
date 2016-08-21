package ejemploarquitectura;

public class ProcesoSalir extends Proceso{

    @Override
    public void pedirDato() {
        procesar("");
    }

    @Override
    protected void procesar(String dato) {
        System.exit(0);
    }
    
}
