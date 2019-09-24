package kr.ac.daelim.uml.zoo;

public class Turtle extends Animal{

	
	public Turtle() {
		cry = new TurtleCry();
		fly = new FlyNoWay();
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
        System.out.println("거북");
		
	}

}
