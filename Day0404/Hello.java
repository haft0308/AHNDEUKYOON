
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
		
<<<<<<< HEAD
		// 재귀 메소드 = 메소드 내에서 자신을 호출하는 메소드, 
		// 반복을 구현하기 편하지만 동시에 많은 메소드가 호출되어 스택 메모리 사용량이 크게 늘고 부하를 줄 수 있음
		// 되도록이면 반복문으로 대체
=======
		// ?옱洹? 硫붿냼?뱶 = 硫붿냼?뱶 ?궡?뿉?꽌 ?옄?떊?쓣 ?샇異쒗븯?뒗 硫붿냼?뱶, 
		// 諛섎났?쓣 援ы쁽?븯湲? ?렪?븯吏?留? ?룞?떆?뿉 留롮?? 硫붿냼?뱶媛? ?샇異쒕릺?뼱 ?뒪?깮 硫붾え由? ?궗?슜?웾?씠 ?겕寃? ?뒛怨? 遺??븯瑜? 以? ?닔 ?엳?쓬
		// ?릺?룄濡앹씠硫? 諛섎났臾몄쑝濡? ???泥?
>>>>>>> 473630f60ffaedf99b4a0728beedf839156a7c81
	}
	
}
