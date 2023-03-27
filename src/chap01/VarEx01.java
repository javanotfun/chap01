package chap01;

public class VarEx01 {

	public static void main(String[] args) {
		int year = 0;
		int age = 14;
		int tempVar;

		System.out.println(year);
		System.out.println(age);
		year = age + 2000;
		age = age + 1;
		tempVar = age;
		System.out.println(year);
		System.out.println(age);
		System.out.println(tempVar);

	}

}
