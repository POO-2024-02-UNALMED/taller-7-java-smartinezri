package comunicacion;

public class Libro extends Escrito{

	private String co_autor;
	private String editorial;
	private String edicion;
	private String interpretacion;
	
	public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editorial, String edicion, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.co_autor = co_autor;
		this.editorial = editorial;
		this.edicion = edicion;
		this.interpretacion = interpretacion;
	}
	
	public int palabrasTotales(int palabras) {
		return palabras * getPaginas() * 2;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	@Override
	public String toString() {
		return getOrigen() + "\n" + getTitulo() + "\n" + getAutor() + "\n" + getPaginas() + "\n"
				+ getCo_autor() + "\n" + getEditorial() + "\n" + getEdicion();
	}
	
	public void setCo_autor(String co) {
		this.co_autor = co;
	}
	
	public String getCo_autor() {
		return co_autor;
	}
	
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	public String getEditorial() {
		return editorial;
	}
	
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	
	public String getEdicion() {
		return edicion;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
}
