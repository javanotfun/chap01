package sec04;

import java.io.IOException;

public class Read02Char {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int i = System.in.read();
		char c = (char)i;
		//숫자가 아니라 a 이렇게 바로 문자로 비굑됨
		if(c >= 'a' && c<= 'z' ) {
				System.out.println(i);
				System.out.println("입력된 문자는 영어 소문자입니다.");
		}
		if(c >= 'A' && c<= 'Z') {
			System.out.println(i);
			System.out.println("입력된 문자는 영어 대문자입니다");
		}
		if(c >= 'A' && c<= '9') {
			System.out.println(i);
			System.out.println("입력된 문자는 영어 숫자입니다");
		}
	}
}
	
