package proyectobytebank;

public class CrearCuenta {
    public static void main(String[] args) {
        // Variable referencia = Valor
        Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.saldo =1000;
        System.out.println(primeraCuenta.saldo);

        Cuenta segundaCuenta = new Cuenta();
        segundaCuenta.saldo = 500;
        System.out.println(segundaCuenta.saldo);


        System.out.println(primeraCuenta); //muestra la ubicacion en la memoria
        System.out.println(segundaCuenta); //Referencia diferente direccion de memoria

        if ( primeraCuenta == segundaCuenta){
            System.out.println("son el mismo objeto");
        }else {
            System.out.println("Son diferentes objetos");
        }
    }
}

