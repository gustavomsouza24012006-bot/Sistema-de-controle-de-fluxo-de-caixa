package SRC;

import java.util.Scanner;

public class Saidas {

    protected Scanner scanner = new Scanner(System.in);

    protected int parcelas;
    protected String produto;
    protected double entrada;
    protected double valorTotalDivida;

    public void armazenarEntradas() throws InterruptedException {

        while (true) {
            System.out.println("Digite o valor:");

            if (!scanner.hasNextDouble()) {
                System.out.println("Entrada inválida.");
                scanner.nextLine();
                continue;
            }

            entrada = scanner.nextDouble();
            scanner.nextLine();

            if (entrada <= 0) {
                System.out.println("Valor deve ser maior que zero.");
            } else {
                System.out.println("Entrada registrada com sucesso.");
                break;
            }
        }
    }

    public void armazenarParcelas() throws InterruptedException {

        int numeroMaximoParcelas = 24;

        while (true) {
            System.out.println("Digite o produto/serviço:");
            produto = scanner.nextLine().trim();

            if (produto.isEmpty() || !produto.matches("^[A-Za-zÀ-ÿ ]+$")) {
                System.out.println("Nome inválido.");
                continue;
            }
            break;
        }

        System.out.println("Efetuou o parcelamento? (S/N)");
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("S")) {

            while (true) {
                System.out.println("Digite o número de parcelas:");
                if (!scanner.hasNextInt()) {
                    System.out.println("Entrada inválida.");
                    scanner.nextLine();
                    continue;
                }

                parcelas = scanner.nextInt();
                scanner.nextLine();

                if (parcelas <= 0 || parcelas > numeroMaximoParcelas) {
                    System.out.println("Número de parcelas inválido.");
                } else {
                    valorTotalDivida = entrada;
                    break;
                }
            }

        } else {
            parcelas = 1;
            valorTotalDivida = entrada;
        }

        System.out.println("\nProduto cadastrado com sucesso!");
        System.out.println("Produto: " + produto);
        System.out.println("Parcelas: " + parcelas);
       
    }

    public void mostrarResumo() {

        double valorParcela = valorTotalDivida / parcelas;

        System.out.println("\n=== RESUMO ===");
        System.out.println("Produto: " + produto);
        System.out.println("Valor total: R$ " + valorTotalDivida);
        System.out.println("Parcelas: " + parcelas);
        System.out.println("Valor por parcela: R$ " + valorParcela);
    }

    public static void main(String[] args) throws InterruptedException {
        Saidas obj = new Saidas();

        obj.armazenarEntradas();
        obj.armazenarParcelas();
        obj.mostrarResumo();
    }
}