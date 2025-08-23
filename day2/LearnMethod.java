package week1.day2;

public class LearnMethod {

	//method signature; access odifies returntype method name()
	
	int noOfLearners;
	
	public void add() {
		int a=5, b=10;
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		
		//syntax to create object->
		//classname objectname=ne classname();
		LearnMethod addition = new LearnMethod();
		addition.add();
		System.out.println(addition.noOfLearners);
	}

}
