import java.util.Scanner;

public class gugusc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.print("����Ͻ� ���� �Է��ϼ���");
		Scanner sc=new Scanner(System.in);
			
		int i = 0, j = 1;
		int ans = 0;
		
		i = sc.nextInt();
		
		
		if ( i < 2 || i > 9 )
		{ 
			System.out.println("�Է��� �߸��Ǿ����ϴ�.");
			
		}
		else
		
			while( i < 10 && j < 10 )
			{	
				ans = i * j;
				System.out.println(i + " * " + j + " = " + ans);
				j++;
			}
		
					
	}

}