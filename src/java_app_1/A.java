package java_app_1;

public class A{
public static void main(String[] args) {
	B b1 = (int x, int y)->{
		return x + y;
	};
	int val = b1.test1(20, 35);
	System.out.println(val);
	
	B b2 = (int x, int y)->{
		return x - y;
	};
	int va = b2.test1(20, 35);
	System.out.println(va);
	
	
	B b3 = (int x, int y)->{
		return x * y;
	};
	int v = b3.test1(20, 35);
	System.out.println(v);
	
	
	B b4 = (int x, int y)->{
		return x / y;
	};
	int val1 = b4.test1(200, 4);
	System.out.println(val1);
}


}
