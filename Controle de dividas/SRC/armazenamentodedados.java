package SRC;
import java.util.ArrayList;
import java.util.List;

public class armazenamentodedados extends Entradas {
  public void armazenardados() throws InterruptedException{
      super.armazenarEntradas();
      super.armazenarparcelas();
 
     List<Object> Dados = new ArrayList<>();
      Dados.add(parcelas);
       Dados.add(entradas);
        Dados.add(produtos);
       
    System.out.println("Dados armazenados: " + Dados);
    System.out.println("Produto: " + produtos + ", Parcelas: " + parcelas + ", Entrada: " + entradas);

   
    OrganizadordeEntradas();

    controledeDividas();
}
public static void main(String[] args) throws InterruptedException {
  armazenamentodedados obj= new armazenamentodedados();
  obj.armazenardados();
  
}
}

