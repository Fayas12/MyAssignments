package week1.day2;

public class LearnIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=50;
		// shorcut for if --?type if and ctrl+space
		if (marks>=60) {
			System.out.println("pass");	
		} 
		int marks1=90;
		if (marks1==60) {
			System.out.println("pass");
			
		} else if (marks1<45) {
			System.out.println("fail");
			
		} else if (marks1>80) {
			System.out.println("Distinction");

		} else {
			System.out.println("out of range");
		}

	}

}
