
public class PonkotsuDriver extends TaxiDriver{

	@Override
	public void checkAround() {
		
		super.checkAround();
		System.out.println("�O��ok,���i��");
		System.out.println("������,�V�[�g�x���g�Y��Ă�");
	}

	@Override
	public void kickAccel() {
		
		super.kickAccel();
		System.out.println("���������ǂ�ǂ�");
	}
	
	public void ride(Person p){
		System.out.println(p.getName() + "���񂪏�Ԃ��܂����B");
	}
	
	
	

}
