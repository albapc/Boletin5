package boletin5;

import java.util.Scanner;

public class Boletin5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, numero;
        double dineiro;

        //Constructor por defecto
        Conta obxConta1 = new Conta();

        System.out.println("Nome cliente: ");
        nome = sc.nextLine();
        System.out.println("Número de conta: ");
        numero = sc.nextLine();
        System.out.println("Saldo total: ");
        dineiro = sc.nextDouble();

        obxConta1.setNomeCliente(nome);
        obxConta1.setNumConta(numero);
        obxConta1.setSaldo(dineiro);

        //Conta2 con parámetros
        Conta obxConta2 = new Conta("Pepe Rodríguez Pérez", "347324", 35679);

        //Datos da Conta1
        System.out.println("Datos Conta1:");
        System.out.println("Nome do cliente: " + obxConta1.getNomeCliente());
        System.out.println("Número de conta: " + obxConta1.getNumConta());
        System.out.println("Saldo total: " + obxConta1.getSaldo());
        System.out.println();

        obxConta1.engadirIngreso(1300);

        System.out.println("Saldo total ingresado: " + obxConta1.getSaldo());
        System.out.println();

        //Datos da Conta2
        System.out.println("Datos Conta2:");
        System.out.println("Nome do cliente: " + obxConta2.getNomeCliente());
        System.out.println("Número de conta: " + obxConta2.getNumConta());
        System.out.println("Saldo total: " + obxConta2.getSaldo());
        System.out.println();

        //realízase unha transferencia
        obxConta2.transferencia(obxConta1, 150);

        //ver saldo da Conta1
        System.out.println("Saldo da Conta1");
        System.out.println("Saldo: " + obxConta1.getSaldo());
        System.out.println();

        //ver saldo da Conta2
        System.out.println("Saldo da Conta2");
        System.out.println("Saldo: " + obxConta2.getSaldo());
    }

}
