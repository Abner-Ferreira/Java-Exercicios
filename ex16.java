package Exercicios;
import java.util.Scanner;
public class ex16 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double cateto1, cateto2, hipotenusa;
		
<<<<<<< HEAD

=======
<<<<<<< HEAD
>>>>>>> a7cb6ff664d231595ee75f1f13e7d45461600350
		System.out.println("Digite o valor do primeiro cateto: ");
		cateto1 = ler.nextDouble();
		System.out.println("Digite o valor do segundo cateto: ");
		cateto2 = ler.nextDouble();
		System.out.println("Digite o valor da hipotenusa: ");
<<<<<<< HEAD

=======
=======
>>>>>>> a7cb6ff664d231595ee75f1f13e7d45461600350
		System.out.println("Digite o primeiro valor: ");
		cateto1 = ler.nextDouble();
		System.out.println("Digite o segundo valor: ");
		cateto2 = ler.nextDouble();
		System.out.println("Digite o terceiro valor: ");
>>>>>>> edf8dcebe1c13eb54a596fe1c69d84d5e90920bf
		hipotenusa = ler.nextDouble();
		
		if ( hipotenusa * hipotenusa == cateto1*cateto1 + cateto2*cateto2) {
			System.out.println("Esse triângulo pode ser um triângulo retângulo!");
		}else {
			System.out.println("Esse triângulo não pode ser um triângulo retângulo!");
		}
		
		
	}

}
