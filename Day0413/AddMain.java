
public class AddMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Add a = new Add();
		System.out.println("int�� param 2���� add()ȣ�� : " + a.add(3, 5));
		System.out.println("int�� param 3���� add()ȣ�� : " + a.add(3,  5, 4));
		System.out.println("float�� add() ȣ�� : " + a.add(3.4f, 4.7f));
		System.out.println("String�� add()ȣ�� : " + a.add("aaa", "bbb"));
		
	}

}

class Add
{
	int add(int x, int y)
	{
		return x + y;
	}
	
	float add(float x, float y)
	{
		return x + y;
		
	}
	
	String add(String x, String y)
	{
		return x + y;
	}
	
	int add(int x, int y, int z)
	{
		return x + y + z;
	}
	
	
}