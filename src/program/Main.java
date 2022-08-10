package program;

/*
beecrowd | 1094 - Experiências

Maria acabou de iniciar seu curso de graduação na faculdade de medicina
e precisa de sua ajuda para organizar os experimentos de um laboratórioo qual ela é responsável.
Ela quer saber no final do ano, quantas cobaias foram utilizadas no laboratório
e o percentual de cada tipo de cobaia utilizada.

Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos.
Para obter estas informações, ela sabe exatamente o número de experimentos que foram realizados,
o tipo de cobaia utilizada e a quantidade de cobaias utilizadas em cada experimento.

Entrada
A primeira linha de entrada contém um valor inteiro N que indica os vários casos de teste que vem a seguir.
Cada caso de teste contém um inteiro Quantia (1 ≤ Quantia ≤ 15) que representa
a quantidade de cobaias utilizadas e um caractere Tipo ('C', 'R' ou 'S'),
indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho).

Saída
Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada
e o percentual de cada uma em relação ao total de cobaias utilizadas,
sendo que o percentual deve ser apresentado com dois dígitos após o ponto.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int rato = 0;
		int sapo = 0;
		int coelho = 0;
		double totalCobaia = 0;

		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			int cobaia = sc.nextInt();
			String tipoCobaia = sc.next();
			
			if(tipoCobaia.equals("R")) {
				rato += cobaia;
			}
			if(tipoCobaia.equals("S")) {
				sapo += cobaia;
			}
			if(tipoCobaia.equals("C")) {
				coelho += cobaia;
			}
			totalCobaia += cobaia;
		}
		
		double percentoRato = rato / (totalCobaia / 100);
		double percentoSapo = sapo / (totalCobaia / 100);
		double percentoCoelho = coelho / (totalCobaia / 100);
		
		System.out.printf(
				"Total: %.0f cobaias\n"
				+ "Total de coelhos: %d\n"
				+ "Total de ratos: %d\n"
				+ "Total de sapos: %d\n"
				+ "Percentual de coelhos: %.2f %%\n"
				+ "Percentual de ratos: %.2f %%\n"
				+ "Percentual de sapos: %.2f %%\n"
				, totalCobaia, coelho, rato, sapo, percentoCoelho, percentoRato, percentoSapo);
		sc.close();
	}
}
