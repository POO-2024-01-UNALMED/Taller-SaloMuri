package comunicacion;

public class Alfabeto extends Pictograma {
	
	//atributos
	private String[] letras;
	private String interpretacion;
	
	//constructor
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	//setters y getters
	public String[] getLetras() {
		return letras;
	}
	
	public void setLetras(String[] letras) {
		this.letras = letras;
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	//metodos de la clase
	public int cantidadLetras() {
		return letras.length;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		String salida = "";
		for (int i = 0; i < letras.length; i++) {
		    salida += letras[i];
		    if (i < letras.length - 1) {
		        salida += ", ";
		    }
		}
		return salida;
	}
}