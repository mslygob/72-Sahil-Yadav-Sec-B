package lab2;

class Dog {
	private String name;
	private String breed;
	
	public Dog(String name,String breed) {
		this.name = name;
		this.breed = breed;
	}
	public void setname(String name) {
		this.name = name;
	}
	public void setbreed(String breed) {
		this.breed =breed;
	}
	public String getName() {
		return name;
	}
	public String getBreed() {
		return breed;
	}
}
public class Demo2{
	public static void main(String[] args) {
		Dog dog1 = new Dog("jack","Labrador");
		Dog dog2 = new Dog("Max","Bulldog");
		System.out.println("originalValues:");
		printDogInfo(dog1);
		printDogInfo(dog2);
		dog1.setname("charlie");
		dog2.setbreed("poodle");
		System.out.println("\n upadted values");
		printDogInfo(dog1);
		printDogInfo(dog1);
	}
	public static void printDogInfo(Dog dog) {
		System.out.println("Name:" + dog.getName());
		System.out.println("Breed:" + dog.getBreed());
		System.out.println();
	}
}
