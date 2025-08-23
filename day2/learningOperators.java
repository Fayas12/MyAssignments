package week1.day2;

public class learningOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(5+5);
		System.out.println(4/2);
		System.out.println(11%2);
		
		//assignment operators
		
		int a=5, b=10;
		a+=5; //a=a+5--->a=5+5=10
		System.out.println(a);
		b-=3; //b=b-3
		System.out.println(b); //7
		b*=2; //b=b*2----?7*2=14
		System.out.println(b);
		
		//comparison operators
		System.out.println(5==5);
		System.out.println(7>=5);
		
		//logical operator using and &&
		System.out.println((5==5) && (6>7)); //1*0--->0---->false
		System.out.println((8>5) && (3<=4));
		
		//logical operator using or operator
		System.out.println((1==2) || (6>8)); //0+0--->false 
		System.out.println((6>-8) && (2==3) || (9>0)); //1*0--->0+1--->1 (true)
		
		//unary operators
		int c=5;
		System.out.println(++c); //6 value get assigned to variable when we are doing pre-increment
		System.out.println(c++); //6 operation performed but value wont get assigned to variable in post-increment,latest values will get update in the next line
		System.out.println(c);
		
		System.out.println(--c); // pre-decrement
		System.out.println(c--); //post-decrement
		System.out.println(c);




	}

}
