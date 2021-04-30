package overloading;

public class Overriding1 extends OverridingTest{
	public void getsalary(int salary) {
		super.getsalary(21);
	}
	public static void main(String[] args) {
		 Overriding1 obj = new  Overriding1();
		 obj.getsalary(5000);
	}

}
