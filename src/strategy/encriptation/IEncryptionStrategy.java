package strategy.encriptation;

interface IEncryptionStrategy {

    byte[] encriptar(String text);

    String desencriptar(byte[] textToDecrypt);

    boolean inicializar();

}
