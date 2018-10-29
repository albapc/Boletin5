package boletin5;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Conta {
Scanner res= new Scanner(System.in);
    private String nomeCliente;
    private int numConta;
    private double saldo;

    public Conta() {
        nomeCliente = null;
        numConta = 0;
        saldo = 0;
    }

    public Conta(String nomeCliente, int numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double engadirIngreso(float suma) {
        float ingreso;
        ingreso = (float) (saldo - suma);
        System.out.println("Saldo total ingreso: " + ingreso + " €");
        return ingreso; //Agregar visualizar pantalla
    }

    public void engadirReintegro(float resto) {
        System.out.println("Introducir cantidad a retirar:");
        float re= res.nextFloat();
        re = (float) (saldo - resto);
        if(re>0){
            System.out.println("Saldo total reintegro " + re + " €");
        }
        else
            JOptionPane.showMessageDialog(null, "Operación inválida");
          
   
    }

    public void visualizarDatos() {
        System.out.println("Datos cliente:\nNome: " + nomeCliente
                + "\nNúmero de conta: " + numConta + "\nSaldo: " + saldo + " €");
    }

    public double saldo() {
        return saldo;
    }

    public void transferencia() {

    }
}
