package cofrinho;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
   
	//codigo para listar moedas privado fora da main que é publica
    private static void listarMoedas(ArrayList<Moeda> lista) {
        if (lista.isEmpty()) {
            System.out.println("Nenhuma moeda no cofrinho.");
        } else {
            System.out.println("Moedas no cofrinho:");
            for (Moeda moeda : lista) {
                moeda.info();
            }
     }
        }
	
    public static void main(String[] args) {
        
        Moeda m;
        int op;
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Moeda> lista = new ArrayList<Moeda>();
        
        do {
            System.out.println("Digite uma opção: ");
            System.out.println("1 - Adicionar moeda");
            System.out.println("2 - Remover moeda");
            System.out.println("3 - Listar moedas");
            System.out.println("4 - Valor total no cofrinho");
            System.out.println("5 - Encerrar");
            op = scanner.nextInt();
            
            switch (op) {
            case 1:
                System.out.print("Digite o valor da moeda: ");
                double valorMoeda = scanner.nextDouble();
                System.out.println("Escolha o tipo da moeda (1-Real, 2-Dólar, 3-Euro, 4-Bitcoin): ");
                int tipoMoeda = scanner.nextInt();
                
                //guardar no tipo de moeda correto de acordo com que a pessoa digitou
                if (tipoMoeda == 1) {
                    m = new Real(valorMoeda);
                } else if(tipoMoeda == 2){
                    m = new Dolar(valorMoeda);
                }else if(tipoMoeda == 3){
                    m = new Euro(valorMoeda);
                }else if(tipoMoeda == 4) {
                	m = new Bitcoin(valorMoeda);
                }                
                else {
                    System.out.println("Tipo de moeda não cadastrado");             
                    break;
                }
                
                lista.add(m);
                System.out.println("Moeda adicionada com sucesso.");
                break;
                
            case 2:
            	//verificar se a lista esta vazia antes de remover
                if (lista.isEmpty()) {
                    System.out.println("Não há moedas para remover.");
                    break;
                }
                //remover de acordo com o indice digitado
                System.out.println("Escolha uma moeda para remover:");
                for (int i = 0; i < lista.size(); i++) {
                    System.out.print(i + " - ");
                    lista.get(i).info();
                }
                int indiceRemover = scanner.nextInt();
                
                if (indiceRemover >= 0 && indiceRemover < lista.size()) {
                    lista.remove(indiceRemover);
                    System.out.println("Moeda removida com sucesso.");
                } else {
                    System.out.println("Índice inválido.");
                }
                break;
                
            case 3:
            	listarMoedas(lista);
                break;
                
            case 4:
            	double total=0;
            	for (Moeda moeda : lista) {
            		total += moeda.converter(); 
            	}
            	System.out.println("Valor total em Reais do cofrinho: " + total);
                break;

            case 5:
                System.out.println("Encerrando o programa.");
                break;
                
            default:
                System.out.println("Opção inválida, tente novamente.");
                break;
            }
            
        } while(op != 5);
        
        scanner.close();
    }
}
