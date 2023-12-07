package strategy.encriptation;

interface encryptionStrategy {

    byte[] encriptar(String text);

    String desencriptar(byte[] textToDecrypt);

    boolean inicializar();

}
