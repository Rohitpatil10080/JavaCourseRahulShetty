package Interfaceexample;

public class AustrelianTraffic implements CentralTraffic,TrainSymbol {

	public static void main(String[] args) {
		
		
		
		CentralTraffic a=new AustrelianTraffic();
		a.GreenGo();
		a.RedStop();
		a.Yelowwait();
		
		
		AustrelianTraffic ac =new AustrelianTraffic();
		
		ac.walking();
		
		TrainSymbol Train =new AustrelianTraffic();
		Train.TrainGo();
		Train.TrainRun();
		Train.TrainStop();

	}

	public void walking()
	{
		System.out.println("walking");
	}
	
	@Override
	public void GreenGo() {
		// TODO Auto-generated method stub
		
		System.out.println("Green implementation");
		
	}

	@Override
	public void RedStop() {
		// TODO Auto-generated method stub
		
		
		System.out.println("Red implementation");
	}

	@Override
	public void Yelowwait() {
		// TODO Auto-generated method stub
		
		System.out.println("Yellow implementation");
		
	}

	@Override
	public void TrainGo() {
		// TODO Auto-generated method stub
		
		System.out.println("TrainGo implementation");
	}

	@Override
	public void TrainRun() {
		// TODO Auto-generated method stub
		
		System.out.println("TrainRun implementation");
		
	}

	@Override
	public void TrainStop() {
		// TODO Auto-generated method stub
		
		System.out.println("TrainStop implementation");
		
	}

}
