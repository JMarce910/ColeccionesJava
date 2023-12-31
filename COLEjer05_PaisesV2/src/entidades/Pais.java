
package entidades;

import java.util.Objects;


public class Pais {
    
    private String nombre;

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais() {
	}

	public Pais(String nombre) {
			this.nombre = nombre;
		}

		public String getNombre() {
			return nombre;
		}

		@Override
		public String toString() {
			return nombre;
		}


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Pais pais = (Pais) o;
		return Objects.equals(nombre, pais.nombre);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}
    
}
