import java.util.*;
public class OptimalATM {
	public static void main(String[] args) {
		System.out.print("Çekmek İstediğiniz Para Miktarını Giriniz:");
		Scanner input = new Scanner(System.in);
		int para = input.nextInt();
		int ikiyuz = para/200;
		para-= ikiyuz*200;
		int yuz = para/100;
		para -= yuz*100;
		int elli = para/50;
		para -= elli*50;
		int yirmi = para/20;
		para -= yirmi*20;
		int on = para/10;
		int verilemeyen = para%10;
		input.close();
		System.out.println("200 TL banknot sayısı:"+ ikiyuz);
		System.out.println("100 TL banknot sayısı:"+ yuz);
		System.out.println("50 TL banknot sayısı:"+ elli);
		System.out.println("20 TL banknot sayısı:"+ yirmi);
		System.out.println("10 TL banknot sayısı:"+ on);
		System.out.println(" ");
		System.out.println("Verilemeyen Para Miktarı(TL):"+ verilemeyen);
	}
}