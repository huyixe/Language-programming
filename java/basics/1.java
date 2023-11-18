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



