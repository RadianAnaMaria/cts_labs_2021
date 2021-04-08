package ro.ase.csie.cts.g1088.dp.factory.method;

public class TestFactory {

	public static void main(String[] args) {
		
		boolean isModJoc4Kids=true;
		
		if(isModJoc4Kids) {
			
		}
		else {

	}
		FactoryAbstractCaracter factoryCaracter=null;
		factoryCaracter=(isModJoc4Kids)? new FactoryMod4Kids(): new FactoryModNormal();
		
		CaracterJoc superman=factoryCaracter.getCaracter(TipCaracter.MARVEL, "Superman");
				

}

}