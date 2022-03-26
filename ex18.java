package Exercicios;
import java.util.Scanner;
public class ex18 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double aceleracao,vinicial,tempo,velocidade;
		System.out.printf("Qual é a aceleração do carro em m/s? ");
		aceleracao = ler.nextDouble();
		System.out.printf("Qual é a velocidade inicial do carro em m/s? ");
		vinicial = ler.nextDouble();
		System.out.printf("Qual foi o tempo do percurso do carro em segundos? ");
		tempo = ler.nextDouble();
		velocidade = vinicial + (aceleracao*tempo);
		velocidade = velocidade * 3.6 ;
		if (velocidade == 0 ) {
			System.out.println("Seu veiculo está parado.");
			
		}else {
			if(velocidade <= 40) {
				System.out.println("Seu veiculo está muito lento.");
			} else {
				if(velocidade > 40 && velocidade <= 60 ) {
					System.out.println("Seu veiculo está na velocidade permitida.");
				}else {
					if(velocidade > 60 && velocidade <= 80) {
						System.out.println("Seu veiculo está em velocidade de cruzeiro.");
					} else if (velocidade > 80  && velocidade <= 120) {
						System.out.println("Seu veiculo está rápido.");
					} else {
						System.out.println("Seu veiculo está muito rápido.");
					}
				}
			}
		}
		
		
	}

}
