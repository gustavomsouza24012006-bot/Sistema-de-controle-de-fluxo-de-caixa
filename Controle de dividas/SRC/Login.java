package SRC;

public class Login extends Cadastro {
    public void LoginUsuario() {

        System.out.println("Digite seu nome:");
        String nomeLogin = scanner.nextLine();

        System.out.println("Digite sua senha:");
        String senhaLogin = scanner.nextLine();

        boolean acesso = false;

        for (int i = 0; i < contador; i++) {
            if (nomes[i].equals(nomeLogin) && senhas[i].equals(senhaLogin)) {
                acesso = true;
                break;
            }
        }

        if (acesso) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Usuário ou senha inválidos.");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Login obj = new Login();

        obj.CadastrodoUsuario();
        obj.LoginUsuario();
    }
}