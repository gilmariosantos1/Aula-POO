package aula03;

public class Principal {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Animal meuPorco = new Pig();
		Animal meuCachorro = new Dog();
		
//		invocando os métodos
		animal.animalSound();
		meuPorco.animalSound();
		meuCachorro.animalSound();
		
	}

}
