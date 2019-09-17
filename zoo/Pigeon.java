package kr.ac.daelim.uml.zoo;

public class Pigeon extends Animal{
	
	public Pigeon(){
		cry = new BirdCry();
		fly = (IFly) new FlyWithWings();
	}
	
	@Override
	public void performCry() {
		cry.cry();
	}
	
	@Override
	public void performFly() {
		fly.fly();
	}

	@Override
	public void display() {
		System.out.println("피존투");
		
	}

}
