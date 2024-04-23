//Importando a biblioteca Scanner
import java.util.Scanner;

import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        // Intanciando o objeto Scanner
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        // Exibindo mensagens para o usuário
        System.out.println("Olá! Vamos criar sua conta Bancária!");
        System.out.println("Preencha algumas informações a seguir:");


        // Obtendo valores digitados no terminal pelo Scanner
        // Recebendo Nome do Usuário
        System.out.println("Digite o Primeiro nome: ");
        String nome = scan.next();

        // Recebendo Agencia Bancaria
        System.out.println("Digite o Número da sua Agência: Ex: 067-8 ");
        String agencia = scan.next();

        // Recebendo Numero da Conta
        System.out.println("Digite o Número da sua Conta: (Apenas números) ");
        int numeroConta = scan.nextInt();

        // Recebendo Numero da Conta
        System.out.println("Digite o seu saldo bancário: Ex: R$ 10.00 ");
        System.out.println("R$ ");

        double saldo = scan.nextDouble();

        // Exibindo mensagem de conta Criada
        System.out.println("Olá ".concat(nome) + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é ".concat(agencia)+ ", conta "+ numeroConta);
        System.out.println("Seu saldo R$ "+ saldo + " já está disponível para saque.");




    }
}
