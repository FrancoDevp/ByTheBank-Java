public class SistemaInterno implements PasswordAutenticar {
    private String password = "12345";
    public boolean autenticar(PasswordAutenticar passwordAutenticar){
        boolean puedeIniciarSesion = passwordAutenticar.iniciarSesion(password);
        if(puedeIniciarSesion){
            System.out.println("login exitoso");
            return true;
        } else {
            System.out.println("login erroneo");
            return false;
        }
    }

    @Override
    public void setPassword(String password) {
         this.password = "12345";
    }

    @Override
    public boolean iniciarSesion(String password) {
        return false;
    }
}