package ar.edu.unlam.pb2;

public class Diabeticos extends Paciente {

	public Diabeticos(String nombre, String apellido, Integer dni) {
		super(nombre, apellido, dni);
		
	}
	
	@Override
	public Boolean come(Integer idPlato) {
	Boolean comio= false;
	String noPuedeComer="Azucar";
	for(Plato e: listaPlatos) {
		if(e.getIdPlato().equals(idPlato)){
			if(e.contieneIngrediente(noPuedeComer) == false) {
				comio= true;
				break;
			}
	
		}else {
			comio= false;
		}
		}
	return comio;
	
		}
			
	
	
	
}
