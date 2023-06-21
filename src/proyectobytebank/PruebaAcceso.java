package proyectobytebank;

public class PruebaAcceso {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        cuenta.setAgencia(-22);
        cuenta.depositar(400);
        cuenta.retirar(300);

        System.out.println(cuenta.getSaldo());
        System.out.println(cuenta.getAgencia());
    }
}

//Las otras clases anteriores dan error debido a que se cambiarlos
//los atributos de la clase cuenta a private a esto se le llama encapsulamiento
//por lo que ahora para obtener se utiliza el metodo get y para asignar o modificar
// se debe usar el metodo set


