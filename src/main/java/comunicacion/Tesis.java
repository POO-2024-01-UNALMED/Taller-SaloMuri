package comunicacion;

public class Tesis extends Escrito{
	
	//atributos
	private String idea;
	private String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	//constructor
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		this.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}
	
	//setters y getters
	public String getIdea() {
		return idea;
	}
	
	public void setIdea(String idea) {
		this.idea = idea;
	}
	
	public String[] getArgumentos() {
		return argumentos;
	}
	
	public void setArgumentos(String[] argumentos) {
		this.argumentos = argumentos;
	}
	
	public String getConclusion() {
		return conclusion;
	}
	
	public void setConlusion(String conclusion) {
		this.conclusion = conclusion;
	}
	
	public String getReferencias() {
		return referencias;
	}
	
	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	//metodos de la clase
	public int palabrasTotales(int r) {
		int total = this.getPaginas()*r*5;
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
	               idea + "\n" +
	               argumentos.length + "\n" +
	               conclusion + "\n" +
	               referencias;
		return valor;
	}
}
