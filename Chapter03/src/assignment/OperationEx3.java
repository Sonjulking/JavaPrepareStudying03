package assignment;

public class OperationEx3 {

	public static void main(String[] args) {

		int num1 = 10;
		int i = 2;
		
		boolean value = (((num1 = num1 + 10)>10) || ((i = i + 2) > 10)); //단락 회로 평가 때문에 뒤에가 실행이 안됐음.
 		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
	}

}
