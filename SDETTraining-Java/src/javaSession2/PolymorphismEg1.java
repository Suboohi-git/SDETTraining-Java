package javaSession2;

public class PolymorphismEg1 extends Human {
	
	 //Overriding method
    public void eat() {
        System.out.println("Boy is eating");
    }
    
    public static void main( String args[]) {
    	PolymorphismEg1 obj = new PolymorphismEg1();
        
        //This will call the child class version of eat()
        obj.eat();
    }

}

class Human {
    //Overridden method
    public void eat() {
        System.out.println("Human is eating");
    }
}