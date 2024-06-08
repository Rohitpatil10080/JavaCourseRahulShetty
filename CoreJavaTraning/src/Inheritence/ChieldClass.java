package Inheritence;

public class ChieldClass extends ParentClass {
	
	
	public void engine()
	{
       System.out.println("new engine");
	}
	
	public void colour()
	{
		System.out.println(colour);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChieldClass ch=new ChieldClass();
		ch.colour();
		
		ch.breaks();
		ch.AudioSystem();
		ch.Gear();
		

	}

}
