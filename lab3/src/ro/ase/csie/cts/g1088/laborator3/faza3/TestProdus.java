package ro.ase.csie.cts.g1088.laborator3.faza3;

import ro.ase.csie.cts.g1088.laborator3.exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.g1088.laborator3.exceptii.ExceptieVechimeClient;

public class TestProdus {

	public static void main(String[] args) {
		Produs produs = new Produs(new StrategieMarketing2021(), new ServiciuValidari());
		try {
			float pretFinal= produs.getPretFinal(TipProdus.DISCOUNT,100,12);
		System.out.print("Pret final este" + pretFinal);
		
		} catch (ExceptiePretInvalid e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExceptieVechimeClient e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}