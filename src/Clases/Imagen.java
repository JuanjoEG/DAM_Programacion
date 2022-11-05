
package Clases;

import java.awt.Dimension;

/**
 *
 * @author Juan José Estévez González
 */
public class Imagen extends Archivo {
	private Integer ancho;
	private Integer alto;
	
	public Imagen(String nombre, String extension, String ruta) {
		super(nombre, extension, ruta);
		this.ancho = 1920;
		this.alto = 1080;
	}
	
	public Imagen(String nombre, String extension, String ruta, Integer ancho, Integer alto) {
                super(nombre, extension, ruta);
		this.ancho = ancho;
		this.alto = alto;
	}
	
	public Imagen(String nombre, String extension, String ruta, Dimension dimensiones) {
		this(nombre, extension, ruta, dimensiones.width, dimensiones.height);
	}

	public Integer getAncho() {
		return ancho;
	}

	public void setAncho(Integer ancho) {
		this.ancho = ancho;
	}

	public Integer getAlto() {
		return alto;
	}

	public void setAlto(Integer alto) {
		this.alto = alto;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Dimensiones: " + this.ancho + " X " + this.alto;
	}

}