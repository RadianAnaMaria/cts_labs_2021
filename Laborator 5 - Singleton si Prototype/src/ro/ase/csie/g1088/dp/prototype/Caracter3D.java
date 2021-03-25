package ro.ase.csie.g1088.dp.prototype;


import java.util.ArrayList;
import java.util.Random;

public class Caracter3D implements Cloneable {

	String fisierModel3D;
	String culoare;
	int inaltime;
	
	ArrayList<Integer> puncteGrafic = null;

	public Caracter3D(String fisierModel3D) {
		System.out.println("se incaca modelul 3d din" + fisierModel3D);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		this.fisierModel3D = fisierModel3D;
		
		//se obt un vector de pct cu valori random
		Random random = new Random();
		puncteGrafic = new ArrayList<>();
		for( int i= 0; i< 1; i++) {
			puncteGrafic.add(random.nextInt(1000));
		}
		
		}
	private Caracter3D() {
		
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("puncte caracter 3D: ");
		for(int punct : this.puncteGrafic) {
			sb.append(punct + " | ");
		}
		return sb.toString();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//Caracter3D copie=new Caracter3D(this.fisierModel3D);
		Caracter3D copie=new Caracter3D();
		copie.culoare=this.culoare;
		copie.fisierModel3D=this.fisierModel3D;
		copie.inaltime=this.inaltime;
		copie.puncteGrafic=(ArrayList<Integer>) this.puncteGrafic.clone();
		return copie;
		
		
	}
	
	}