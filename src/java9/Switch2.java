package java9;

public class Switch2 {

	public static void main(String[] args) {
		int a = 5;
		
		switch(a) {
		case 0:
			System.out.println("aは0に等しい");
			break;
		case 1:
			System.out.println("aは1に等しい");
			break;
		default:
			System.out.println("aは0でも1でもない");
		}

	}

}
