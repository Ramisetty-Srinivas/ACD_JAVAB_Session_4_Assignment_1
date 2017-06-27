package session4_assignment1; //package declaration

/*
 * 1. To call an overloaded method in Java, it is must to use the type and/or number of arguments
 * 	  to determine which version of the overloaded method to actually call.
 * 2. Overloaded methods may have different return types; the return type alone 
 *    is insufficient to distinguish two versions of a method.
 * 3. When Java encounters a call to an overloaded method, it simply executes  
 *    the version of the method whose parameters match the arguments used in the call.
 * 4. It allows the user to achieve compile time polymorphism.
 * 5. An overloaded method can throw different exceptions.
 * 6. It can have different access modifiers.       
 */

public class MethodOverloading {

	public static void main(String[] args) {
		
		Overload Obj = new Overload();
        double result;
        Obj .demo(10);
        Obj .demo(10, 20);
        result = Obj .demo(5.5);
        System.out.println("Output : " + result);
	}

}
