package ejemploarquitectura;

public abstract class Proceso {
    public abstract void pedirDato();
    protected abstract void procesar(String dato);

    /**
     *
     * @param tiempo
     */
    protected void esperar(long tiempo)
    {
        try {
            Thread.sleep(tiempo);
        } catch (InterruptedException ex) {
            
        }
    }
}
