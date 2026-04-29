package SRC;
import java.util.ArrayList;
import java.util.List;

public class armazenamentodedados extends Entradas {
  public void armazenardados() throws InterruptedException{
      super.armazenarEntradas();
      super.armazenarParcelas();

     List<Object> Dados = new ArrayList<>();
      Dados.add(parcelas);
       Dados.add(entrada);
        Dados.add(produto);
       
    System.out.println("Dados armazenados: " + Dados);
    System.out.println("Produto: " + produto + ", Parcelas: " + parcelas + ", Entrada: " + entrada);

    
    organizarEntradas();
    controledeDividas();

   String[] meses = {
           "Janeiro", "Fevereiro", "Março", "Abril",
            "Maio", "Junho", "Julho", "Agosto",
            "Setembro", "Outubro", "Novembro", "Dezembro"};

            System.out.println("\n----Calendário-----");
            for(int i = 0; i < meses.length; i++){
                   System.out.println((i + 1) + " - " + meses[i]);
            }
             System.out.println("Escolha um mês (1-12): ");
            int mes = scanner.nextInt();

            if(mes < 1 || mes > 12){
              System.err.print("Erro, digite um mes valido");
              return;
              }
                   System.out.println("\nMês selecionado: " + meses[mes - 1]);

          double valorParcela = entrada / parcelas;
if (mes <= parcelas) {

    int parcelasRestantes = parcelas - mes;

    System.out.println("\n=== Detalhes da Dívida ===");
    System.out.println("Produto: " + produto);
    System.out.println("Parcela atual: " + mes + " de " + parcelas);
    System.out.println("Valor da parcela: R$ " + valorParcela);
    System.out.println("Parcelas restantes: " + parcelasRestantes);

} else {
    System.out.println("Você não possui dívidas neste mês.");}
}

private void controledeDividas() {
    throw new UnsupportedOperationException("Unimplemented method 'controledeDividas'");
  }

public static void main(String[] args) throws InterruptedException {
  armazenamentodedados obj= new armazenamentodedados();
  obj.armazenardados();
  
}
}

