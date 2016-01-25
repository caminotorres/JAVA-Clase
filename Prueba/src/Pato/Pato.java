package Pato;

public class Pato {

	private int posicion;

	/**
	 * Constructor clase pato
	 * @param posici�n en la que est�
	 */
	public Pato(int pos){
		
		this.posicion=pos;
	}

	/**
	 * M�todo que nos pregunta el n�mero de pasos
	 * @param pasos
	 * @return devuelve los pasos que el pato ha dado hacia adelante
	 */
	public int andarHaciaAdelante (int pasos){
		
		return this.posicion+=pasos;
	}
	
	/**
	 * M�todo que nos pregunta el n�mero de pasos
	 * @param pasos
	 * @return devuelve los pasos que el pato ha dado hacia atr�s
	 */
	
	public int andarHaciaAtras (int pasos){
		
		return this.posicion-=pasos;
	}
	
	/**
	 * M�todo que nos dice la posici�n en la que se encuentra el pato
	 * @return nos devuelve la posici�n
	 */
	public int dimePosicion (){
		
	 return this.posicion;
	}
}
