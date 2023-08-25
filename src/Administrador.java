public class Administrador extends empleados implements PasswordAutenticar{

    private String password;
    @Override
    public double getBonificacion() {
        return this.getSalario();
    }

    @Override
    public void setPassword(String password) {
            this.password = password;
    }

    @Override
    public boolean iniciarSesion(String password) {
        return false;
    }
}
