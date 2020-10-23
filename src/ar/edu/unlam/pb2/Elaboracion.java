package ar.edu.unlam.pb2;

public class Elaboracion {
private String  modoElaboracion;



public Elaboracion() {
	
	 modoElaboracion = null;
}



public String getModoElaboracion() {
	return modoElaboracion;
}



public void setModoElaboracion(String modoElaboracion) {
	this.modoElaboracion = modoElaboracion;
}


public Boolean olla() {
	modoElaboracion = "Olla";
	return true;
}

public Boolean Horno() {
	modoElaboracion ="Horno";
	return true;
}
public Boolean frito() {
	modoElaboracion = "Frito";
	return true;
}

public Boolean crudo() {
	modoElaboracion = "Crudo";
	return true;
}





}
