package AbstractConcept;

public class ChiledAirCraft extends ParentAircraft {

	public static void main(String[] args) {
		
		
		
		ChiledAirCraft a= new ChiledAirCraft();
		a.SafteyGuildlines();
		a.engineSaftey();
		a.Airtcraftcolour();
		
	}

	@Override
	public void Airtcraftcolour() {
		
		
		System.out.println("red colour");
	}

}
