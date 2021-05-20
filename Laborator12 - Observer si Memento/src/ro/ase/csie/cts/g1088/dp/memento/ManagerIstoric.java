package ro.ase.csie.cts.g1088.dp.memento;

import java.util.ArrayList;
import java.util.List;

public class ManagerIstoric {
	List<MementoSuperErou> salvari = new ArrayList<>();
	
	public void adaugaSalvare(MementoSuperErou memento) {
		this.salvari.add(memento);
	}
}
