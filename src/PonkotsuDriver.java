
public class PonkotsuDriver extends TaxiDriver{

	@Override
	public void checkAround() {
		
		super.checkAround();
		System.out.println("前方ok,発進だ");
		System.out.println("おっと,シートベルト忘れてた");
	}

	@Override
	public void kickAccel() {
		
		super.kickAccel();
		System.out.println("いけいけどんどん");
	}
	
	public void ride(Person p){
		System.out.println(p.getName() + "さんが乗車しました。");
	}
	
	
	

}
