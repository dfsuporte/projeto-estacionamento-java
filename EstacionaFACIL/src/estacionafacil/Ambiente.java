
package estacionafacil;

public class Ambiente {

     public static String nomeUsuario;

    public static void defineNomeUsuario(String nome) {
        nomeUsuario = nome;
    }

    public static String obtemNomeUsuario() {
        return nomeUsuario;
    }

}
