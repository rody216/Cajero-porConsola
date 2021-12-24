

package clases;


public class consulta extends padre {
    @Override
    public void Transacciones(){
        System.out.println("=================================");
        System.out.println("Tu saldo actual es: $" + getSaldo());
        System.out.println("=================================");
    }
    
}
