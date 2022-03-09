import java.util.Scanner;

public class Pessoa extends Endereco {

    static Scanner sc = new Scanner(System.in);

    private String nome, cpf, email, telefone, genero;
    private int idade;

    public Pessoa() {

    }

    public void cadastrar() {
        System.out.print("Nome: ");
        this.nome = sc.next();
        System.out.print("CPF: ");
        this.cpf = sc.next();
        System.out.print("Email: ");
        this.email = sc.next();
        System.out.print("Telefone: ");
        this.telefone = sc.next();
        System.out.print("Gênero: ");
        this.genero = sc.next();
        System.out.println("-- Endereço --");
        System.out.print("País: ");
        this.setPais(sc.next());
        System.out.print("Estado: ");
        this.setEstado(sc.next());
        System.out.print("Cidade: ");
        this.setCidade(sc.next());
        System.out.print("Bairro: ");
        this.setBairro(sc.next());
        System.out.print("Rua: ");
        this.setRua(sc.next());
        System.out.print("Complemento: ");
        this.setComplemento(sc.next());
        System.out.print("Número: ");
        this.setNumero(sc.nextInt());
        System.out.print("CEP: ");
        this.setCep(sc.nextInt());
    }


    public void comprar(){
        System.out.println("------ COMPRAR ------");
        System.out.print("Código do Cliente: ");
        int codigoCliente = sc.nextInt();
        System.out.print("Matrícula do Funcionário (Vendedor): ");
        int matriculaFunc = sc.nextInt();
        System.out.print("Código do produto: ");
        int codProduto = sc.nextInt();
        System.out.print("Quantidade da compra: ");
        int qntdCompra = sc.nextInt();
    }

    public Pessoa(String nome, String cpf, String email, String telefone, String genero, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.genero = genero;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
