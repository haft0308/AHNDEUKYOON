
public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();
		a.hello();
		
		B b = new B();
		b.hello();
		
		b.bye("�Ƿ��� ");
	}

}

class A
{
	void hello()
	{
		System.out.println("A say hello");
	}

	void bye(String name)
	{
		System.out.println(name+"byebye �߰�");
	}

}
class B extends A
{
	void hello()
	{
		System.out.println("B say hello");
		System.out.println("hahahaha");
	}
	
	void bye(String name)
	{
		System.out.println(name+"byebye �߰�");
	}
		
}