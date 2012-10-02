
public class MasterDriver extends TaxiDriver{
	
	
	
	@Override
	public void checkAround() {
		
		
		
		System.out.println("バックミラーok");
		System.out.println("シートベルトok");
		System.out.println("前方ok");
		System.out.println("後方ok");
		
	}
	
	

	@Override
	public void kickAccel() {
		
		
		
		System.out.println("慎重にしよう");
	}
	
	public void ride(Person p){
		System.out.println(p.getName() + "さんが乗車しました。");
	}
	
	



	public static void main(String[] args){
		
		
	}
	
	

}
