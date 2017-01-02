import java.util.Random;

public class GYM {

	public static void fight(Pokemon p1, Pokemon p2) {
		Random ran = new Random();
		int x =ran.nextInt(2)+1;
		if (x== 1) {
			p1.setcp();
			System.out.println("Winner is "+p1.getname()+"\ncp+500");
			System.out.println(p1.getname()+" cp is:"+p1.getcp());
		} else if (x== 2) {
			p2.setcp();
			System.out.println("Winner is "+p2.getname()+"\ncp+500");
			System.out.println(p2.getname()+" cp is:"+p2.getcp());
		}

	}
}
