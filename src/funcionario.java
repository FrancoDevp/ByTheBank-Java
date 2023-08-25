public class funcionario extends empleados {

    public static void main(String[] args) {
        empleados funcionario = new empleados();
        funcionario.setNombre("funcionario");
        funcionario.setDocumento("41018183");
        funcionario.setSalario(200000.0);
        funcionario.setTipo(0);

        System.out.println("NOMBRE: " + funcionario.getNombre());
        System.out.println("DNI: " + funcionario.getDocumento());
        System.out.println("SALARIO $" + funcionario.getSalario());
    }

}