package javacollection;
@FunctionalInterface
interface MySam{
	void show();
	String toString();
}
	class A extends Object implements MySam{
		@Override public void show() {
			System.out.println("Hi All");}
		}
	

public class Main {
	public static void main(String args[])
	{
		/*
		MySam m=new A();*/
		MySam m = () -> System.out.println("Hello All");
		m.show();
	}
}


