

package clases;
import java.util.Scanner;


public abstract class padre {
    protected int transacciones, retiro, deposito;
    private static int saldo;
    Scanner entrada = new Scanner(System.in);
    String contraseña;
    String dni;
    
    
    public void Operaciones(){
    int bandera = 0;
    int seleccion = 0;
    int intentos = 0;
    
    
        System.out.println("Ingrese su Número de Documento: ");
        dni = entrada.next();
        System.out.println("Ingrese su Contraseña: ");
        contraseña = entrada.next();
        
        if(dni.equals(8927456) && contraseña.equals(1234)){
            
        }
    do{
               
    do{
        System.out.println("============================");
        System.out.println("Bienvenido Rodolfo Alvarez.");
        System.out.println("============================");
        System.out.println("");
        System.out.println("Porfavor seleccione una opción.");
        System.out.println("    1. Consulta de Saldo.");
        System.out.println("    2. Retiro de Efectivo.");
        System.out.println("    3. Depósito de Efectivo.");
        System.out.println("    4. Salir.");
        seleccion = entrada.nextInt();
        
        if(seleccion >= 1 && seleccion <= 4){
            bandera = 1;
        }else {
            System.out.println("=========================================");
            System.out.println("Opción no Válida, intente Nuevamente.");
            System.out.println("=========================================");
        
        
        }
    
    }while(bandera == 0);
    
    if(seleccion == 1){
        padre  mensajero = new consulta();
        mensajero.Transacciones();
    
    }else if(seleccion == 2){
        padre  mensajero = new retiro();
        mensajero.Transacciones();
    
    }else if(seleccion == 3){
        padre  mensajero = new deposito();
        mensajero.Transacciones();
    
    }else if(seleccion == 4){
         System.out.println("=======================");
         System.out.println("Gracias, vuelva pronto.");
         System.out.println("=======================");
         bandera = 2;
    }
    }while(bandera !=2);
    
    
    }
    //Retiro
    public void Retiro(){
        retiro = entrada.nextInt();
    
    }
    
    
    //Depósisto
    public void Deposito(){
        deposito = entrada.nextInt();
    
    }
    //Método abstracto.
    public abstract void Transacciones();
    
    //Métodos getters y setter
    public int getSaldo(){
        return saldo;    
    }
    
    public void setSaldo(int saldo){
        this.saldo = saldo;
    
    }
}
