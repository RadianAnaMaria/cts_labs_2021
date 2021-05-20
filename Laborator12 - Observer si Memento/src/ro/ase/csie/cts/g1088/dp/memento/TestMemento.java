package ro.ase.csie.cts.g1088.dp.memento;

public class TestMemento {

	public static void main(String[] args) {
		ManagerIstoric istoric new ManagerIstoric();

		SuperErou superman=new SuperErou("Superman", 100, "Zboara");
		
		istoric.adaugaSalvare(superman.salvare());
		superman.esteLovit(10);
		
		
		System.out.println("Puncte viata:"+ superman.puncteViata);
		
	}
	

}
