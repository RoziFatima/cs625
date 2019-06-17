class Test{
	int a , b ;
	Test(int i,int j) {
		a = i;
		b = j ;
	}
	void change(Test ob) {
		ob.a = ob.a + ob.b ;
		ob.b = -ob.b;
	}
}
class PassByRef{
	public static void main(String args[]){
		Test ob = new Test();
		System.out.println("ob.a and ob.b before call : " + ob.a + " " + ob.b);
		ob.change(ob);
		System.out.println("ob.a and ob.b after call : " + ob.a + " " + ob.b);
	}
}