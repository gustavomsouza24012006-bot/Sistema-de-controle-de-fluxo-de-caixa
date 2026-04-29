package SRC;

public class Entradas extends Saidas {

    protected double saldo = 0;

    public void entradaDeDinheiro() {

        while (true) {
            System.out.println("\n--- ENTRADA DE DINHEIRO ---");
            System.out.println("Digite o valor a receber:");

            if (!scanner.hasNextDouble()) {
                System.out.println("Entrada inválida.");
                scanner.next();
                continue;
            }

            double valor = scanner.nextDouble();
            scanner.nextLine();

            if (valor <= 0) {
                System.out.println("O valor deve ser maior que zero.");
            } else {
                saldo += valor;

                System.out.println("Entrada registrada com sucesso!");
                System.out.println("Saldo atual: R$ " + saldo);
                break;
            }
        }
    }

    public void organizarEntradas() {

        if (produto.isEmpty() || !produto.matches("^[A-Za-zÀ-ÿ ]+$")) {
            System.out.println("Nenhum produto válido cadastrado.");
            return;
        }

        System.out.println("\nOrganizando entradas para: " + produto);
        System.out.println("Saldo atual: R$ " + saldo);
        System.out.println("Entradas organizadas com sucesso!");
    }

    public static void main(String[] args) throws InterruptedException {

        Entradas obj = new Entradas();

        obj.entradaDeDinheiro();       
        obj.armazenarParcelas();       
        obj.organizarEntradas();       
    }
}