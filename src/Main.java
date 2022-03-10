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
                4 - Comprar;
                5 - Voltar.
                Digite aqui:\s""");
        int decisao = sc.nextInt();

        switch (decisao) {
            case 1 -> {
                cadastrarCliente();
                loggedInFunc(i);
            }
            case 2 -> {
                verificarEstoque();
                loggedInFunc(i);
            }
            case 3 -> {
                cadastrarProduto();
                loggedInFunc(i);
            }
            case 4 -> {
                comprar(i);
                loggedInFunc(i);
            }
            case 5 -> systemLogin();
            default -> {
                System.out.println("Opções disponíveis: 1, 2, 3 e 4");
                loggedInFunc(i);
            }
        }
    }

    private static void loggedInManagement(int i) {
        Gerente g = (Gerente) Funcionario.funcionarios.get(i);
        System.out.print("""
                
                ------ MENU GERENCIA ------
                1 - Cadastrar Funcionário;
                2 - Cadastrar Cliente;
                3 - Verificar Estoque;
                4 - Cadastrar Produto;
                5 - Comprar;
                6 - Voltar.
                Digite aqui:\s""");
        int decisao = sc.nextInt();

        switch (decisao) {
            case 1 -> {
                cadastrarFuncionario();
                loggedInManagement(i);
            }
            case 2 -> {
                cadastrarCliente();
                loggedInManagement(i);
            }
            case 3 -> {
                verificarEstoque();
                loggedInManagement(i);
            }
            case 4 -> {
                cadastrarProduto();
                loggedInManagement(i);
            }
            case 5 -> {
                comprar(i);
                loggedInManagement(i);
            }
            case 6 -> sistema();
            default -> {
                System.out.println("Opções disponíveis: 1,2,3,4 e 5");
                loggedInManagement(i);
            }
        }

    }

    // Funcionário/Ger
    private static void cadastrarCliente(){
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
        System.out.println("--- Endereço ---");
        System.out.print("País: ");
        cliente.setPais(sc.next());
        System.out.print("Estado: ");
        cliente.setEstado(sc.next());
        System.out.print("Cidade: ");
        cliente.setCidade(sc.next());
        System.out.print("Rua: ");
        cliente.setRua(sc.next());
        System.out.print("Número: ");
        cliente.setNumero(sc.nextInt());
        System.out.print("Complemento: ");
        cliente.setComplemento(sc.next());
        if(Cliente.clientes.size() == 0){
            cliente.setCadastro(1);
        } else {
            cliente.setCadastro(Cliente.clientes.get(Cliente.clientes.size() - 1).getCadastro() + 1);
        }
        Cliente.clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    private static void verificarEstoque() {
        System.out.println("------ VERIFICAR ESTOQUE ------");
        System.out.print("Digite o código do produto: " + "");
        int codigo = sc.nextInt();

        for(int i = 0; i < Produto.produtos.size(); i++){
            if(Produto.produtos.get(i).getCodigo() == codigo){
                System.out.print("Estoque disponível do produto ("+Produto.produtos.get(i).getCodigo()+"): " + Produto.produtos.get(i).getQuantidade());
            }
        }
    }

    private static void cadastrarProduto() {
        System.out.print("------ CADASTRAR PRODUTOS ------" +
                "\nCódigo: ");
        int cod = sc.nextInt();
        System.out.print("Marca: ");
        String marca = sc.next();
        System.out.print("Modelo: ");
        String modelo = sc.next();
        System.out.print("Descrição: ");
        String descricao = sc.next();
        System.out.print("Quantidade: ");
        int qntd = sc.nextInt();
        System.out.print("Valor: ");
        double valor = sc.nextDouble();
        Produto prod = new Produto(cod, qntd, descricao, marca, modelo, valor);
        prod.InsertProductInList(prod);
    }

    private static void comprar(int i) {
        System.out.println("------ COMPRAR ------");
        System.out.print("Código do Cliente: ");
        int codigoCliente = sc.nextInt();
        System.out.print("Código do produto: ");
        int codProduto = sc.nextInt();
        System.out.print("Quantidade: ");
        int qntd = sc.nextInt();
        contaCompra(codigoCliente, i, codProduto, qntd);
    }

    private static void contaCompra(int codCliente, int matFunc, int codProd, int qntd) {
        System.out.println("teste");
        for(int i = 0; i < Cliente.clientes.size(); i++){
            if(Cliente.clientes.get(i).getCadastro() == codCliente){
                System.out.println(Cliente.clientes.get(i).getNome() +
                        "\nComprou: " + Produto.produtos.get(codProd).getDescricao() +
                        "\nVendido por: " + Funcionario.funcionarios.get(matFunc).getNome() +
                        "\nQuantidade: " + qntd +
                        "\nValor final da compra: R$ " + Produto.produtos.get(codProd).getValor() * qntd);
                Produto.produtos.get(codProd).setQuantidade(Produto.produtos.get(codProd).getQuantidade() - qntd);
            }
        }
    }

    // Gerente
    private static void cadastrarFuncionario(){
        Funcionario func = new Funcionario();
        System.out.print("------ CADASTRAR FUNCIONÁRIO ------\n");
        func.cadastrar();
        System.out.print("Matrícula: ");
        func.setMatricula(sc.nextInt());
        System.out.print("Senha: ");
        func.setSenha(sc.next());
        Funcionario.funcionarios.add(func);
    }


}
