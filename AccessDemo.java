class MyClass {
	private int alpha;
	public int beta;
	int gamma;
	void setAlpha(int a) {
	alpha = a;
	}
}
int getalpha() {
	return.alpha;
}
}
class AccessDemo{
	public static void main(String args[]) {
	MyClass ob = new MyClass();
	ob.Setalpha(-99);
	System.out.println("ob.alpha is:" + ob.getalpha());
	ob.alpha=10;
	ob.beta=88;
	ob.gamma=98;
	}
}