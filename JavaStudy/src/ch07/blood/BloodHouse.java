package ch07.blood;

public class BloodHouse {
	public boolean isPossible(Human human) {
		
		int age = 0; 
		String name = "";// ÇåÇ÷ÀÚÀÇ ³ªÀÌ¸¦ È®ÀÎÇÏ¿© ÀúÀå
		String type = "";// ÇåÇ÷ÀÚÀÇ ³ªÀÌ¸¦ È®ÀÎÇÏ¿© ÀúÀå
		boolean isPossible = false; // ÇåÇ÷ °¡´É ¿©ºÎ
		/* ³Ñ°Ü¹ŞÀº Human Å¬·¡½º·ÎºÎÅÍ age Á¤º¸ È®ÀÎ age = ? */
		age = human.getAge();
		name = human.getName();
		
		/* age°¡ 16¼¼ ÀÌ»ó 69¼¼ ÀÌÇÏ ÀÏ¶§¸¸ ÇåÇ÷ °¡´ÉÇÏµµ·Ï Á¶°Ç¹® ÀÛ¼º */
		if(age >= 16 && age <= 69) {
			isPossible = true;
		}
		return isPossible;
	}

	public String action(Human human) {
		String result = ""; // ÇåÇ÷ °á°ú ÀúÀå
		/* isPossible() ¸Ş¼Òµå¸¦ È°¿ëÇÏ¿© ÇåÇ÷ °¡´É ¿©ºÎ¸¦ È®ÀÎÇÏ´Â Á¶°Ç¹® ÀÛ¼º */
		/* ÇåÇ÷ °¡´É ½Ã result = "ÇåÇ÷ÀÌ ¿Ï·áµÇ¾ú½À´Ï´Ù. XX´Ô °¨»çÇÕ´Ï´Ù. */
		if(isPossible(human) == true) 
			result = "ÇåÇ÷ÀÌ °¡´ÉÇÕ´Ï´Ù"+ human.getName() + "´Ô °¨»çÇÕ´Ï´Ù";
			
		/* ÇåÇ÷ ºÒ°¡ ½Ã result = "ÇåÇ÷ÀÌ ºÒ°¡´ÉÇÕ´Ï´Ù. */
		else 
			System.out.println("ÇåÇ÷ÀÌ ºÒ°¡´ÉÇÕ´Ï´Ù");
		
		return result;
	}
}