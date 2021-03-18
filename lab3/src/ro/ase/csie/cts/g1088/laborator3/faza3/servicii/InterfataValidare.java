package ro.ase.csie.cts.g1088.laborator3.faza3.servicii;

public interface InterfataValidare {
	
	public void valodarePret(float pretInitial) throws ExceptiePretInvalid;
	public void validareVechimeClient(int vechimeClientInAni) throws ExceptieVechimeClient;

}
