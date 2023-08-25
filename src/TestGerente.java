public class TestGerente {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSalario(400000.0);
        gerente.setTipo(1);
        gerente.setPassword("12345");
        boolean password = gerente.iniciarSesion("12345");


        System.out.println("SALARIO GERENTE $" + gerente.getSalario());
        System.out.println("la clave es correcta: "+ password);
        System.out.println("BONIFICACION DE GERENTE $" + gerente.getBonificacion());
    }
}