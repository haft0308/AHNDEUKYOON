package Day0323hw;

import java.util.Scanner; // �ڹ�.��ƿ.��ĳ�� -> ���

public class P21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] intArr = new int[] { 1, 2, 3, 4, 5 };
		int i;
		
		System.out.println("�ʱ�ȭ�� �� ���");
		for (i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i]+"\t");
		}
		System.out.println();
	
		System.out.println("���� 5���� �Է��Ͻÿ�");
		for (i = 0; i < intArr.length; i++) {
			intArr[i] = sc.nextInt();
		}
		
		System.out.println("�迭�� ����� �� ���");
		for (i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i]+"\t");
		}
		
	}

}
