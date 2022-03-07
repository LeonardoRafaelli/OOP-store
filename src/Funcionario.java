
import java.util.ArrayList;

public class Funcionario extends Pessoa{

    static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

    private int matricula;
    private String senha;

    public void vender(){

    }

    public void cadastrarCliente() {

    }

    public void verificarEstoque() {

    }

    public void cadastrarProduto() {

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
