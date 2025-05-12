package Trabalho;
//Vinícius Mattos
//Matheus Gamba

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Suicidio {
    public static void main(String[] args) {
        System.out.println("EQUIPE: \nVINICIUS MATTOS \nMATHEUS GAMBA \n--------------");
        Suicidio s = new Suicidio();
        HashMap<Integer, Contadores> mapa = new HashMap<Integer, Contadores>();
        s.leContadores("C:/TextosTrabalho/suicidio.csv", mapa);
        Resultado resultadoHomens = s.mostrarDicionarioDados(mapa, 1); // conta homens
        System.out.println("O município com maior número de casos de homens é: " + resultadoHomens.getValor2() + " com " + resultadoHomens.getValor1() + " casos");
        Resultado resultadoMulheres = s.mostrarDicionarioDados(mapa, 2); // conta mulheres
        System.out.println("O município com maior número de casos de mulherers é: " + resultadoMulheres.getValor2() + " com " + resultadoMulheres.getValor1() + " casos");
        Resultado estadoCivil = s.mostrarEstadoCivil(mapa);
        if (estadoCivil.getValor1() == 1) {
            System.out.println("A maior incidência de casos é em solteiros (" + estadoCivil.getValor2() + ")");
        } else {
            if (estadoCivil.getValor1() == 2) {
                System.out.println("A maior incidência de casos é em casados (" + estadoCivil.getValor2() + ")");
            } else {
                if (estadoCivil.getValor1() == 3) {
                    System.out.println("A maior incidência de casos é em viúvos (" + estadoCivil.getValor2() + ")");
                } else {
                    if (estadoCivil.getValor1() == 4) {
                        System.out.println("A maior incidência de casos é em separados judicialmente (" + estadoCivil.getValor2() + ")");
                    } else {
                        if (estadoCivil.getValor1() == 5) {
                            System.out.println("A maior incidência de casos é em união consensual (" + estadoCivil.getValor2() + ")");
                        } else {
                            System.out.println("A maior incidência de casos é na categoria ignorado (" + estadoCivil.getValor2() + ")");
                        }
                    }
                }
            }
        }
        try {
			File arquivo = new File("suicid.txt");
			FileOutputStream fos = new FileOutputStream(arquivo, true);

			PrintWriter arquivoTexto = new PrintWriter(fos);

			arquivoTexto.print("Municipio com maior incidencia em homens: " + resultadoHomens.getValor2() + " com " + resultadoHomens.getValor1() + " casos");
			arquivoTexto.print("\nMunicipio com maior incidencia em mulheres: " + resultadoMulheres.getValor2() + " com " + resultadoMulheres.getValor1() + " casos");
			arquivoTexto.println("\nCategoria de estado civil com maior incidencia: " + estadoCivil.getValor1() + " com " + estadoCivil.getValor2() + " casos");
			
			arquivoTexto.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
    

    public void processaLinha(String linha, HashMap<Integer, Contadores> mapa) {
        boolean debugPrint = false;
        int codigoMunicipio = 0;
        Contadores registro = new Contadores();
        String[] partes = linha.split(";");
        if (partes.length > 0) {

            try {
                codigoMunicipio = Integer.parseInt(partes[12]);
            } catch (Exception e) {
                if (debugPrint) {
                    System.out.println("Erro na conversão do codigo do municipio");
                }
                return;
            }
            try {
                registro.setTotalSolteiro(0);
                if (Integer.parseInt(partes[9]) == 1) {// solteiro
                    registro.setTotalSolteiro(1);
                }
            } catch (Exception e) {
                if (debugPrint) {
                    System.out.println("Não foi possível contabilizar o campo solteiro");
                }
            }
            try {
                registro.setTotalCasado(0);
                if (Integer.parseInt(partes[9]) == 2) {// casado
                    registro.setTotalCasado(1);
                }
            } catch (Exception e) {
                if (debugPrint) {
                    System.out.println("Não foi possível contabilizar o campo casado");
                }
            }
            try {
                registro.setTotalViuvo(0);
                if (Integer.parseInt(partes[9]) == 3) {// viuvo
                    registro.setTotalViuvo(1);
                }
            } catch (Exception e) {
                if (debugPrint) {
                    System.out.println("Não foi possível contabilizar o campo viuvo");
                }
            }
            try {
                registro.setTotalSeparadoJudicialmente(0);
                if (Integer.parseInt(partes[9]) == 4) {// separado judicialmente
                    registro.setTotalSeparadoJudicialmente(1);
                }
            } catch (Exception e) {
                if (debugPrint) {
                    System.out.println("Não foi possível contabilizar o campo separado judicialmente");
                }
            }
            try {
                registro.setTotalUniaoConsensual(0);
                if (Integer.parseInt(partes[9]) == 5) {// uniao consensual
                    registro.setTotalUniaoConsensual(1);
                }
            } catch (Exception e) {
                if (debugPrint) {
                    System.out.println("Não foi possível contabilizar o campo união consensual");
                }
            }
            try {
                registro.setTotalIgnorado(0);
                if (Integer.parseInt(partes[9]) == 9) {// ignorado
                    registro.setTotalIgnorado(1);
                }
            } catch (Exception e) {
                if (debugPrint) {
                    System.out.println("Não foi possível contabilizar o campo ignorado");
                }
            }
            try {
                registro.setTotalHomens(0);
                if (Integer.parseInt(partes[7]) == 1) {// homem
                    registro.setTotalHomens(1);
                }
            } catch (Exception e) {
                if (debugPrint) {
                    System.out.println("Não foi possível contabilizar o campo homens");
                }
            }
            try {
                registro.setTotalMulheres(0);
                if (Integer.parseInt(partes[7]) == 2) {// mulher
                    registro.setTotalMulheres(1);
                }
            } catch (Exception e) {
                if (debugPrint) {
                    System.out.println("Não foi possível contabilizar o campo mulheres");
                }

            }
            if (mapa.containsKey(codigoMunicipio)) {
                Contadores registroAnterior = mapa.get(codigoMunicipio);
                registroAnterior.setTotalCasado(registro.getTotalCasado());
                registroAnterior.setTotalSolteiro(registro.getTotalSolteiro());
                registroAnterior.setTotalViuvo(registro.getTotalViuvo());
                registroAnterior.setTotalSeparadoJudicialmente(registro.getTotalSeparadoJudicialmente());
                registroAnterior.setTotalUniaoConsensual(registro.getTotalUniaoConsensual());
                registroAnterior.setTotalIgnorado(registro.getTotalIgnorado());
                registroAnterior.setTotalHomens(registro.getTotalHomens());
                registroAnterior.setTotalMulheres(registro.getTotalMulheres());
                mapa.replace(codigoMunicipio, registroAnterior);
                // System.out.println( "\nRegistro salvo: " + registroAnterior.toString());
            } else {
                registro.setCodigoMunicipio(codigoMunicipio);
                mapa.put(codigoMunicipio, registro);
                // System.out.println("\nRegistro salvo: " + registro.toString());
            }
        } else {
            System.out.println("Erro partes.length <= 0");
        }
    }

    public void leContadores(String arquivo, HashMap<Integer, Contadores> mapa) { // metodo para adicionar os dados no
        // int contadorLinhas = 0;
        try (
                BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            linha = leitor.readLine();// pula primeira linha
            while ((linha = leitor.readLine()) != null) {
                // System.out.println("processando linha " + contadorLinhas++ + " -------- \n" +
                // linha + " -------- \n");
                processaLinha(linha, mapa);
                // System.out.println("=========================================\n");
            } // hashmap
            /*
             * int municipio = 0;
             * System.out.println(mapa.size());
             * Set<Integer> keys = mapa.keySet();
             * for (Integer key : keys) {
             * System.out.println(municipio++ + " " + key);
             * }
             * System.out.println(linha);
             */
        } catch (Exception e) {
            System.out.println("Erro na leitura dos contadores");
        }
    }

    public Resultado mostrarDicionarioDados(Map<Integer, Contadores> param, int contabiliza) {
        // metodo para imprimir os dados
        int maiorValor = 0;
        int valorAtual = 0;
        int municipioMaiorValor = 0;
        // int i = 0;
        Set keySet = param.keySet();
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            // System.out.println(i++);
            Object key = it.next();
            Object value = param.get(key);
            // System.out.println(key + " -> " + value);

            Contadores registro = (Contadores) value;
            if (contabiliza == 1) {
                valorAtual = registro.getTotalHomens();
            } else {
                valorAtual = registro.getTotalMulheres();
            }
            if (valorAtual > maiorValor) {
                maiorValor = valorAtual;
                municipioMaiorValor = registro.getCodigoMunicipio();
            }
        }
        Resultado r = new Resultado(maiorValor, municipioMaiorValor);
        return r;
    }

    public Resultado mostrarEstadoCivil(Map<Integer, Contadores> param) {
        int maiorValorSolteiro = 0;
        int maiorValorCasado = 0;
        int maiorValorViuvo = 0;
        int maiorValorSeparado = 0;
        int maiorValorConsensual = 0;
        int maiorValorIgnorado = 0;
        int categoriaMaiorEstadoC = 0;
        int maiorValor = -1;

        // int i = 0;
        Set keySet = param.keySet();
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            // System.out.println(i++);
            Object key = it.next();
            Object value = param.get(key);
            // System.out.println(key + " -> " + value);

            Contadores registro = (Contadores) value;

            maiorValorSolteiro = registro.getTotalSolteiro();
            if (maiorValorSolteiro > maiorValor) {
                maiorValor = maiorValorSolteiro;
                categoriaMaiorEstadoC = 1;
            }

            maiorValorCasado = registro.getTotalCasado();
            if (maiorValorCasado > maiorValor) {
                maiorValor = maiorValorCasado;
                categoriaMaiorEstadoC = 2;
            }

            maiorValorViuvo = registro.getTotalViuvo();
            if (maiorValorViuvo > maiorValor) {
                maiorValor = maiorValorViuvo;
                categoriaMaiorEstadoC = 3;
            }

            maiorValorSeparado = registro.getTotalSeparadoJudicialmente();
            if (maiorValorSeparado > maiorValor) {
                maiorValor = maiorValorSeparado;
                categoriaMaiorEstadoC = 4;
            }

            maiorValorConsensual = registro.getTotalUniaoConsensual();
            if (maiorValorConsensual > maiorValor) {
                maiorValor = maiorValorConsensual;
                categoriaMaiorEstadoC = 5;
            }

            maiorValorIgnorado = registro.getTotalIgnorado();
            if (maiorValorIgnorado > maiorValor) {
                maiorValor = maiorValorIgnorado;
                categoriaMaiorEstadoC = 9;
            }
        }
        Resultado r = new Resultado(categoriaMaiorEstadoC, maiorValor);
        return r;

    }

}

/*
 * MATERIAL CONSULTADO:
 * https://www.w3schools.com/java/java_iterator.asp
 * https://pt.stackoverflow.com/questions/8810/utilizando-um-hashmap
 * https://pt.stackoverflow.com/questions/8/qual-a-melhor-forma-de-iterar-objetos-em-um-hashmap
 * https://www.delftstack.com/pt/howto/java/update-value-in-hashmap-java/#:~:text=Atualizar%20valor%20em%20Hashmap%20usando%20hashmap.replace%20%28%29%20em,ou%20substituir%20um%20valor%20existente%20em%20um%20HashMap.
 * https://acervolima.com/verifique-se-existe-algum-valor-especifico-no-java-hashmap/#:~:text=As%20diferentes%20abordagens%20para%20verificar%20a%20exist%C3%AAncia%20de,e%2C%20em%20seguida%2C%20itera%C3%A7%C3%A3o%20por%20meio%20desta%20lista
 * https://www.delftstack.com/pt/howto/java/how-to-get-keys-from-hashmap-in-java/#google_vignette
 * LIVRO BIG JAVA. CAY HORSTMAN. EDITORA BOOKMAN PAGINAS 734-740
 * MATERIAL DO AVA
 */
