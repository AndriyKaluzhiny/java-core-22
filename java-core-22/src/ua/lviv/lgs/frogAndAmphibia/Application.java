package ua.lviv.lgs.frogAndAmphibia;

public class Application {
	public static void main(String[] args) {
		Amphibia swim = msg -> "Amphibia is swimming";
		Amphibia eat = msg -> "Amphibia is eating";
		Amphibia sleep = msg -> "Amphibia is sleeping";
		Amphibia walk = msg -> "Amphibia is walking";
		
		Frog f = new Frog();
		System.out.println(f.doSomething(walk, ""));
		System.out.println(f.doSomething(swim, ""));
		System.out.println(f.doSomething(sleep, ""));
		System.out.println(f.doSomething(eat, ""));
	}
}