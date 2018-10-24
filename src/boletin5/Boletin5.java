
package boletin5;


public class Boletin5 {


    public static void main(String[] args) {
        double totalSaldo;
        
        Conta obxConta= new Conta();
        
        Conta obxSaldo= new Conta("Pepe", 6802, 29460);
        obxSaldo.visualizarDatos();
        
        obxSaldo.engadirIngreso(500);
        obxSaldo.engadirReintegro(100);
        
        totalSaldo= obxSaldo.saldo();
        System.out.println("Total actual en la cuenta: "+totalSaldo+" €");
        
    }
    
}
