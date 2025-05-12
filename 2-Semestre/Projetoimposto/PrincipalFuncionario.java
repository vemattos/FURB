import java.text.DecimalFormat;

public class PrincipalFuncionario {
    public static void main(String[] args) {//Parte 1
    DecimalFormat df_2 = new DecimalFormat("0.00");
    Funcionario umImposto = new Funcionario("Vinicius", 1000);
    System.out.println(umImposto);
    umImposto = new Funcionario("Vinicius", 2000);
    System.out.println(umImposto);
    umImposto = new Funcionario("Vinicius", 3000);
    System.out.println(umImposto);
    umImposto = new Funcionario("Vinicius", 4000);
    System.out.println(umImposto);
    umImposto = new Funcionario("Vinicius", 5000);
    System.out.println(umImposto);

    System.out.println("\n Parte 2");

    //parte 2
    Funcionario f1 = new Funcionario("joao", 2000);
    Funcionario f2 = new Funcionario("maria", 3000);
    Funcionario f3 = new Funcionario("pedro", 4000);
    Funcionario f4 = new Funcionario("jose", 5000);
    Funcionario f5 = new Funcionario("ana", 6000);
    
    Funcionarios funcionarios = new Funcionarios();
    
    funcionarios.incluiFuncionario(f1);
   
    funcionarios.incluiFuncionario(f2);
    
    funcionarios.incluiFuncionario(f3);
    
    funcionarios.incluiFuncionario(f4);
    
    funcionarios.incluiFuncionario(f5);
    

System.out.println(funcionarios.listaFuncionarios());    

    System.out.println("Maior salário = R$ " + df_2.format(funcionarios.pagaMais().getSalario()));
    
    }
}

