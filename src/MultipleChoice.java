import java.util.List;

public class MultipleChoice implements Pregunta {
	String respuestaCorrecta;
	List<String> respuestasPosibles;
	String respuestaElegida;
	
	public boolean respondioBien() {
		return respuestaCorrecta == respuestaElegida;
	}
	
	public void responder(String respuestaElegida) {
		if(respuestasPosibles.contains(respuestaElegida)) {
		this.respuestaElegida = respuestaElegida;
		}
		else {
			new Error("La respuesta elegida no se encuentra dentro de las respuestas posibles");
		}
	}
	
	public int getPuntaje() {
		return puntaje;
	}
}
