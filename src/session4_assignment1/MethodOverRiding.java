package session4_assignment1;

/*
* Here, it tests the MethodOverRiding concept.
*/

public class MethodOverRiding {
	
	   public static void main (String args []) {
	    	
	        // BaseClass reference and object
	        BaseClass obj1 = new BaseClass(); 
	        
	        // BaseClass reference but DerivedClass object
	        BaseClass obj2 = new DerivedClass(); 
	        
	        // Calls the method from BaseClass class
	        obj1.methodToOverride(); 
	        
	        //Calls the method from DerivedClass class
	        obj2.methodToOverride(); 
	        
	     }	

}

