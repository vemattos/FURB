package Projetos;
public class principalquestao7 {

    public static double calcularDistancia(ponto p1, ponto p2){
        //calculando a diferenca entre x1 e x2 e elevando ao quadrado
        double difX = Math.pow(p1.getX() - p2.getX(), 2);
        //calculando a diferenca entre y1 e y2 e elevando ao quadrado
        double difY = Math.pow(p1.getY() - p2.getY(), 2);
        //calculando a raiz da soma
        return Math.sqrt(difX + difY);        
    }
    public static void main(String[] args) {
        //criando vetor para armazenar varios pontos
        ponto vetor[] = new ponto[7];
        vetor[0] = new ponto(1, 1);
        vetor[1] = new ponto(1, 3);
        vetor[2] = new ponto(2, 4);
        vetor[3] = new ponto(4, 5);
        vetor[4] = new ponto(-1, 3);
        vetor[5] = new ponto(1, 4);
        vetor[6] = new ponto(-1, -1);


        double menorDistancia = 99.0;
        double distancia = 0;
        ponto p1 = null, p2 = null;
        for (int i = 0; i < vetor.length; i++) {
            for(int j=i+1; j<vetor.length; j++){
                //calculanfdo  e armazenando distancia entre os pontos
                distancia = calcularDistancia(vetor[i], vetor[j]);
                //verificando se a distancia calculada e a menor
                if (distancia < menorDistancia) {
                    menorDistancia = distancia;
                    p1 = vetor[i];
                    p2 = vetor[j];
                }
                System.out.println("Distância: " + distancia);
            }
        }
        System.out.println("Menor distância encontrada: " + menorDistancia);
        System.out.println("P1(" + p1.getX() + "," + p1.getY() + ")");
        System.out.println("P2(" + p2.getX() + "," + p2.getY() + ")");
    }
}
