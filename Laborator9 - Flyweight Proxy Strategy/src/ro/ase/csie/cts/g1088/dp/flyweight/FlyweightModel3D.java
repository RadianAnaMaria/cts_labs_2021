package ro.ase.csie.cts.g1088.dp.flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyweightModel3D implements InterfataFlyweightModel3D{
	
	public String numeModel;
	List<Integer> puncteModel = new ArrayList<>();
	
	

	public FlyweightModel3D(String numeModel) {
		super();
		this.numeModel = numeModel;
	}



	@Override
	public void afisareEcran(DateEcran date) {
		System.out.println(String.format("Afisare % la coordonatele, numeModel cu datele %d %d %d cu %s", date.x, date.y, date.z, date.textura));
		
	}

}
