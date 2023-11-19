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


