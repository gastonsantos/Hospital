package ar.edu.unlam.pb2;

public class Oncologico  extends Paciente{
	@Override
	public Boolean come(Integer idPlato) {
		Boolean come = false;
		for(Plato e: listaPlatos) {
			if(e.getIdPlato().equals(idPlato)) {
				if(e.getElaboracion1().getModoElaboracion().contentEquals("Crudo")){
					come = false;
					break;
				}else {
					come = true;
				}
			}
		
		}
		return come;
		
	}
	public Oncologico(String nombre, String apellido, Integer dni) {
		super(nombre, apellido, dni);
		
	}

	
	
	
}
