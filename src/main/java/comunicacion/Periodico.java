package comunicacion;

public class Periodico extends Escrito{
	
	//atributos
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	//constructor
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
	}
	
	//getters y setters
	public String getFecha() {
		return fecha;
	}
	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public String getPrimicia() {
		return primicia;
	}
	
	public void setPrimicia(String primicia) {
		this.primicia = primicia;
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	//metodos de la clase
	public int palabrasTotales(int r) {
		int total = this.getPaginas()*r*10;
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
	               fecha + "\n" +
	               primicia + "\n";
		return valor;
	}
}
