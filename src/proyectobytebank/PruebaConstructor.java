package proyectobytebank;

public class PruebaConstructor {
    public static void main(String[] args) {
        //Cuenta cuenta = new Cuenta(); //Constructor que no recibe parametros
        Cuenta cuenta = new Cuenta(555);//Constructor que recibe parametros
        Cuenta cuenta2 = new Cuenta(333);
        System.out.println(cuenta.getAgencia());

        System.out.println("Se ha creado " + Cuenta.getTotal() + " cuentas.");
    }
}

//https://github.com/alura-es-cursos/java-introduccion-objetos/tree/Clase-6
