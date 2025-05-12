//vinicius mattos e alexandro brandt


package Funcionario;

public class TesteSetorPessoal {
    
    public TesteSetorPessoal(){
        // Crie um objeto SetorPessoal
        SetorPessoal setorPessoal = new SetorPessoal(10); // Pode ajustar o tamanho conforme necessário
        
        // Adicione alguns funcionários
        Funcionario funcionario1 = new Funcionario(1, "Vinicius", 1, 8000.0f, "Contador");
        Funcionario funcionario2 = new Funcionario(2, "João", 2, 1000.0f, "Secretário");
        Funcionario funcionario3 = new Funcionario(3, "Bernardo", 1, 9000.0f, "Montador");
        Funcionario funcionario4 = new Funcionario(2, "Bruno", 2, 2500.0f, "Vendedor");
        Funcionario funcionario5 = new Funcionario(3, "Henrique", 1, 2500.0f, "Vendedor");
        
        setorPessoal.adicionaFuncionarios(funcionario1);
        setorPessoal.adicionaFuncionarios(funcionario2);
        setorPessoal.adicionaFuncionarios(funcionario3);
        setorPessoal.adicionaFuncionarios(funcionario4);
        setorPessoal.adicionaFuncionarios(funcionario5);
        
        //Lista todos os funcionários
        System.out.println("Lista de todos os funcionários:");
        setorPessoal.listarFuncionarios();
        System.out.println("---\n");
        
        // Calcula o total da folha de pagamento
        float totalFolhaPagamento = setorPessoal.calculaTotalFolhaPagamento();
        System.out.println("Total da folha de pagamento: " + totalFolhaPagamento);
        System.out.println("---\n");
        
        // Encontra o funcionário com o maior salário
        String funcionarioMaiorSalario = setorPessoal.funcionarioMaiorSalario();
        System.out.println("Funcionário com o maior salário: " + funcionarioMaiorSalario);
        System.out.println("---\n");
        
        // Lista funcionários de um departamento específico
        int departamento = 2; 
        setorPessoal.listaFuncionariosPorDepartamento(departamento);
        System.out.println("---\n");
        
        // Lista funcionários por função específica
        String funcao = "Vendedor"; 
        setorPessoal.listaFuncionariosPorFuncao(funcao);
        System.out.println("---\n");
        
        // Imprime a folha de pagamento ordenada por salário
        setorPessoal.imprimeFolhaPagamentoOrdenada();
    }
    public static void main(String[] args) {
        new TesteSetorPessoal();
}
}