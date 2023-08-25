public class ControlBonificacion {
        private double suma;

    public double registrarSalario(empleados empleados){
        this.suma = empleados.getBonificacion() + this.suma;
        System.out.println("calculo de salario empleados " + this.suma);
        return this.suma;
    }


    }
