public class TestControlBonificacion {
    public static void main(String[] args) {
        funcionario franco = new funcionario();
        franco.setSalario(2000);

        Gerente maria = new Gerente();
        maria.setSalario(4000);

        Contador lucia = new Contador();
        lucia.setSalario(4000);

        ControlBonificacion controlBonificacion = new ControlBonificacion();
        controlBonificacion.registrarSalario(franco);
        controlBonificacion.registrarSalario(maria);
        controlBonificacion.registrarSalario(lucia);

    }

}
