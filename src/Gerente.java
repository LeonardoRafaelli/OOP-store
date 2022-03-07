public class Gerente extends Funcionario{

    public void cadastrarFuncionario(){
        Funcionario func = new Funcionario();
        System.out.print("------ CADASTRAR FUNCIONÁRIO ------");
        System.out.print("Nome: ");
        func.setNome(sc.next());
        System.out.print("Senha: ");
        func.setSenha(sc.next());
        System.out.print("Matrícula: ");
        func.setMatricula(sc.nextInt());
    }

}
