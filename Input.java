
public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//환경설정완료 //코멘트3
				System.out.println("3단"); //코멘트4
				
				int i = 0;
				
				for(i=1; i<=9; i++)
				
				{
					System.out.println("3*"+i+"="+3*i);
					
				}
				
				//몇단 출력할까요?
				//사용자에게 단 수 물어보기//코멘트5
				
				
				System.out.print("\n몇 단을 출력하시겠습니까?\n");
				
				int s = 0;
				
				
				//2단 -9단 출력
				
				System.out.println("2-9단 출력");
				
				int j, k = 0;
				
				for (j=2; j<=9; j++)
					for (k=1; k<=9; k++ )
					{
						if(k!=1)
							{
								System.out.print(j+"*"+k+"="+j*k+"\t");
							}
						
						else if(k==1)
							{
								System.out.println();
								System.out.print(j+"*"+k+"="+j*k+"\t");
						
							}
						
					//풀이 : for (j=1; j<10; j++)
					//		{
					//			for ( k=2; k<10; k++)
					//			{
					//				System.out.print(k+"*"+j+"="+k*j+"\t")
					//			}
					//			System.out.println(); 을 바깥에 입력	
						
						
					}
	}

}
