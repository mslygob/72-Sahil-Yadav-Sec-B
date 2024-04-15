package lab2;

class Person	{
	String name;
	int age;
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void printInfo() {
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
	}
}
public class Demo{
	public static void main(String[] args) {
		Person person1 =new Person("sahil",20);
		Person person2 =new Person("lucky",21);
		
		System.out.println("Person 1:");
		person1.printInfo();
		System.out.println();
		System.out.println("Person 1:");
		person2.printInfo();
		
	}
}