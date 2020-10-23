package ar.edu.unlam.pb2;

public class Generales extends Paciente{

	public Generales(String nombre, String apellido, Integer dni) {
		super(nombre, apellido, dni);
		
	}
	@Override
	public Boolean come(Integer idPlato) {
		Boolean come= false;
	for(Plato e: listaPlatos) {
		if(e.getIdPlato().equals(idPlato)){
			come= true;
		}else {
			come= false;
		}
	}
	return come;
	
	}

	
	
}
