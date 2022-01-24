package kr.co.jsh.test.lambda;

public class Lambda01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc add = (x,y) -> x+y;
		Calc minus = (int x, int y) -> x-y;
		Calc multiply = (x,y) -> {
			return x*y;
		};
		Calc devide = (int x,int y) -> {
			return x/y;
		};
		
		int result = add.doCalc(100, 20);
		int result2 = minus.doCalc(100, 20);
		int result3 = multiply.doCalc(100, 20);
		int result4 = devide.doCalc(100, 20);
		
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);

		
	}
		
	interface Calc{
		int doCalc(int x, int y);
	}
	interface ShowArgs {
		void showArgs(int x, int y);		
	}
}
