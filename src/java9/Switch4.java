package java9;

public class Switch4 {

	public static void main(String[] args) {
		String a = "青";
		
		switch(a) {
		case "赤":
			System.out.println("赤組です");
			break;
		case "白":
			System.out.println("白組です");
			break;
		default:
			System.out.println("エラーです");
			
		}

	}

}
