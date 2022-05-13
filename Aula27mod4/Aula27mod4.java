import java.util.Scanner;

public class Aula27mod4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine();//Esse nextLine é para fazer a quebra de linha que o nextInt não faz
		s1 = sc.nextLine();//  Se digitar somente next vai pegar somente uma palavra diigtada, Digitando NextLine pega todas as palavras digitada
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("DADOS DIGITADOS");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();

	}

}
