public class TestSistemas {
    public static void main(String[] args) {
        SistemaInterno sistema = new SistemaInterno();
        Administrador admin = new Administrador();
        Contador contador = new Contador();
        Gerente gerente = new Gerente();

        sistema.autenticar(admin);
        sistema.autenticar(contador);
        sistema.autenticar(gerente);
    }
}
