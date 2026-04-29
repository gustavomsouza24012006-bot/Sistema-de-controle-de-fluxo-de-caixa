package SRC;

public class Dividas extends Saidas {

    int parcelasPagas = 0;

    public void controledeDividas() {

        if (parcelas <= 0) {
            System.out.println("Nenhuma dívida cadastrada.");
            return;
        }

        double valorParcela = entrada / parcelas;

        while (parcelasPagas < parcelas) {

            int restantes = parcelas - parcelasPagas;
            double valorRestante = restantes * valorParcela;

            System.out.println("\n=== CONTROLE DE DÍVIDAS ===");
            System.out.println("Produto: " + produto);
            System.out.println("Parcelas restantes: " + restantes);
            System.out.println("Valor por parcela: R$ " + valorParcela);
            System.out.println("Valor restante: R$ " + valorRestante);
            System.out.println("Digite quantas parcelas deseja pagar (0 para sair):");

            if (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida!");
                scanner.next();
                continue;
            }

            int pagar = scanner.nextInt();
            scanner.nextLine();

            if (pagar == 0) {
                System.out.println("Saindo do controle de dívidas...");
                break;
            }

            if (pagar < 0 || pagar > restantes) {
                System.out.println("Valor inválido. Tente novamente.");
                continue;
            }

            parcelasPagas += pagar;

            double totalPago = parcelasPagas * valorParcela;

            System.out.println("Pagamento realizado!");
            System.out.println("Total pago: R$ " + totalPago);
        }

        if (parcelasPagas == parcelas) {
            System.out.println("\nDívida quitada com sucesso!");
        } else {
            System.out.println("\nVocê ainda possui dívida em aberto.");
        }

        double valorRestanteFinal = (parcelas - parcelasPagas) * valorParcela;

        System.out.println("\n=== STATUS FINAL ===");
        System.out.println("Produto: " + produto);
        System.out.println("Parcelas pagas: " + parcelasPagas);
        System.out.println("Parcelas restantes: " + (parcelas - parcelasPagas));
        System.out.println("Valor restante: R$ " + valorRestanteFinal);
    }

    public static void main(String[] args) throws InterruptedException {

        Dividas obj = new Dividas();

        obj.armazenarEntradas();
        obj.armazenarParcelas();
        obj.controledeDividas();
    }
}