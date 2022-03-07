import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {



        sistema();
    }

    public static void sistema() {
        System.out.print("""
                ------ MENU INICIAL ------
                1 - Iniciar como funcionário;
                2 - Iniciar como gerencia;
                3 - Fechar o programa.
                Digite aqui:\s""");
        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
                menuFuncionario();
                break;
            case 2:
                menuGerencia();
                break;
            case 3:
                System.exit(0);
                break;
            default: System.out.println("\nOpções disponíveis: 1,2,3.");
                sistema();
                break;
        }
    }

    public static void menuFuncionario(){
        System.out.print("""
                ------ MENU INICIAL FUNCIONÁRIO ------
                1 - Logar;
                2 - Cadastrar Cliente;
                3 - Voltar.
                Digite aqui:\s""");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1 -> logar();
            case 2 -> cadastrar();
            case 3 -> sistema();
            default -> {
                System.out.println("\nOpções disponíveis: 1,2,3.");
                menuFuncionario();
            }
        }

    }

    public static void logar(){
    }

    public static void cadastrar() {
        Cliente cliente = new Cliente();
        System.out.print("Insira os seguintes dados:\nNome: ");
        cliente.setNome(sc.next());
        System.out.print("CPF: ");
        cliente.setCpf(sc.next());
        System.out.print("Idade: ");
        cliente.setIdade(sc.nextInt());
        System.out.print("Email: ");
        cliente.setEmail(sc.next());
        System.out.print("Telefone: ");
        cliente.setTelefone(sc.next());
        System.out.print("Gênero: ");
        cliente.setGenero(sc.next());
        if(Cliente.clientes.size() == 0){
            cliente.setCadastro(1);
        } else {
            cliente.setCadastro(Cliente.clientes.get(Cliente.clientes.size() - 1).getCadastro() + 1);
        }
        Cliente.clientes.add(cliente);
    }

    public static void menuGerencia() {

    }

}
