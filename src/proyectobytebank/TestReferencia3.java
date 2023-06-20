package proyectobytebank;

public class TestReferencia3 {
    public static void main(String[] args) {
        Cuenta cuentaDeGerson = new Cuenta();
        cuentaDeGerson.titular = new Cliente();

        cuentaDeGerson.titular.nombre = "Gerson";
        System.out.println(cuentaDeGerson.titular.nombre);


    }
}
