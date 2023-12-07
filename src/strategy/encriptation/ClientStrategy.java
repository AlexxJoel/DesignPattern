package strategy.encriptation;

public class ClientStrategy {

    public static void main(String[] args) {

        String originalText = "Vamos, ya casi termina el cuatri";

        //Definimos la primera estrategia.
        IEncryptionStrategy strategy = new CesarStrategy();
        //Para crear el contexto se requiere una estrategia inicial.
        ContextStrategy context = new ContextStrategy(strategy);

        //Encriptamos y desencriptamos el texto a través del contexto, quien pasará la solicitud a la estrategia.
        byte[] encrypted = context.encriptarTexto(originalText);
        String decrypted = context.desencriptarTexto(encrypted);

        System.out.println("Estrategia Cesar: " + originalText);
        System.out.println("Estrategia Cesar: " + decrypted);

        //Ahora probemos la segunda estrategia y pasemosla al contexto.
        strategy = new AESStrategy();
        context.setEstrategia(strategy);

        encrypted = context.encriptarTexto(originalText);
        decrypted = context.desencriptarTexto(encrypted);

        System.out.println("Estrategia AES: " + originalText);
        System.out.println("Estrategia AES: " + decrypted);
    }
}
