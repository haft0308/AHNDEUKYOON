
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������� int total
		// ��� �޼ҵ� sum() �Լ��� int 1���� �迭�� ���ڷ� ������ 
		// �ش� �迭�� ������ ��� ���ϴ� ���� �ϸ�. ��� ���� ���� �����ش�
		// TestMain Ŭ������ ����� Test Ŭ������ sum() ȣ���Ͽ� ���� ����Ʈ
		
		Test arr=new Test();
		int[] total = {9, 34, 23, 34, 8, 1, 99, 98, 66};
		System.out.println(arr.sum(total));
		
	}

}

class Test{
	int total;
	
	int sum(int[] a) {
		int sum = 0;
		for ( int i = 0; i<a.length; i++)
		{
			sum = sum+a[i];
		}
		return sum;
		
	}
	
}