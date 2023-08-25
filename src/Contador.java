public class Contador extends empleados implements PasswordAutenticar{
    private String password = "12345";
        public double getBonificacion(){
            return super.getBonificacion();
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
