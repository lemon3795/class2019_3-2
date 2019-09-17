package kr.ac.daelim.uml.zoo;

public abstract class Animal {

	IFly fly;
	ICry cry;
	
	public Animal()
	{
		
	}

	
    public abstract void display();
    
    public void move()
    {
    	 System.out.println("움직임");
    }
    
    public void performCry()
    {
    	cry.cry();
    }
    
    public void performFly()
    {
    	fly.fly();
    }
    
    
}
