import java.util.Scanner;

public class question32 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int money;
		
		int Array[] = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		String Array2[] = {"오만원권", "만원권", "천원권", "오백원", "백원", "오십원", "십원", "일원"};
		
		System.out.printf("금액을 입력하시오: ");
		money = scanner.nextInt();
				 
		 
		for(int i = 0; i <Array.length; i++) 
		{	
			
			if((money)/Array[i] != 0)
				System.out.println(Array2[i] + (money)/Array[i] + "매");
			money %= Array[i];
		}
		
	}

}
