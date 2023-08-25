public abstract class cuenta {
    private double saldo;
    private String agencia;
    private int numero;
    private String titular;

    public void depositar (double valor) {
        this.saldo = this.saldo + valor;
        System.out.println("Depositaste: " + valor);
    }

    public boolean retirar (double valor) {
        if (this.saldo >= valor){
            this.saldo = this.saldo - valor;
            System.out.println("Retiraste: " + valor);
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir (double valor, cuenta cuenta){
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            cuenta.saldo = cuenta.saldo + valor;
            System.out.println("has transferido: " + valor);
            return true;
        } else { 
            return false; 
        }
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public String getTitular(){
        return this.titular;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setAgencia(String agencia){
        this.agencia = agencia;
    }

    public String getAgencia(){
        return this.agencia;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return this.numero;
    }

}
