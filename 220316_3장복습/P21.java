import java.util.Scanner;

public class P21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("문자 1개를 입력하세요");
		
	
		
		//int inputData=sc.nextInt(); // 65, 97 'a' //97
		//sc.next(); //"Ko"//0,
		
		String str = sc.next(); // "ao"
		char ch = str.charAt(0); // 'a' //97
		
		System.out.println((char)(ch-32)); // 97-32=65 <--A
	
		
		
		
	}

}
