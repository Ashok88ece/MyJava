package InheritanceDemo;

public class ChildClass extends BaseClass{

	public static void main(String[] args) {

		ChildClass obj = new ChildClass();
		//BaseClass obj = new ChildClass();
		//BaseClass obj = new BaseClass();
		//ChildClass obj = new BaseClass(); Not Possible Need to do typecasting
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();

	}
	
	public void mul() {
		
		System.out.println("I am in Child class and mul is 3000");
	}
 
	public void div() {
		
		System.out.println("I am in child class and div is 20");
	}
}
