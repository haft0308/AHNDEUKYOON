
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = compute(4);
		System.out.println(result);
		
	}

	static int compute(int x)
	{
		int ret = 0;
		
		if ( x == 1)
		{
			ret = 1;
			
		}
		else
		{
			ret = x * (compute(x-1)); // !
		}
		return ret;
		
		// ��� �޼ҵ� = �޼ҵ� ������ �ڽ��� ȣ���ϴ� �޼ҵ�, 
		// �ݺ��� �������� �������� ���ÿ� ���� �޼ҵ尡 ȣ��Ǿ� ���� �޸� ��뷮�� ũ�� �ð� ���ϸ� �� �� ����
		// �ǵ����̸� �ݺ������� ��ü
	}
	
}