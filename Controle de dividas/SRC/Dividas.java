package SRC;
public class Dividas extends Saidas {
    
    public void controledeDividas() throws InterruptedException{
        int pagas = 0;
        
        while (pagas < parcelas) {
            int restantes = parcelas - pagas;
            System.out.println("Parcelas restantes: " + restantes);
            System.out.println("Quantas parcelas deseja pagar agora?");
            int pagar = scanner.nextInt();

            if (pagar < 0) {
                System.out.println("Valor inválido. Digite um número de parcelas maior ou igual a zero.");
                Thread.sleep(800);
                continue;
            }

            if (pagar == 0) {
                System.out.println("Saindo do controle de dívidas.");
                Thread.sleep(800);
                break;
            }

            if (pagar > restantes) {
                System.out.println("Valor inválido ou maior que o restante. Tente novamente.");
                Thread.sleep(800);
                continue;
            }
                
            pagas += pagar;
            System.out.println("Pagou " + pagar + " parcelas.");
            Thread.sleep(800);
        }

        System.out.println("\nDívida finalizada!");
    }
    public static void main(String[] args) throws InterruptedException {

        Dividas obj = new Dividas();

        obj.armazenarEntradas();
        obj.armazenarparcelas();
        obj.controledeDividas();
    }
}
    
