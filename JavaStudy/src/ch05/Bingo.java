package ch05;

public class Bingo {
	public static void main(String[] args) {
	
	int[] bingo = new int[25];
	//ºù°í »ý¼º 1 ~ 25
	
	for(int i = 0; i < bingo.length; i++) {
		bingo[i] = i + 1;
		}
    //ºù°í ¼¯¾îÁÖ±â (·£´ý)
	for(int i = 0; i < 1000; i++) {
		int random =
				(int)(Math.random()*bingo.length);
		int temp = bingo[0];
		bingo[0] = bingo[random];
		bingo[random] = temp; 
	  }
	//ºù°í Ãâ·Â
	for(int i = 0; i < bingo.length; i++) {
		System.out.print(bingo[i] + "\t");
        if( (i+1) % 5 == 0) {
        	System.out.println();
        }
        //System.out.print(bingo[i] + " ");
		//		if((i + 1) % 5 == 0) {
//			System.out.println();
//		}
	}
	
	}
}
