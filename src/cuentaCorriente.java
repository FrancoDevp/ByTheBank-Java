public class cuentaCorriente extends cuenta{
    public cuentaCorriente(double numero, String agencia){

        super();
    }
    @Override
    public boolean transferir(double valor, cuenta cuenta) {
            double comision = 10;
        return super.transferir(valor - comision, cuenta);
    }
}
