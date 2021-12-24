

package clases;


public class deposito extends padre{
    public void Transacciones(){
        System.out.print("Ingrese el Monto a Consignar: $");
        Deposito();
        
        transacciones = getSaldo();
        setSaldo(transacciones + deposito);
        System.out.println("==================================");
        System.out.println("Su depósito fue de :  $" + deposito);
        System.out.println("Su Nuevo Saldo es de :  $" + getSaldo());
        System.out.println("==================================");
    }
}
