
public class Equals_str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"aaa", "bbb", "ccc", "ddd", "eee"};
		boolean flag = false;
		String str = "ccc";
		
		
		
		for ( int i = 0; i < arr.length; i++)
		{
			if ( arr[i].equals(str))
			{
				System.out.println(i + "��° ��� " + arr[i]);
				flag = true;
			
			}
		}
		
		if ( flag == false)
		{
			System.out.println("�˻����� ����");
		}
			
	}

}
