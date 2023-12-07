package strategy.encriptation;

public class ContextStrategy {

    //Referencia a la estrategia actual. No sabe qué estrategia concreta se está usando.
    private IEncryptionStrategy estrategia;

    /**
     * Cuando se crea el contexto, es necesario indicar qué estrategia se usará inicialmente.
     */
    public ContextStrategy(IEncryptionStrategy estrategia) {
        setEstrategia(estrategia);
    }

    public byte[] encriptarTexto(String texto) {
        //El contexto delega el trabajo a la estrategia.
        byte[] resultado = estrategia.encriptar(texto);
        return resultado;
    }

    public String desencriptarTexto(byte[] texto) {
        //El contexto delega el trabajo a la estrategia.
        String resultado = estrategia.desencriptar(texto);
        return resultado;
    }

    /**
     * La estrategia puede ser cambiada en cualquier momento, a través de este método.
     */
    public void setEstrategia(IEncryptionStrategy estrategia) {
        this.estrategia = estrategia;
        this.estrategia.inicializar();
    }


}
