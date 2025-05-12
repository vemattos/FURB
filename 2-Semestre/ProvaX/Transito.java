// VINICIUS MATTOS

package zProva;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

    
public class Transito {
    public Transito() {
        try {
			Scanner leitor = new Scanner(new File("C:/_projetos/TextoProva/Questao2.csv"));
			while (leitor.hasNext()) { 
				System.out.println(leitor.nextLine());
			}
			leitor.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
        HashMap<String, Dados> data = new HashMap<String, Dados>();
        leDados("C:/_projetos/TextoProva/Questao2.csv", data);
    }

    public void processaLinha(String linha, HashMap<String, Dados> data) {
        String nomeCidade = "";
        Dados registro = new Dados();
        String[] partes = linha.split(";");
        System.out.println(partes[0]);
        System.out.println(partes[1]);
        System.out.println(partes[2]);
        if (partes.length == 4) {
            try {
                nomeCidade = "florianopolis";
            } catch (Exception e) { 
                System.out.println("Não encontrou a cidade");
            }
            try {
                registro.setTotalCarros(0);
                if (partes[1].startsWith("Carro")) {
                    int numero = Integer.parseInt(partes[2]);
                    registro.setTotalCarros(numero);
                }
            } catch (Exception e) {
                System.out.println("Erro ao contabilizar numero de carros");
            }
            try {
                registro.setTotalMotos(0);
                if (partes[1].startsWith("Moto")) { 
                    int numero = Integer.parseInt(partes[2]);
                    registro.setTotalMotos(numero);
                }
            } catch (Exception e) {
                System.out.println("Erro ao contabilizar numero de carros");
            }
            try {
                registro.setTotalCaminhoes(0);
                if (partes[1].startsWith("Caminhao")) {
                    int numero = Integer.parseInt(partes[2]);
                    registro.setTotalCaminhoes(numero);
                }
            } catch (Exception e) {
                System.out.println("Erro ao contabilizar numero de carros");
            }
            if (data.containsKey(nomeCidade)) {
                Dados registroAntigo = data.get(nomeCidade);
                registroAntigo.setTotalCarros(registro.getTotalCarros());
                registroAntigo.setTotalMotos(registro.getTotalMotos());
                registroAntigo.setTotalCaminhoes(registro.getTotalCaminhoes());
                data.replace(nomeCidade, registroAntigo);
            } else {
                registro.setCidade(nomeCidade);
                data.put(nomeCidade, registro);
            }
        } else {
            System.out.println("Erro no tamanho do arquivo");
        }
    }

    public void leDados(String arquivo, HashMap<String, Dados> data) {
        try {
            BufferedReader leitor = new BufferedReader(new FileReader(arquivo));
            String linha;
            linha = leitor.readLine();
            while ((linha = leitor.readLine()) != null) {
                processaLinha(linha, data);
            }
        } catch (Exception e) {
            System.out.println("Erro na leitura dos dados");
        }
    }

    public int mostrarDados(Map<String, Dados> data, String contabiliza) {
        int maiorNumero = 0;
        int AtualCarro = 0;
        int AtualMoto = 0;
        int AtualCaminhao = 0;
        int municipio1MaiorNumero = 0;
        int municipio2MaiorNumero = 0;
        int municipio3MaiorNumero = 0;

        Set keySet = data.keySet();
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            Object key = it.next();
            Object value = data.get(key);
            System.out.println(key + " -> " + value);

            Dados registro = (Dados) value;
            if (contabiliza == "Florianopolis") {
                AtualCarro = registro.getTotalCarros();
                AtualMoto = registro.getTotalMotos();
                AtualCaminhao = registro.getTotalCaminhoes();
                municipio1MaiorNumero = AtualCarro + AtualMoto + AtualCaminhao;
            } else {
                if (contabiliza == "Joinvile") {
                AtualCarro = registro.getTotalCarros();
                AtualMoto = registro.getTotalMotos();
                AtualCaminhao = registro.getTotalCaminhoes();
                municipio2MaiorNumero = AtualCarro + AtualMoto + AtualCaminhao;
                } 
            }
                if (contabiliza == "Blumenau") {
                AtualCarro = registro.getTotalCarros();
                AtualMoto = registro.getTotalMotos();
                AtualCaminhao = registro.getTotalCaminhoes();
                municipio3MaiorNumero = AtualCarro + AtualMoto + AtualCaminhao;
            } 
            if (municipio1MaiorNumero > municipio2MaiorNumero && municipio1MaiorNumero > municipio3MaiorNumero) {
                maiorNumero = municipio1MaiorNumero;
            } else {
                if (municipio2MaiorNumero > municipio1MaiorNumero && municipio2MaiorNumero > municipio3MaiorNumero) {
                    maiorNumero = municipio2MaiorNumero;
                } else {
                    if (municipio3MaiorNumero > municipio1MaiorNumero && municipio3MaiorNumero > municipio2MaiorNumero) {
                        maiorNumero = municipio3MaiorNumero;
                    }
                }
            }
        }
        return maiorNumero;         
    }

    public static void main(String[] args) {
        new Transito();
    }
}