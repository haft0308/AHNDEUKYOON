
public class UpCastingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("UpCastingParent�� ��ü");
		UpCastingParent up = new UpCastingParent();
		System.out.println("up.add()="+up.add() + "\n");
		
		System.out.println("UpCastingChild�� ��ü");
		UpCastingChild uc = new UpCastingChild();
		System.out.println("uc.add()=" + uc.add());
		System.out.println("uc.add()=" + uc.sub() + "\n");
		
		System.out.println("UpCasting�� ��ü");
		//Ÿ���� �θ� Ŭ����, ������ ȣ���� �ڽ�Ŭ���� ȣ��
		UpCastingParent upc = new UpCastingChild();
		System.out.println("upc.add()=" +upc.add() + "\n");
		
		UpCastingChild uc2 = (UpCastingChild)upc; // �ٿ� ĳ����
		System.out.println("up2.sub()=" +(uc2.sub()) + "\n"); //���� ��� ����
		
//		upc.sub();
	}

}

