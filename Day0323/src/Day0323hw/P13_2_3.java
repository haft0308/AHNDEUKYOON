package Day0323hw;

public class P13_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = new int[] {15, 8, 26};
		//���� ū ���� ����Ͻÿ�.
		int max = num[0];
		int min = num[0];
		
		for (int i=0; i<3; i++)
		{
			if( num[i] > max)
			{
				max = num[i];
			}
			
			if( num[i] < min)
			{
				min = num[i];
				
			}
			else
			{
			}
		
		}
		System.out.println("max = "+max+ "\nmin = "+ min);
		
		
		
		
		
	
		
	}

}
