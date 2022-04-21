class Product
{
	int price; // 제품가격
	int bonusPoint; // 보너스 점수
}

class TV extends Product
{
	int channel;
	int volume;
	TV()
	{
		price =100;
		bonusPoint = 100;
	}
}
class Computer extends Product
{
	int cpu;
	int ram;
	Computer()
	{
		price = 200;
		bonusPoint = 200;
	}
	
}
class Audio extends Product
{
	int volume;
	int speeker;
	Audio()
	{
		price = 50;
		bonusPoint = 50;
	}
}
class Buyer // 물건 사는 사람
{
	int money = 10000; // 소유 금액
	int bonusPoint = 0; //보너스 점수

	void buy(Product p)
	{
		money = money - p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
	}
	void print()
	{
		System.out.println("money = " + money);
		System.out.println("bonusPoint = " + bonusPoint);
	}
}

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Buyer b = new Buyer();
		
		Product[] p = new Product[3];
		p[0] = new TV();
		p[1] = new Computer();
		p[2] = new Audio();
		
		
		for ( int i = 0; i < 3; i++)
		{
			b.buy(p[i]);
		}
		
		b.print();
			
		}
}



