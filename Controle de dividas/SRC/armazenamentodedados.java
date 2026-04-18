package SRC;
import java.util.ArrayList;
import java.util.List;

public class armazenamentodedados extends Entradas {
  public void armazenardados() throws InterruptedException{
      super.armazenarEntradas();
      super.armazenarparcelas();
 
     List Dados = new ArrayList();
      Dados.add(parcelas);
       Dados.add(entradas);
        Dados.add(produtos);
       
    System.out.print(Dados);

}
public static void main(String[] args) throws InterruptedException {
  armazenamentodedados obj= new armazenamentodedados();
  obj.armazenardados();
  
}
}

