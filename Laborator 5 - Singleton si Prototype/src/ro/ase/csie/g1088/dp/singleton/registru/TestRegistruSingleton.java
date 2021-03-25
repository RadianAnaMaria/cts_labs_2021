package ro.ase.csie.g1088.dp.singleton.registru;

public final class TestRegistruSingleton {

	public static void main(String[] args) {
		ConexiuneBD conexiune1=ConexiuneBD.getConexiune("10.0.0.1", "cts");
		ConexiuneBD conexiune2=ConexiuneBD.getConexiune("10.0.0.1", "cts");
		if(conexiune1==conexiune2) {
			System.out.println("Cele 2 referinte sunt identice");
		}
		else
		{
			System.out.println("Cele 2 referinte sunt diferite");

		}


	}

}
