package Projetos;
public class PrincipalFuncionario {
    public static void main(String[] args) {
        Funcionario umImposto = new Funcionario("paulo", 5000);
        
        System.out.println(umImposto);

            Funcionario f1 = new Funcionario("joao", 2000);
            Funcionario f2 = new Funcionario("maria", 3000);
            Funcionario f3 = new Funcionario("pedro", 4000);
            Funcionario f4 = new Funcionario("jose", 5000);
            Funcionario f5 = new Funcionario("ronaldo", 6000);
            
            Funcionarios funcionarios = new Funcionarios();
            
            funcionarios.incluiFuncionario(f1);
            
            funcionarios.incluiFuncionario(f2);
            
            funcionarios.incluiFuncionario(f3);
            
            funcionarios.incluiFuncionario(f4);
            
            funcionarios.incluiFuncionario(f5);
            System.out.println(funcionarios);
            System.out.println(funcionarios.pagaMais());
            }
    }

