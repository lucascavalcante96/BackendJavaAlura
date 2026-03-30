import java.util.Scanner;

public class DesafioBanco {
    static void main() {
        Scanner input = new Scanner(System.in);
        String nome = "Lucas Cavalcante";
        String tipoDeConta = "Conta corrente";
        double saldo = 2500;
        double valor;

        System.out.println("**************************************");
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de Conta: " + tipoDeConta);
        System.out.println("Saldo: " + saldo);
        System.out.println();
        System.out.println("**************************************");

        System.out.println();
        System.out.println();

        System.out.println("Operações");
        System.out.println();
        System.out.println("1- Consultar Saldo");
        System.out.println("2- Receber valor");
        System.out.println("3- Transferir valor");
        System.out.println("4- Sair");
        System.out.println();
        System.out.println("Digite a opção desejada: ");
        int opcao;

        while (true) {
            System.out.println();
            System.out.println("1- Consultar Saldo");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            System.out.println();
            System.out.println("Digite a opção desejada: ");
            opcao = input.nextInt();
            if  (opcao == 1) {
                System.out.println("Saldo atual: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Digite o valor a receber:");
                valor = input.nextDouble();
                if (valor <= 0){
                    System.out.println("Valor Invalido!");
                    System.out.println("Voltando ao menu.");
                } else {
                    saldo += valor;
                    System.out.println("Saldo atual: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Digite o valor a transferir:");
                valor = input.nextDouble();
                if (valor > saldo || valor <= 0){
                    System.out.println("Não foi possivel transferir o valor desejado!");
                    System.out.println("Voltando ao menu.");
                }  else {
                    saldo -= valor;
                    System.out.println("Saldo atual: " + saldo);
                }
            } else if (opcao == 4) {
                System.out.println("Obrigado por utilizar os serviços do banco!");
                break;
            } else {
                System.out.println("Operação Invalida");
            }
        }
    }
}

