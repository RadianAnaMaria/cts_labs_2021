package ro.ase.csie.cts.g1088.laborator3.faza3;

import ro.ase.csie.cts.g1088.laborator3.exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.g1088.laborator3.exceptii.ExceptieVechimeClient;

public class Produs {
	
	InterfataMarketing serviciuMk=null;
	InterfataValidare serviciuValidare=null;
	public static final int VECHIME_CLIENT_MAXIMA = 10;
	public static final float DISCOUNT_CLIENT_MAXIM = 0.15f;
	
	public static void validarePret(float pretInitial) throws ExceptiePretInvalid {
		if(pretInitial <= 0) {
			throw new ExceptiePretInvalid();
		}
	}
	
	public static void validareVechimeClient(int vechimeClientInAni) throws ExceptieVechimeClient {
		if(vechimeClientInAni < 0) {
			throw new ExceptieVechimeClient();
		}
	}
	
	public static float getDiscountFidelitate(int vechimeClientInAni) {
		return (vechimeClientInAni > VECHIME_CLIENT_MAXIMA) ? DISCOUNT_CLIENT_MAXIM : (float)vechimeClientInAni/100; 
	}
	
	public static float getPretCuDiscount(float pretInitial, float discount) {
		return pretInitial - (discount * pretInitial);
	}
	
	public float getPretFinal(TipProdus tipProdus, float pretInitial, int vechimeClientInAni) throws ExceptiePretInvalid, ExceptieVechimeClient
	  {
		validarePret(pretInitial);
		validareVechimeClient(vechimeClientInAni);
		
		  float discountFidelitate =(tipProdus == TipProdus.NOU) ? 0: getDiscountFidelitate(vechimeClientInAni);
		   
		    
		    
		    float discount=tipProdus.getDiscount();
		    float  valoareDiscountTipProdus =getPretCuDiscount(pretInitial, discount);
		    float  pretFinal= valoareDiscountTipProdus * (1- discountFidelitate);
		    
	   
	    
	    return pretFinal;
	  }
}