
package Clases;

/**
 *
 * @author Juan José Estévez González
 */
public class Archivo {
	private String nombre;
	private String extension;
	private String ruta;
	
	public Archivo() {
		this.nombre = "archivo";
		this.extension = "txt";
		this.ruta = "";
	}

	public Archivo(String nombre) {
		this();
		this.nombre = nombre;
	}

	public Archivo(String nombre, String extension) {
		this(nombre);
		this.extension = extension;
	}

	public Archivo(String nombre, String extension, String ruta) {
		this(nombre, extension);
		this.ruta = ruta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	
	@Override
	public String toString() {
		return this.getRuta() + this.getNombre() + "." + this.getExtension();
	}
	
}