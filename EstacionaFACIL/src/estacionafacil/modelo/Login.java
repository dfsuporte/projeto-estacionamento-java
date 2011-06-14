package estacionafacil.modelo;

public class Login {

    private String usuario;
    private String senha;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public boolean isValido() {
        if ((usuario.equals("anderson") && senha.equals("anderson")) || (usuario.equals("pablo") && senha.equals("pablo"))) {
            return true;
        } else {
            return false;
        }
    }
}
