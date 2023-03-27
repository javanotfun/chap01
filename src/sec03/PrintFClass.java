package sec03;

public class PrintFClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("이름%s", "홍길동");
		System.out.printf("나이%d 세", 28);
		
		System.out.println("");
		System.out.printf("이름: %1$s, 나이: %2$d 세, 결혼유무: %3$s ", "홍길동", 28, "미혼");
		
		System.out.println("");
		System.out.printf("%d", 123456);
		
		System.out.println("");
		System.out.printf("6d : %6d", 12);
		
		System.out.println("");
		System.out.printf("#%d" , 1234567890);
		System.out.println("");
		System.out.printf("10.2f" , 1234.56);
		
		System.out.println("");
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름의 %d인 원의 넓이 : %10.2f", 10, area);
	}

}
