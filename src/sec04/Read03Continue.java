package sec04;

import java.io.IOException;

import com.sun.jndi.url.dns.dnsURLContext;

public class Read03Continue {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		/*int keycode;
		while(true) {
			keycode = System.in.read();
			System.out.println("KeyCode: " + keycode);
			if(keycode == 113) {
				break;
			}
		}
		*/
		int keyCode;
		char c ;
		while(true) {
			System.out.println("============================");
			System.out.println("영어 알파벳과 숫자를 입력하세요.");
			
			keyCode = System.in.read();
			c = (char)keyCode;
			System.in.read();
			System.in.read();
			
			if(c >= '0' && c <= '9') {
				System.out.printf("key- %c 매핑문자 %d 입니다. \n",c, keyCode);
			}else if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
				System.out.printf("ke- %c 매핑 문자 %d 입니다. \n",c, keyCode);
			}
			
		}
	}

}
