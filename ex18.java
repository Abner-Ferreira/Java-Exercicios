package Exercicios;
import java.util.Scanner;
public class ex18 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double aceleracao,vinicial,tempo,velocidade;
		System.out.printf("Qual � a acelera��o do carro em m/s? ");
		aceleracao = ler.nextDouble();
		System.out.printf("Qual � a velocidade inicial do carro em m/s? ");
		vinicial = ler.nextDouble();
		System.out.printf("Qual foi o tempo do percurso do carro em segundos? ");
		tempo = ler.nextDouble();
		velocidade = vinicial + (aceleracao*tempo);
		velocidade = velocidade * 3.6 ;
		if (velocidade == 0 ) {
			System.out.println("Seu veiculo est� parado.");

		}else if(velocidade <= 40) {
			System.out.printf("%.1f km/h-- Seu veiculo est� muito lento.",velocidade);
		} else if( velocidade <= 60 ) {
			System.out.printf("%.1f km/h-- Seu veiculo est� na velocidade permitida.",velocidade);
		}else if( velocidade <= 80) {
			System.out.printf("%.1f km/h-- Seu veiculo est� em velocidade de cruzeiro.",velocidade);
		} else if ( velocidade <= 120) {
			System.out.printf("%.1f km/h-- Seu veiculo est� r�pido.",velocidade);

		} else  {
			System.out.printf("%.1f km/h-- Seu veiculo est� muito r�pido.",velocidade);
				}	
	


	}
}
