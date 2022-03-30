package com.eglobal.capacitacion.mock.model;

public class Libro {
	
	private int id_libro;
	private String nombre_libro;
	private String nombre_autor;
	private int paginas;
	public Libro() {
	}
	public Libro(int id_libro, String nombre_libro, String nombre_autor, int paginas) {
		this.id_libro = id_libro;
		this.nombre_libro = nombre_libro;
		this.nombre_autor = nombre_autor;
		this.paginas = paginas;
	}
	public int getId_libro() {
		return id_libro;
	}
	public void setId_libro(int id_libro) {
		this.id_libro = id_libro;
	}
	public String getNombre_libro() {
		return nombre_libro;
	}
	public void setNombre_libro(String nombre_libro) {
		this.nombre_libro = nombre_libro;
	}
	public String getNombre_autor() {
		return nombre_autor;
	}
	public void setNombre_autor(String nombre_autor) {
		this.nombre_autor = nombre_autor;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	@Override
	public String toString() {
		return "Libro [id_libro=" + id_libro + ", nombre_libro=" + nombre_libro + ", nombre_autor=" + nombre_autor
				+ ", paginas=" + paginas + "]";
	}
	
	

}
