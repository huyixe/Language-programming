public class HelloWorld{
    public static void main(string[] args) {
    	System.out.println("Hello World");
    }
}

class FreshJuice{
	enum FreshJuiceSize{ SMALL,MEDIUM,LARGE}
	FreshJuiceSize size;
}

public class HelloWorld{
	public static void main(String[] args) {
		FreshJuice juice=new FreshJuice();
		juice.size=FreshJuice.FreshJuiceSize.MEDIUM;
	}
}

public class Dog{
	String breed;
	int size;
	String colour;
	int age;
	
	void eat() {
	}
	
	void run() {
	}
	
	void sleep() {
	}
	
	void name() {
	}
}

public class Puppy{
	int puppyAge;
	public Puppy(String name) {
		System.out.println("dog name:"+name);
	}
	
	public void setAge(int age) {
		puppyAge=age;
	}
	
	public int getAge() {
		System.out.println("dog age:"+puppyAge);
		return puppyAge;
	}
	
	public static void main(String[] args) {
		Puppy static void main(String[] args) {
			Puppy myPuppy=new Puppy("tommy");
		}
		myPuppy.setAge(2);
		myPuppy.getAge();
		System.out.println("blz:"+myPuppy.puppyAge);
	}
}



import java.io.*;

public class Employee {
    String name;
    int age;
    String designation;
    double salary;
    //Employee class constructor
    public Employee(String name) {
    	this.name=name;
    }
    //set age
    public void empAge(int empAge) {
    	age=empAge;
    }
    /*set designation*/
    public void empDesignation(String empDesig) {
    	designation=empDesig;
    }
    /*set salary*/
    public void empSalary(double empSalary) {
    	salary=empSalary;
    }
    /*type information*/
    public void printEmployee() {
    	System.out.println("name:"+name);
    	System.out.println("age:"+age);
    	System.out.println("designation"+designation);
    	System.out.println("salary:"+salary);
    }
}


import java.io.*;

public class EmployeeTest {
    
	public static void main(String[] args) {
		Employee empOne=new Employee("RUNOOB1");
		Employee empTwo=new Employee("RUNOOB2");
		
		//Call the member methods of both objects
		empOne.empAge(26);
		empOne.empDesignation("hige");
		empOne.empSalary(1000);
		empOne.printEmployee();
		
		empTwo.empAge(21);
		empTwo.empDesignation("low");
		empTwo.empSalary(500);
		empTwo.printEmployee();
	}
	
}


package 基础语法;

public class PrimitiveTypeTest {
	public static void main(String[] args) {
		//b t y e
		System.out.println("basic class:byte ob:"+Byte.SIZE);
		System.out.println("pakage:java.lang.Byte");
		System.out.println("min:Byte.MIN_VALUE="+Byte.MIN_VALUE);
		System.out.println("max:Byte.MAX_VALUE="+Byte.MAX_VALUE);
		System.out.println();
		
		//short
		System.out.println("basic:short ob:"+Short.SIZE);
		System.out.println("palage:java.lang.Short");
		System.out.println("min:Short.MIN_VALUE="+Short.MIN_VALUE);
		System.out.println("max:Short.MAX_VALUE="+Short.MAX_VALUE);
		System.out.println();
		
		//i n t
		System.out.println("basic:int ob:"+Short.SIZE);
		System.out.println("pakage:java.lang.Integer");
		System.out.println("min:Integer.MIN_VALUE="+Short.MIN_VALUE);
		System.out.println("max:Integer.MAX_VALUE="+Short.MAX_VALUE);
		System.out.println("");
		
		//long
		System.out.println("basic:long ob:"+Long.SIZE);
		System.out.println("pakage:java.lang.Long");
		System.out.println("min:Long.MIN_VALUE="+Long.MIN_VALUE);
		System.out.println("max:Long.MAX_VALUE="+Long.MAX_VALUE);
		System.out.println("");
		
		//float
		System.out.println("basic:char ob:"+Double.SIZE);
		System.out.println("pakage:java.lang.Character");
		System.out.println("min:Double.MIN_VALUE="+Double.MIN_VALUE);
		System.out.println("max:Double.MAX_VALUE="+Double.MAX_VALUE);
		System.out.println();
		
		//double
		System.out.println("basic:char ob:"+Character.SIZE);
		System.out.println("pakage:java.lang.Caracter");
		// Output character.min VALUE to the console as a number instead of a Character
		System.out.println("min:Character.MIN_VALUE="+(int)Character.MIN_VALUE);
		System.out.println("max:Character.MAX_VALUE="+(int)Character.MAX_VALUE);
	}
}

public class PrimitiveTypeTest {
	static boolean bool;
	static byte by;
	static char ch;
	static double d;
	static float f;
	static int i;
	static long l;
	static short sh;
	static String str;
	
	public static void main(String[] args) {
		System.out.println("Bool:"+bool);
		System.out.println("Byte:"+by);
		System.out.println("Characteer:"+ch);
		System.out.println("Double:"+d);
		System.out.println("Float:"+f);
		System.out.println("Integer:"+i);
		System.out.println("Long:"+l);
		System.out.println("Short:"+sh);
		System.out.println("String:"+str);
	}
}

public class PrimitiveTypeTest {
    public static void main(String[] args) {
    	char c1='a';
    	int i1=c1;
    	System.out.println("char->int"+i1);
    	char c2='A';
    	int i2=c2+1;
    	System.out.println("char+int"+i2);
    }
}

public class PrimitiveTypeTest {
    public static void main(String[] args) {
    	int i1=123;
    	byte b=(byte)i1;
    	System.out.println("char->int"+b);
    	
    }
}