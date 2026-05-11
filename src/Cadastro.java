package src;
import java.util.Scanner;

public class Cadastro  {
     protected Scanner scanner = new Scanner(System.in);

    protected String[] nomes = new String[5];
    protected String[] senhas = new String[5];
    protected int contador = 0;

    public void CadastrodoUsuario() throws InterruptedException {

        String nome;
        String senha;

        while (true) {
            System.out.println("Digite o seu nome completo:");
            nome = scanner.nextLine();

            System.out.println("Confirme seu nome:");
            String confirmacao = scanner.nextLine();

            if (nome.equals(confirmacao) && nome.matches("[a-zA-Z ]+")) {
                System.out.println("Carregando...");
                Thread.sleep(800);
                break;
            } else {
                System.err.println("Nome inválido, digite novamente.");
                Thread.sleep(800);
            }
        }
        while (true) {
            System.out.println("Cadastre sua senha:");
            senha = scanner.nextLine();

            System.out.println("Confirme a sua senha:");
            String confirmacaoSenha = scanner.nextLine();

      if (senha.equals(confirmacaoSenha) && senha.matches("^(?=.*[A-Z])(?=.*[@#$%&*]).{8,}$")) {
                System.out.println("Carregando...");
                Thread.sleep(800);
                System.out.println("Senha correta.");

                if (contador < nomes.length) {
                    nomes[contador] = nome;
                    senhas[contador] = senha;
                    contador++;
                } else {
                    System.out.println("Limite de usuários atingido!");
                }
                break;
            } else {
                System.err.println("Senha incorreta, tente novamente.");
            }
        }
    }
}