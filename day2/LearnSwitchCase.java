package week1.day2;

public class LearnSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser="chrome";
		//shortcut for switch, type switch and do ctrl+space
		switch (browser) {
		case "chrome":
			System.out.println("open chrome");
			break;
		case "edge":
			System.out.println("open edge");
			break;
		case "firefox":
			System.out.println("open firefox");
			break;
			default:
				System.out.println("no browser found");
		}

	}

}
