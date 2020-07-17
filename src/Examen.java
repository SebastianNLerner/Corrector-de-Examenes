import java.util.List;

public class Examen {
	List<Pregunta> preguntas;
	int notaMinimaAprobacion;
	
	int puntajeRespuesto() {
		int acum = 0;
		
		for (Pregunta p: preguntas) {
			if(p.respondioBien()) {
			acum += p.getPuntaje();
			}
		}
		
		return acum;
	}
	
	int puntajeTotal() {
		int acum = 0;
		
		for (Pregunta p: preguntas) {
			acum += p.getPuntaje();
		}
		
		return acum;
	}
	
	int notaFinal() {
		return this.puntajeRespuesto()*10/this.puntajeTotal();
	}
	
	boolean aprobo() {
		return this.notaFinal()>notaMinimaAprobacion;
	}
}
