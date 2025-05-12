//vinicius mattos e alexandro brandt


package Funcionario;

public class SetorPessoal {
    private Funcionario[] funcionarios;
    private int indiceFuncionario;

    public SetorPessoal(int numeroFuncionarios) {
        this.funcionarios = new Funcionario[numeroFuncionarios];
        this.indiceFuncionario = 0;
    }

     public void listarFuncionarios() {
        for (int i = 0; i < indiceFuncionario; i++) {
            Funcionario funcionario = funcionarios[i];
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Função: " + funcionario.getFuncao());  
       }
    }

    //questao 5A
    //metodo que adiciona funcionarios
    public void adicionaFuncionarios(Funcionario funcionario) {
        if (indiceFuncionario < funcionarios.length) {
            funcionarios[indiceFuncionario] = funcionario;
            indiceFuncionario++;
        } else {
            System.out.println("O vetor de funcionários está cheio.");
        }
    }

    //questao 5B
    //metodo que imprime folha de pagamento listando nome e salario
    public void imprimeFolhaPagamento() {
        for (int i = 0; i < indiceFuncionario; i++) {
            Funcionario funcionario = funcionarios[i];
            System.out.print("Nome: " + funcionario.getNome());
            System.out.println("  \t Salário: " + funcionario.getSalario());

        }
    }

    //questao 5C
    //metodo que calcula e retorna o total da folha de pagamento
    public float calculaTotalFolhaPagamento() {
        float totalFolha = 0;
        for (int i = 0; i < indiceFuncionario; i++) {
            Funcionario funcionario = funcionarios[i];
            totalFolha += funcionario.getSalario();
        }
        return totalFolha;
    }

    //questao 5D
    //metodo que reotrna o nome do funcionario com maior salario
    public String funcionarioMaiorSalario() {
        String nomesMaiorSalario = "";
        if (indiceFuncionario == 0) {
            return "Empresa não possuí funcionarios.";
        }
        Funcionario funcionarioMaiorSalario = funcionarios[0];
        nomesMaiorSalario = funcionarios[0].getNome();         
        for (int i = 1; i < indiceFuncionario ; i++) {
            Funcionario funcionario = funcionarios[i];
            if (funcionario.getSalario() > funcionarioMaiorSalario.getSalario()) {
                funcionarioMaiorSalario = funcionario;
                nomesMaiorSalario = funcionarios[i].getNome();  
            }
        }
        
        return nomesMaiorSalario;
    }

    //questao 5E
    //metodo que lista funcionarios por departamento
    public void listaFuncionariosPorDepartamento(int numDepartamento) {
        boolean encontrou = false;
    
         System.out.println("Listagem de funcionários do departamento " + numDepartamento + ":");
        for (int i = 0; i < indiceFuncionario; i++) {
            Funcionario funcionario = funcionarios[i];
            if (funcionario.getDepartamento() == numDepartamento) {
                encontrou = true;
                System.out.print("Nome: " + funcionario.getNome());
                System.out.println(" \t Cargo: " + funcionario.getFuncao());
   
            }
        }
    
        if (!encontrou) {
            System.out.println("Não há funcionários no departamento: " + numDepartamento);
        }
    }

    //questao 5F
    //metodo que imprime os funcionarios de determinada funcao
    public void listaFuncionariosPorFuncao(String funcao) {
        boolean encontrou = false;

        System.out.println("Lista de funcionários com a função: " + funcao);
        for (int i = 0; i < indiceFuncionario; i++) {
            Funcionario funcionario = funcionarios[i];
            if (funcionario.getFuncao().equalsIgnoreCase(funcao)) {
                 encontrou = true;
                System.out.println("Nome: " + funcionario.getNome());
            }
        }
    
        if (!encontrou) {
            System.out.println("Não há funcionários com a função: " + funcao);
        }
    }

    //questao 5G
    //metodo que imprime folha de pagamento em ordem crescente de salarios
    public void imprimeFolhaPagamentoOrdenada() {
        if (indiceFuncionario == 0) {
            System.out.println("Não há funcionários para imprimir.");
            return;
        }
    
        // Copie os funcionários manualmente para um novo array
        Funcionario[] funcionariosOrdenados = new Funcionario[indiceFuncionario];
        for (int i = 0; i < indiceFuncionario; i++) {
            funcionariosOrdenados[i] = funcionarios[i];
        }
    
        // Use o algoritmo de ordenação da bolha para ordenar por salário
        boolean troca;
        do {
            troca = false;
            for (int i = 0; i < funcionariosOrdenados.length - 1; i++) {
                if (funcionariosOrdenados[i].getSalario() > funcionariosOrdenados[i + 1].getSalario()) {
                    // Troca os funcionários se estiverem fora de ordem
                    Funcionario temp = funcionariosOrdenados[i];
                    funcionariosOrdenados[i] = funcionariosOrdenados[i + 1];
                    funcionariosOrdenados[i + 1] = temp;
                    troca = true;
                }
            }
        } while (troca);
    
        System.out.println("Folha de pagamento ordenada em ordem crescente de salários:");
    
        for (Funcionario funcionario : funcionariosOrdenados) {
            System.out.println("Nome: " + funcionario.getNome() + "\tSalário: " + funcionario.getSalario());
        }
    }
    }
