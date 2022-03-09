import java.util.ArrayList;

public class Produto {
    static ArrayList<Produto> produtos = new ArrayList<Produto>();

    private int codigo, quantidade;
    private String descricao, marca, modelo;
    private double valor;


    public Produto(int codigo, int quantidade, String descricao, String marca, String modelo, double valor) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.marca = marca;
        this.modelo = modelo;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
