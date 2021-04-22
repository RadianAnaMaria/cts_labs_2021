package ro.ase.csie.cts.g1088.dp.proxy;

public class TestProxy {

	public static void main(String[] args) {
		
		InterfataLogin login = new ModulLogin("10.0.0.1");
		if(login.login("admin","root1234"))
			System.out.println("Hello admin");
		
		
		
		String[] parole = new String[] {"1234", "root", "admin"};
		for(String parola:parole) {
			if(login.login("admin", parola))
				System.out.println("Am gasit parola:" + parola);

	}

}}
