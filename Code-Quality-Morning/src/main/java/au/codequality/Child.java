package au.codequality;

public class Child {

	private static String state;
	int age;
	String name;
	int id;
	String city;

	private int getnum() {
		return 0;
	}
	
	Child(){
		String s = Child.state;
	}
	
	Child object = new Child();
	int num = object.getnum();
	String str = Child.state;
	
	
	
}
