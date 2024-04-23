//Importando a biblioteca Scanner
import java.util.Scanner;

import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        // Intanciando o objeto Scanner
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        // Exibindo mensagens para o usuário
        System.out.println("|-----------------------------------------|");
        System.out.println("|                                         |");
        System.out.println("|  Olá! Vamos criar sua conta Bancária!   |");
        System.out.println("|  Preencha algumas informações a seguir: |");
        System.out.println("|                                         |");
        System.out.println("|-----------------------------------------|");


        System.out.println("<----------------------------------------------------------------------->");

        // Obtendo valores digitados no terminal pelo Scanner
        // Recebendo Nome do Usuário
        System.out.println("Digite o nome: ");
        String nome = scan.next();
        System.out.println("--> Seu nome é ".concat(nome)+" <-- ");

        // Recebendo Agencia Bancaria
        System.out.println("Digite o número da sua Agência: Ex: 067-8 ");
        String agencia = scan.next();
        System.out.println("--> Sua Agência é ".concat(agencia)+" <-- ");


        // Recebendo Numero da Conta
        System.out.println("Digite o número da sua Conta: (Apenas números) ");
        int conta = scan.nextInt();
        System.out.println("--> Sua conta é " +conta+" <-- ");


        // Recebendo Numero da Conta
        System.out.println("Digite o seu saldo bancário: Ex: R$ 10.00 ");
        System.out.println("R$ ");
        double saldo = scan.nextDouble();

        System.out.println("--> Seu saldo  é R$ " + saldo + " <-- ");

        System.out.println("<----------------------------------------------------------------------->");

        // Exibindo mensagem de conta Criada
        System.out.println("Olá ".concat(nome) + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é ".concat(agencia)+ ", conta "+ conta);
        System.out.println("Seu saldo R$ "+ saldo + " já está disponível para saque.");

        System.out.println("<-----------------------------------||------------------------------------>");





    }
}
