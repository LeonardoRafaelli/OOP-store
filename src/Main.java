import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.cadastrar();
        System.out.print("Matrícula: ");
        g1.setMatricula(sc.nextInt());
        System.out.print("Senha: ");
        g1.setSenha(sc.next());
        Funcionario.funcionarios.add(g1);


        System.out.println("Funcionárioooooo");
        Funcionario f1 = new Funcionario();
        f1.cadastrar();
        System.out.print("Matrícula: ");
        f1.setMatricula(sc.nextInt());
        System.out.print("Senha: ");
        f1.setSenha(sc.next());
        Funcionario.funcionarios.add(f1);

        sistema();
    }

    public static void sistema() {
        System.out.print("""
                ------ MENU INICIAL ------
                1 - Logar;
                2 - Fechar o programa.
                Digite aqui:\s""");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1 -> systemLogin();
            case 2 -> System.exit(0);
            default -> {
                System.out.println("\nOpções disponíveis: 1 & 2.");
                sistema();
            }
        }

    }

    private static void systemLogin(){
        System.out.print("\n------ LOGIN ------\n" +
                "Matrícula: ");
        int matricula = sc.nextInt();
        System.out.print("Senha: ");
        String senha = sc.next();

        for(int i = 0; i < Funcionario.funcionarios.size(); i++){
            if(Funcionario.funcionarios.get(i).getMatricula() == matricula && Funcionario.funcionarios.get(i).getSenha().equals(senha)){
                if(Funcionario.funcionarios.get(i) instanceof Gerente){
                    loggedInManagement(i);
                } else {
                    loggedInFunc(i);
                }
            }
            if(i+1 == Funcionario.funcionarios.size()){
                System.out.println("Matrícula ou Senha incorretos!");
                systemLogin();
            }
        }

    }

    private static void loggedInFunc(int i){
        System.out.print("""
                
                ------ MENU FUNCIONÁRIO ------
                1 - Cadastrar Cliente;
                2 - Verificar Estoque;
                3 - Cadastrar Produto;
                4 - Voltar.
                Digite aqui:\s""");
        int decisao = sc.nextInt();

        switch (decisao) {
            case 1:
                Funcionario.funcionarios.get(i).cadastrarCliente();
                loggedInFunc(i);
                break;
            case 2:
                Funcionario.funcionarios.get(i).verificarEstoque();
                loggedInFunc(i);
                break;
            case 3:
                Funcionario.funcionarios.get(i).cadastrarProduto();
                loggedInFunc(i);
                break;
            case 4:
                systemLogin();
            default:
                System.out.println("Opções disponíveis: 1, 2, 3 e 4");
                loggedInFunc(i);
                break;
        }
    }

    private static void loggedInManagement(int i) {
        System.out.print("""
                
                ------ MENU GERENCIA ------
                1 - Cadastrar Funcionário;
                2 - Cadastrar Cliente;
                3 - Verificar Estoque;
                4 - Cadastrar Produto;
                5 - Voltar.
                Digite aqui:\s""");
        int decisao = sc.nextInt();

        switch (decisao) {
            case 1 -> {
                Gerente g = (Gerente) Funcionario.funcionarios.get(i);
                g.cadastrarFuncionario();
                loggedInManagement(i);
            }
            case 2 -> {
                Funcionario.funcionarios.get(i).cadastrarCliente();
                loggedInManagement(i);
            }
            case 3 -> {
                Funcionario.funcionarios.get(i).verificarEstoque();
                loggedInManagement(i);
            }
            case 4 -> {
                Funcionario.funcionarios.get(i).cadastrarProduto();
                loggedInManagement(i);
            }
            case 5 -> sistema();
            default -> {
                System.out.println("Opções disponíveis: 1,2,3,4 e 5");
                loggedInManagement(i);
            }
        }

    }


}
