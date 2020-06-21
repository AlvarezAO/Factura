package model;


public class FacturaClase {
	
	private int idFactura;
	private String nombre;
	private String giro;
	private String rut;
	private String fecha;
	
	public FacturaClase(int idFactura, String nombre, String giro, String rut, String fecha) {
		this.idFactura = idFactura;
		this.nombre = nombre;
		this.giro = giro;
		this.rut = rut;
		this.fecha = fecha;		
	}

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGiro() {
		return giro;
	}

	public void setGiro(String giro) {
		this.giro = giro;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
	
	
	

}
