package StringPra;

class Chetan<T, P>{
	T t;
	P p;
	Chetan(){}
	Chetan(T k, P p){
		this.t = k;
		this.p = p;
	}
	void print() {
		System.out.println(t+"  "+p);
	}
	
}
public class Genericclass {

	public static void main(String[] args) {
		Chetan c = new Chetan("deepika", 1090);
		Chetan c1 = new Chetan(16879, 8179.78f);
		c.print();
		c1.print();
		c.print();
		
	//("yahs");
		c.print();
		
	}
}
