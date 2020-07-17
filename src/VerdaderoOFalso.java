
public class VerdaderoOFalso implements Pregunta {
	boolean respuestaElegida;
	boolean respuestaCorrecta;
	
	public boolean respondioBien() {
		return respuestaCorrecta==respuestaElegida;
	}
	
	public void responder(boolean respuestaElegida) {
		this.respuestaElegida = respuestaElegida;
	}
	
	public int getPuntaje() {
		return puntaje;
	}
	
	public VerdaderoOFalso(int puntaje, String preguntaRealizada, boolean respuestaCorrecta) {
		this.puntaje = puntaje;
		this.preguntaFormulada = preguntaRealizada;
		this.respuestaCorrecta = respuestaCorrecta;
		
	}
}
