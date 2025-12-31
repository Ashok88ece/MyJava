package geek;

public class VariablesDemo {
	
	int instanceVar=10;//Declare inside class outside method(belongs to each object)
	
	static String staticVariable = "I am Static";
	
	public void showVariables() {
		
		//Local Variable Declared Inside method)
		
		int localVar=5;
		
		System.out.println("Local Variable value:"+instanceVar);
		System.out.println("Static variable value:"+staticVariable);
		System.out.println("Local variable value is :"+localVar);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VariablesDemo vd = new VariablesDemo();
		vd.showVariables();
		
		
		System.out.println("Access Static variable via class name:"+VariablesDemo.staticVariable);

	}

}
