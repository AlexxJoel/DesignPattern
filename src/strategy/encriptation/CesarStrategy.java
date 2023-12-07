package strategy.encriptation;

import java.util.Random;

public class CesarStrategy implements IEncryptionStrategy {

    private static String alfabeto = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ ,.-";
    private int shift;

    @Override
    public byte[] encriptar (String texto) {

        StringBuilder textoEncriptado = new StringBuilder();
        for (int index = 0; index < texto.length(); index++)
        {
            int charPosicion = alfabeto.indexOf(texto.charAt(index));
            int posicionNuevoCaracter = (shift + charPosicion) % alfabeto.length();
            char nuevoCaracter = alfabeto.charAt(posicionNuevoCaracter);
            textoEncriptado.append(nuevoCaracter);
        }

        byte[] result = textoEncriptado.toString().getBytes();
        return result;
    }

    @Override
    public String desencriptar (byte[] textoEncriptadoIn) {

        String textoEncriptado = new String(textoEncriptadoIn);
        StringBuilder resultado = new StringBuilder();
        for (int index = 0; index < textoEncriptado.length(); index++)
        {
            int posicionAlfabeto = alfabeto.indexOf(textoEncriptado.charAt(index));
            int posicionNuevoCaracter = (posicionAlfabeto - shift) % alfabeto.length();
            if (posicionNuevoCaracter < 0)
            {
                posicionNuevoCaracter = alfabeto.length() + posicionNuevoCaracter;
            }
            char nuevoCaracter = alfabeto.charAt(posicionNuevoCaracter);
            resultado.append(nuevoCaracter);
        }
        return resultado.toString();
    }

    @Override
    public boolean inicializar() {
        Random random = new Random();
        shift = random.nextInt(26);
        return true;
    }
}
