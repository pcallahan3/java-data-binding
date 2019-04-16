package javabinding;

public class BindingDriver {

	
	public static void main(String[] args) {
		
		//Binding super class reference 
		SuperBind newSuper = new SuperBind();
		newSuper.print();
		
		//Binding sub class reference 
		SuperBind newSub = new SubBind();
		newSub.print();

	}

}
