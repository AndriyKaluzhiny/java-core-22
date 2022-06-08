package ua.lviv.lgs;

public class Application {
	public static void main(String[] args) {
		Pet cowVoice = msg -> "Я корова- Мууу-Мууу" + " " + msg;
		Pet catVoice = msg -> "Я кіт- Мяууу-Мяууу" + " " + msg;
		Pet dogVoice = msg -> "Я пес - Гаууу-Гаууу" + " " + msg; 
		
		Cat c = new Cat();
		Dog d = new Dog();
		Cow cow = new Cow();
		
		System.out.println(c.voice(catVoice, "It's cat"));
		System.out.println(d.voice(dogVoice, "It's dog"));
		System.out.println(c.voice(catVoice, "It's cat"));
	}
}
