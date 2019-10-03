import java.util.Scanner;

public class Spavanac {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int H = input.nextInt();
		
		int M = input.nextInt();
			
		int HM = H * 60;
		
		int SummaM = HM + M - 45;
		
		int RestM = SummaM % 60;
			if(RestM < 0)	{
				RestM = 60 + (RestM);
				}
		int RestH = (SummaM - RestM) /60 ;
			if (RestH < 0) {
				RestH = 24 + (RestH);
				}
			if (H >= 0 && H <= 23 && M >= 0 && M <= 59) {
				System.out.println(RestH + " " + RestM);
			}
		}
}
