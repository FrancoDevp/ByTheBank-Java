public class testCuenta {
    public static void main(String[] args) {
        cuentaCorriente cc = new cuentaCorriente(1,"santander");
        cuentaAhorros ca = new cuentaAhorros(2,"santander");

        cc.depositar(2000);
        cc.transferir(500,ca);

        System.out.println("ca $" + ca.getSaldo());
        System.out.println("cc $" + cc.getSaldo());
    }
}
