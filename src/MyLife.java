
public class MyLife {

	
	public static void main(String[] args) {
		
		Person person = new Person("oresama");
		TaxiCorp tc = new TaxiCorp();
		TaxiDriver td = tc.pickUp();
		for(int i = 0; i < 2; i = i + 1){
		td.go();
		}
		
		
	}
	
	

}
