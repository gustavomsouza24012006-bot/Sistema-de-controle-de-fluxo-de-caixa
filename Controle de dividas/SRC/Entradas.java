package SRC;
import java.util.Scanner;

public class Entradas extends Dividas {
    Scanner scanner = new Scanner(System.in);
    
    public void Entradasdedinheiro() throws InterruptedException {
        double entradas;
        while (true) {
            System.out.println("Digite os valores a receber");
            if (!scanner.hasNextDouble()) {
                System.err.println("Erro: digite um número válido.");
                scanner.nextLine();
                Thread.sleep(800);
                continue;
            }

            entradas = scanner.nextDouble();
            scanner.nextLine();

            if (entradas <= 0) {
                System.err.println("Erro: digite uma entrada válida");
                Thread.sleep(800);
            } else {
                System.out.println("Carregando....");
                Thread.sleep(800);
                System.out.println("Entrada de: " + entradas + " foi cadastrada com sucesso");
                break;
            }
        }
    }
    public void OrganizadordeEntradas() throws InterruptedException{
        if (this.produtos == null || this.produtos.trim().isEmpty() || !this.produtos.matches("^[A-Za-zÀ-ÿ ]+$")) {
            System.out.println("Não há produto/serviço válido cadastrado em armazenarparcelas para organizar.");
            return;
        }
        System.out.println("Organizando entradas para: " + this.produtos);
        Thread.sleep(800);

        System.out.println("Entradas organizadas com sucesso!");

        
    }
public static void main(String[] args) throws InterruptedException {
     Entradas obj = new Entradas();
     
        obj.armazenarparcelas();
        obj.controledeDividas();
        obj.Entradasdedinheiro();
        obj.armazenarEntradas();

}
}
  
