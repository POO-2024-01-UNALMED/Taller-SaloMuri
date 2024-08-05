package comunicacion;

public class Fabula extends Escrito{
	
	//atributos
	private String ensenanza;
	private String interpretacion;
	
	//constructor
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}
	
	//setter y getter
	public String getEnsenanza() {
		return ensenanza;
	}
	
	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	//metodos de la clase
	public int palabrasTotales(int r) {
		int total = this.getPaginas()*r*1;
		return total;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		String valor = this.getOrigen() + "\n" +
	               this.getTitulo() + "\n" +
	               this.getAutor() + "\n" +
	               this.getPaginas() + "\n" +
	               ensenanza;
		return valor;
	}
}
