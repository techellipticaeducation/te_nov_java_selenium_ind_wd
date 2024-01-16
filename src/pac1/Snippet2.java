package pac1;

public class Snippet2 {
	int i = 10;

	public Snippet2(int i) {
		this.i = i;
		System.out.println("Constructor");
	}

	{
		System.out.println("instance block 1 "+i);
	}

	{
		System.out.println("instance block 2 " +i);
	}

	public static void main(String[] args) {
		Snippet2 snip2 = new Snippet2(50);
		System.out.println(snip2.add(snip2.add(10, 20), snip2.add(40, 60)));
	}

	public int add(int i , int j){
		return i+j;
	}

	public void Snippet2(){
		
	}
	public void Snippet3(){
		Snippet2();
	}
	{
		System.out.println("instance block 3 " + i);
	}
}
