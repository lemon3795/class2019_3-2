package kr.ac.daelim.uml.zoo;

public class Tiger extends Animal {

	
	public Tiger(){
		
		cry = new TigerCry();
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

		System.out.println("호랭이");
	}

}
