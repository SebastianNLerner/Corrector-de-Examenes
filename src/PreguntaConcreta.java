
public class PreguntaConcreta implements Pregunta {
	String respuestaCorrecta;
	String respuestaElegida;
	
	public boolean respondioBien() {
		return respuestaCorrecta == respuestaElegida;
	}
	
	public int getPuntaje() {
		return puntaje;
	}
}
