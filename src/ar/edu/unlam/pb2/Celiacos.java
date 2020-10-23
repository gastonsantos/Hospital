package ar.edu.unlam.pb2;

public class Celiacos extends Paciente{

	public Celiacos(String nombre, String apellido, Integer dni) {
		super(nombre, apellido, dni);
		
	}
	
	@Override
	public Boolean come(Integer idPlato) {
		Boolean come= false;
		String noPuedeComer = "Trigo";
		String noPuedeComer1 = "Avena";
		String noPuedeComer2 = "Cebada";
		String niPuedeComer3 = "Centeno";
		
		for(Plato e: listaPlatos) {
			if(e.getIdPlato().equals(idPlato)) {
				if(e.contieneIngrediente(noPuedeComer)|| e.contieneIngrediente(noPuedeComer2)||e.contieneIngrediente(noPuedeComer1)||e.contieneIngrediente(niPuedeComer3) ) {
					come = false;
					
				}else {
					come = true;
					break;
				}
			}else {
				come = false;
			}
			
		}
		return come;
		
	}
	
	

}
