import java.util.ArrayList;

public class Cliente extends Pessoa{

    static ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    private int cadastro;

    public void setCadastro(int cadastro){
        this.cadastro = cadastro;
    };

    public int getCadastro(){
        return this.cadastro;
    };

}
