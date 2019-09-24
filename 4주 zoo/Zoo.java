package kr.ac.daelim.uml.zoo;

public class Zoo {
	
	static Animal tiger;
	static Animal eagle;
	static Animal pigeon;
	static Animal turtle;

	public static void main(String[] args) {
		tiger = new Tiger();
		eagle = new Eagle();
		pigeon = new Pigeon();
		turtle = new Turtle();
		
		
		tiger.display();
		tiger.performCry();
		tiger.performFly();
		
		eagle.display();
		eagle.performCry();
		eagle.performFly();
		
		pigeon.display();
		pigeon.performCry();
		pigeon.performFly();
		
		turtle.display();
		turtle.performCry();
		turtle.performFly();
		

	}

}
