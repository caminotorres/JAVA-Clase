package Pato;

public class Pato {

	private int posicion;

	/**
	 * Constructor clase pato
	 * @param posición en la que está
	 */
	public Pato(int pos){
		
		this.posicion=pos;
	}

	/**
	 * Método que nos pregunta el número de pasos
	 * @param pasos
	 * @return devuelve los pasos que el pato ha dado hacia adelante
	 */
	public int andarHaciaAdelante (int pasos){
		
		return this.posicion+=pasos;
	}
	
	/**
	 * Método que nos pregunta el número de pasos
	 * @param pasos
	 * @return devuelve los pasos que el pato ha dado hacia atrás
	 */
	
	public int andarHaciaAtras (int pasos){
		
		return this.posicion-=pasos;
	}
	
	/**
	 * Método que nos dice la posición en la que se encuentra el pato
	 * @return nos devuelve la posición
	 */
	public int dimePosicion (){
		
	 return this.posicion;
	}
}
