package ques2;

public class LambdaExpression {
	
	double add(double a, double b) {
		return a+b;
	}
	
	public static double multiply(double a, double b) {
		return a*b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubtractionLambda subtraction =(a,b)->{
			return a-b;
		};
		
		MultiplicationLambda multiply = LambdaExpression::multiply;
		AdditionLambda addition = new LambdaExpression()::add;
		
		System.out.println(addition.apply(5, 5));
		System.out.println(subtraction.apply(5, 5));
		System.out.println(multiply.apply(5, 5));
	}

}
