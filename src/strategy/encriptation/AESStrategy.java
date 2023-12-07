package strategy.encriptation;

import javax.crypto.*;
import javax.crypto.KeyGenerator;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

public class AESStrategy implements IEncryptionStrategy {

    private KeyGenerator generator;
    private Key key;
    private Cipher cipher;

    @Override
    public byte[] encriptar(String texto) {

        byte[] resultado = null;
        try {
            cipher.init(Cipher.ENCRYPT_MODE, key);
            resultado = cipher.doFinal(texto.getBytes());
        } catch (Exception exception) {
            exception.printStackTrace();
        }
//        System.err.println("encrpitado" + result);
        return resultado;
    }

    @Override
    public String desencriptar(byte[] textoEncriptadoIn) {

        String resultado = null;
        try {
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] decrypted = cipher.doFinal(textoEncriptadoIn);
            resultado = new String(decrypted);
        } catch (Exception exception) {
            exception.printStackTrace();
        }

//        System.err.println("desencriptado" + result);
        return resultado;
    }

    @Override
    public boolean inicializar() {
        boolean resultado = false;
        try {
            generator = KeyGenerator.getInstance("AES");
            generator.init(128);
            key = generator.generateKey();
            cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            resultado = true;
        } catch (NoSuchAlgorithmException exception) {
            exception.printStackTrace();
        } catch (NoSuchPaddingException exception) {
            exception.printStackTrace();
        }
        return resultado;
    }
}
