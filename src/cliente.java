public class cliente implements PasswordAutenticar {

    private String nombre;
    private int numeroDeDocumento;
    private int numeroCelular;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public int getNumeroDeDocumento() {

        return this.numeroDeDocumento;
    }

    public void setNumeroDeDocument(int numeroDeDocumento) {

        this.numeroDeDocumento = numeroDeDocumento;
    }

    public int getNumeroCelular() {

        return this.numeroCelular;
    }

    public void setNumeroCelular(int numeroCelular) {

        this.numeroCelular = numeroCelular;
    }

    @Override
    public void setPassword(String password) {

    }

    @Override
    public boolean iniciarSesion(String password) {
        return false;
    }
}
