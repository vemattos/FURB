package Projetos;
public class Apolice {
 //declarando os atributos
 private String nome;
 private int idade;
 private double valorPremio;

 //declarando construtores
 public Apolice(String nome, int idade, double valorPremio) {

     setNome(nome);
     setIdade(idade);
     setValorPremio(valorPremio);
 }
 
 //criar getters e setters
 public String getNome() {
     return nome;
 }

 public void setNome(String nome) {
     this.nome = nome;
 }

 public int getIdade() {
     return idade;
 }

 public void setIdade(int idade) {
     if (idade < 0) {
         throw new IllegalArgumentException("idade inválida");
     }
     this.idade = idade;
 }

 public double getValorPremio() {
     return valorPremio;
 }

 public void setValorPremio(double valorPremio) {
     if (valorPremio < 0) {
         throw new IllegalArgumentException("Valor inválido");
     }
     this.valorPremio = valorPremio;
 }

 //método retorna uma String que mostrará na tela todos os atributos da classe Apólice
 public String imprimir() {
     return "Nome: " + getNome() + "\n" +
            "Idade: " + getIdade() + "\n" +
            "Valor: " + getValorPremio(); 
 }
 
 /*Este método não retorna valor, mas deverá calcular o valor do premio
   seguindo as seguintes regras, para a idade:
   - idade entre 18 e 25, acresentar 20%
   - idade entre 25 e 36, acresentar 15%
   - idade a cima de 36, acresentar 10%
  */
 public void calcularPremio() {
     //idade a cima de 18 e menor ou igual a 25
     if (getIdade() >= 18 && getIdade() <=25) {
         setValorPremio(getValorPremio() * 1.20);
     } else {
         //idade a cima de 25 e menor ou igual a 36
         if (getIdade() > 25 && getIdade() <= 36) {
             setValorPremio(getValorPremio() * 1.15);
         } else {
             //idade a cima de 36
             if (getIdade() > 36) {
                 setValorPremio(getValorPremio() * 1.1);
             }
         }
     }
 }

 /*Este método não retoma valor, mas recebe o parâmetro cidade, que irá conter o nome da cidade para o 
 cálculo do desconto
 - se a cidade for Ilhota -5%
 - se a cidade for Blumenau -3%
 - se a cidade for Itajai -1%
 */
 public void oferecerDesconto(String cidade) {
     //se a cidade for Ilhota
     if (cidade.equalsIgnoreCase("Ilhota")) {
         setValorPremio(getValorPremio() * 0.95);
     } else {
         //se a cidade for Blumenau
         if (cidade.equalsIgnoreCase("Blumenau")) {
             setValorPremio(getValorPremio() * 0.97);
         } else {
             //se a cidade for Itajai
             if (cidade.equalsIgnoreCase("Itajai")) {
                 setValorPremio(getValorPremio() * 0.99);
             } else {
                 throw new IllegalArgumentException("Cidade que nao recebe beneficio");
             }
         }
     }
 }
}