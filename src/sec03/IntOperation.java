package sec03;

public class IntOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수에서 int 이하 피연산자 간의 연산은 int 타입으로 변환되어 연산된다.
		
		byte b = 10;
		short s = 20;
		int add = b + s ;
		add = (short)(b + s) ;
		System.out.println("add : " + add);
		//short and = b + s ; // 컴파일 오류
		//add = (short)(b + s) ; //(short) 타입으로 변환 했기 떄문에 가능.
		
		//byte type 오버플로
		//byte bl = 128; // byte type으로 강제 변환해야(-128)
		//System.out.println("b1 : " +b1)
		byte b2 = 126 + 1;
		
		byte b1 = 10;
		byte b3 = (byte) (b1 + 1); 
		System.out.println(b3);
		
		int maxVal = Integer.MAX_VALUE;
		System.out.println("Integer.MAX_VALUE : " + maxVal);
		
		System.out.println(maxVal + 1); //쓰레기값
		
		int i = 1; 
		
		i = 100;
		long longVal = 200;
		long sumVal = i + longVal;
		System.out.println("sumVal : " + sumVal);
		//i = i + longVal; //type case
		
		
		// 정수 실수간 연산
		float fVal = 100.2f;
		float fSum = longVal + fVal;
		System.out.println("fsum : " + fSum);
		
		
		double dVal = 300.5;
		double dSum = fVal + dVal ;
		System.out.println(String.format("%.1f", dSum));
	
		int num1 = 9;
		int num2 = 2;
		double num3 = num1 / num2;
		System.out.println("num3 : " + num3);
		
		num3 = (double)num1 / num2;
		System.out.println(num3);
		
		double num6 = (double)(num1 / num2);
		System.out.println(num6);
		
		boolean stop = true;
		Boolean startBoolean = false;
		if(stop)
			System.out.println("중지합니다");
		else
			System.out.println("시작합니다");
		}
	}


