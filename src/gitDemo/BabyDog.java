package gitDemo;

public class BabyDog extends Dog {
	void cry() {
		System.out.println("Baby dog Cries....");
	}
	public static void main(String[] args) {
	BabyDog bd=new BabyDog();
	bd.cry();
	bd.domesticAnimals();
	}
}
