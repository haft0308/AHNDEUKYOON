package Day0323hw;

public class P13_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// P13
		
		int[] num2 = new int[10];
		int j2 = 1;
		for ( int i = 0; i<10; i++)
		{
			num2[i] = j2;// num2[0]=1//num[1]=10
			j2=j2*10;
					
			int sum = 0;
			sum = sum + num2[i];
					
		}
				
			if ( num2[0] > num2[1])
			{
				System.out.println(0);
			}
				
			else if ( num2[0] == num2[1])
			{
				System.out.println("���� ���");
			}
					
			else 
			{
				System.out.println(1);	
			}
				
			//1, 10, 100, 1000, 10000
			int idx = 0; 
			//int max=num2[0]; // 3�� �̻��� ���� ���ϱ� ���� ���ο� ������ ����
			// �迭�� ù��°���� max�� �Ҵ�
			
			int max = -1; // �ƽ��� ���� ������ ���� ���ϸ� ������Ʈ�ϱ� ���� ���� ���� �ʱⰪ���� �Է�
			for ( int i = 0; i<10; i++ ) // i=1
			{
				if ( num2[i] > max) // num2[1] > max
				{
					max = num2[i]; // 1 > -1 �����ϸ� max = 1 -> max = 10 ... -> ...
					idx = i; // max�� �����ϸ� ÷�ڸ� ����ص���
				}
				
				else
				{
					//max�� ���� �ִ��� �¾Ƽ� max�� ���� �������� ����
					// -1 > -2
					
				}
				
				
			}
			
		
		
	}

}
