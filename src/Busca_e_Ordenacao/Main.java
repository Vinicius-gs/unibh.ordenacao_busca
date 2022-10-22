package Busca_e_Ordenacao;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner entrada = new Scanner(System.in);
		
        
        int arr[] = new int[500];
        
        // Gerando numeros aleatorios no arry
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(10000);
		}
        
		System.out.print("Qual número deseja saber a posição: ");
		int opc = entrada.nextInt();
		  
        Insert ob = new Insert();

		// Executando Busca Binaria
		long comecoBinario = System.currentTimeMillis();
		System.out.println(ob.binarySearch(arr ,opc));
		long fimBinario = System.currentTimeMillis();
		
		
		// Executando Busca Sequencial
		long comecoSequencial = System.currentTimeMillis();
		ob.pesquisarNumero(opc, arr);
		long fimSequencial = System.currentTimeMillis();
		
        // Imprimindo resultado
        System.out.println("============ Tempo de execução Busca Binária ==================");
        System.out.println((fimBinario - comecoBinario) / 1000d);
        System.out.println("============ Tempo de execução Busca Sequencial ==================");
        System.out.println((fimSequencial - comecoSequencial) / 1000d);
        
        // Imprimir array
        ob.printArray(arr);
    }


	}


