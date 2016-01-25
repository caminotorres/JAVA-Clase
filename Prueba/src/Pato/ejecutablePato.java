package Pato;

import java.lang.reflect.AnnotatedArrayType;
import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class ejecutablePato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pato patito=new Pato(0);
		
		patito.andarHaciaAdelante(7);
		
		patito.andarHaciaAtras(14);
		
		System.out.println(patito.dimePosicion());
		
	}

}
