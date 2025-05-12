package Projetos;
public class PrincipalFuncionarioPt2 {
    public static void main(String[] args) {
    Funcionario f1 = new Funcionario("joao", 2000);
    Funcionario f2 = new Funcionario("maria", 3000);
    Funcionario f3 = new Funcionario("pedro", 4000);
    Funcionario f4 = new Funcionario("jose", 5000);
    Funcionario f5 = new Funcionario("margarida", 6000);
    
    Funcionarios funcionarios = new Funcionarios();
    System.out.println(funcionarios);
    funcionarios.incluiFuncionario(f1);
    System.out.println(funcionarios);
    funcionarios.incluiFuncionario(f2);
    System.out.println(funcionarios);
    funcionarios.incluiFuncionario(f3);
    System.out.println(funcionarios);
    funcionarios.incluiFuncionario(f4);
    System.out.println(funcionarios);
    funcionarios.incluiFuncionario(f5);
    System.out.println(funcionarios);
    System.out.println(funcionarios.pagaMais());
    }
}
