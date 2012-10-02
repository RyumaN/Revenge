
public class TaxiCorp {
	
	public TaxiDriver pickUp(){
		boolean flag = true;
		
		if (!flag){
		MasterDriver md = new MasterDriver();
		return md;
		
		}else{
			
		PonkotsuDriver pd = new PonkotsuDriver();
		return pd;
		
		}
		
		}

	public static void main(String[] args){
		
		
	}
}
