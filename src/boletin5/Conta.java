package boletin5;

import java.util.Scanner;

public class Conta {

    private String nomeCliente;
    private String numConta;
    private double saldo;

    public Conta() {
    }

    public Conta(String nomeCliente, String numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public void setNomeCliente(String s) {
        nomeCliente = s;
    }

    public void setNumConta(String s) {
        numConta = s;
    }

    public void setSaldo(double n) {
        saldo = n;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double engadirIngreso(double n) {
        if (n < 0) {
            System.out.println("ERRO ingreso");
        } else {
            saldo = saldo + n;
        }
        return saldo; //Agregar visualizar pantalla
    }

    public double engadirReintegro(double n) {
        if (n < 0) {
            System.out.println("ERRO reintegro");
        } else if (saldo >= n) {
            saldo -= n;
        } else {
            System.out.println("ERRO reintegro");
        }
        return saldo;
    }

    public void transferencia(Conta c, double n) {
        if (n < 0) {
            System.out.println("ERRO transferencia");
        } else if (saldo >= n) {
            engadirReintegro(n);
            c.engadirIngreso(n);
        } else {
            System.out.println("ERRO transferencia");
        }
    }
}
