package Practicas;

public class ejemplo {

    public static void main (String... args){
        System.out.println("Mi primera palabra en Java");

        int edad = 25;
        System.out.println("mi edad es " + edad);

        // sumas
        int numero1 = 25;
        double numero2 = numero1 + 25.7;
        System.out.println("el resultado de la suma es: " + numero2);
        
        // division
        double div1 = 953.60;
        double div2 = div1 / 3.74;
        System.out.println("el resultado de la division es: " + div2);

        // Multipicacion
        double mul1 = 450;
        double mul2 = mul1 * 10;
        System.out.println("el resultado de la multiplicacion es: " + mul2);
    }

    public static class testAlcance {

public static void main (String [] args) {
    System.out.println ("pruebas condicionales");

    int edad = 20;
    int cantidadPersonas = 3;
    boolean acompañado;

    if (cantidadPersonas >= 2) {
        acompañado = true;
    } else {
        acompañado = false;
    }

    if (edad >= 18 || acompañado) {
        System.out.println ("Bienvenido");
    } else {
        System.out.println ("desafortunadamente no puedes ingresar");
    }
}
}

    public static class TestDescuento {

public static void main(String[] args) {

    double valorCompra = 350;
    double descuento = 0;

    if (valorCompra >= 100 && valorCompra < 199){
          descuento = 10;
    } else if (valorCompra >= 200 && valorCompra < 299){
          descuento = 20;
    } else if (valorCompra >= 300){
          descuento = 30;
    }


    Double resultadoDeCompra = valorCompra - (valorCompra * (descuento /100));

    System.out.println("El valor de la compra es: $" + valorCompra);
    System.out.println("el descuento es de " + descuento + "%");
    System.out.println("Compra final $" + resultadoDeCompra);
}
}
}


