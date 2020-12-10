package pb;

public class p43 {
	public static void main(String[] args) {
	CarB car1 = new CarB("1號車");
	car1.start();
	
	for(int i=0;i<5;i++)
	{
		System.out.println("正在進行main()");
	}
}
}
class CarB extends Thread
{
	private String name;
	
	public CarB(String nm)
	{
		name = nm;
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("正在進行"+name+"的處理工作");
		}
	}
}