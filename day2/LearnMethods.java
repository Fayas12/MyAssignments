package week1.day2;

public class LearnMethods {
	//accessmodifier returntype methodname(parameters)
	//return type is nothing but returing the output of a method/function
	void addNumbers(int a,int b,float c) {
		System.out.println(a+b+c);
		
	}
	int noOfBicycles() {
		return 2;
	}
	String biCycleData(String brandName, String brandColor) {
		return brandName+""+brandColor;
	}
	public static void main(String[] args) {
		LearnMethods lm1=new LearnMethods();
		lm1.addNumbers(5, 6, 7.90f);
		int number=lm1.noOfBicycles();
		System.out.println(number); // either we need a variable to get the return value of a method or we need to pass the expected return value in the parameters 
		System.out.println(lm1.biCycleData("honda", "white"));
	}

}
