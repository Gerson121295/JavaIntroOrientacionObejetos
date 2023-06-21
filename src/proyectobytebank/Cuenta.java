package proyectobytebank;



public class Cuenta {
    private double saldo; //cambio a private : encapsulamiento para que no se pueda obtener y modificar sin usar el metodo set o get
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente(); //Referencia el atributo titular a la clase Cliente


    //Otra forma la variable parametro no es igual a atributos de la clase
//   public void depositar(double valor){
//        saldo = saldo + valor;
//    }

    //Metodo no retorna valor
    public void depositar(double valor){ //Pudo ser saldo el parametro
        //Esta cuenta      Esta cuenta
        //This account      This account
        //This object  : this al atributo que esta en la clase
        this.saldo   =  this.saldo + valor;
    }

    //Metodo retorna valor
    public boolean retirar(double valor){
        if (this.saldo >= valor){
            this.saldo = this.saldo - valor;
            return true;
        }else{
            return false;
        }
    }

    public boolean transferir(double valor, Cuenta cuenta) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            cuenta.depositar(valor); //cuenta.saldo = cuenta.saldo + valor;
            return true;
        }
        return false;
    }

    //Metodo para obtener get
    public double getSaldo(){
        return this.saldo;
    }

    //Metodo para modificar set : asignar
    public void setAgencia(int agencia){
        if(agencia > 0 ){ //validacion para evitar ingresar numeros < 0
            this.agencia = agencia;
        }else{
            System.out.println("no estan permitidos valores negativos");
        }
    }

    // Metodo getAgencia
    public int getAgencia() {
        return agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }
}
