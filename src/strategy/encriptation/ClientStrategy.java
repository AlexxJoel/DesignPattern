package strategy.encriptation;

public class StrategyClient {

    public static void main(String[] args) {

        String originalText = "Vamos, ya casi termina el cuatri";

        //Definimos la primera estrategia.
        estragiaEncriptar strategy = new estrategiaCesar();
        //Para crear el contexto se requiere una estrategia inicial.
        contextoEstrategia context = new contextoEstrategia(strategy);

        //Encriptamos y desencriptamos el texto a través del contexto, quien pasará la solicitud a la estrategia.
        byte[] encrypted = context.encriptarTexto(originalText);
        String decrypted = context.desencriptarTexto(encrypted);

        System.out.println("Estrategia Cesar: " + originalText);
        System.out.println("Estrategia Cesar: " + decrypted);

        //Ahora probemos la segunda estrategia y pasemosla al contexto.
        strategy = new estrategiaAES();
        context.setEstrategia(strategy);

        encrypted = context.encriptarTexto(originalText);
        decrypted = context.desencriptarTexto(encrypted);

        System.out.println("Estrategia AES: " + originalText);
        System.out.println("Estrategia AES: " + decrypted);
    }
}
