package proyectobytebank;

public class Cuenta {
    double saldo;
    int agencia;
    int numero;
    String titular;


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
}
