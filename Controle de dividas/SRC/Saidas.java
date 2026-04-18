package SRC;
import java.util.Scanner;

public class Saidas {
    Scanner scanner = new Scanner(System.in);

    int parcelas;
    protected String produtos;
    double entradas;

    public void armazenarEntradas() throws InterruptedException {
        while (true) {
            System.out.println("Digite o valor que deseja guardar:");
            if (!scanner.hasNextDouble()) {
                System.out.println("Entrada inválida. Digite um número válido.");
                scanner.nextLine();
                Thread.sleep(800);
                continue;
            }

            entradas = scanner.nextDouble();
            scanner.nextLine();

            if (entradas <= 0) {
                System.out.println("Entrada inválida. Digite uma entrada válida");
                Thread.sleep(800);
            } else {
                System.out.println("Carregando.......");
                Thread.sleep(800);
                System.out.println("Entrada guardada com sucesso");
                break;
            }
        }
    }

    public void armazenarparcelas() throws InterruptedException {
        while (true) {
            System.out.println("Digite o produto/serviço que realizou o parcelamento:");
            this.produtos = scanner.nextLine().trim();

            if (this.produtos == null || this.produtos.isEmpty() || !this.produtos.matches("^[A-Za-zÀ-ÿ ]+$")) {
                System.out.println("Produto/serviço inválido. Digite um nome válido.");
                Thread.sleep(800);
                continue;
            }

            int numeromaximodeparcelas = 24;

            System.out.println("Digite o numero de parcelas:");
            if (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Digite um número de parcelas válido.");
                scanner.nextLine();
                Thread.sleep(800);
                continue;
            }

            parcelas = scanner.nextInt();
            scanner.nextLine();

            if (parcelas <= 0 || parcelas > numeromaximodeparcelas) {
                Thread.sleep(800);
                System.out.println("Entrada invalida. Digite uma parcela valida");
            } else {
                System.out.println(String.format("Produto: %s com parcelas de: %d foi cadastrado com sucesso.", produtos, parcelas));
                break;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException{
        Saidas obj = new Saidas();
        obj.armazenarEntradas();
        obj.armazenarparcelas();
    }
}
