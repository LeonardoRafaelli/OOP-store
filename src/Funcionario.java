
import java.util.ArrayList;

public class Funcionario extends Pessoa{

    static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

    private int matricula;
    private String senha;

    public Funcionario {
        super();
    }

    public Funcionario(String nome, String cpf, String email, String telefone, String genero, int idade, int matricula, String senha) {
        super(nome, cpf, email, telefone, genero, idade);
        this.matricula = matricula;
        this.senha = senha;
    }

    public void vender(){

    }


    public void cadastrarCliente() {
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

    public void verificarEstoque() {
        System.out.println("------ VERIFICAR ESTOQUE ------");
        System.out.print("Digite o código do produto: ");
        int codigo = sc.nextInt();

        for(int i = 0; i < Produto.produtos.size(); i++){
            if(Produto.produtos.get(i).getCodigo() == codigo){
                System.out.print("Estoque disponível do produto ("+Produto.produtos.get(i).getCodigo()+"): " + Produto.produtos.get(i).getQuantidade());
            }
        }
    }

//    private int codigo, quantidade;
//    private String descricao, marca, modelo;
//    private double valor;
    public void cadastrarProduto() {
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
        Produto.produtos.add(prod);
    }



    // GETTERS AND SETTERS
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
