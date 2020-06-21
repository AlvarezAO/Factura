package model;

public class ItemClase {
	
	private int idProducto;
	private String nombreProducto;
	private int cantProducto;
	private int precioProducto;
	
	
	public ItemClase(int idProducto, String nombreProducto, int cantProducto, int precioProducto) {
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.cantProducto = cantProducto;
		this.precioProducto = precioProducto;		
	}


	public int getIdProducto() {
		return idProducto;
	}


	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}


	public String getNombreProducto() {
		return nombreProducto;
	}


	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}


	public int getCantProducto() {
		return cantProducto;
	}


	public void setCantProducto(int cantProducto) {
		this.cantProducto = cantProducto;
	}


	public int getPrecioProducto() {
		return precioProducto;
	}


	public void setPrecioProducto(int precioProducto) {
		this.precioProducto = precioProducto;
	}
	
	
	

}
