package io.altar.jseproject.pratica1.models;

import java.util.ArrayList; // just import a library 
import java.util.List;

public class Product {

	private long id;
	private List<Long> shelvesIds = new ArrayList<Long>(); // because my object product need a list of shelves that they can be add
	private int discount;
	private int iva;
	private float pvp;
	
	
	public Product() {} // constructor - TEM O MESMO NOME DA CLASSE  - i need to check if i need??
	
	//Product farinha = new Product(); meu produto é agora farinha (OBJETO), isso é como eu declaro um produto
	
	public Product(int discount, int iva, float pvp) 
	//overload constructor - means that between () i have the information of my new object
	{ 
		this.discount = discount;
		this.iva = iva;
		this.pvp = pvp;
	}
 // Product acai = new Product(20, 0, 5, 6, 12.1);
	//id=20 shelves=0 discount= 5 iva =6 pvp=12.1
			
	public Product(long id, List<Long> shelvesIds, int discount, int iva, float pvp) {
		this.id = id;
		this.shelvesIds = shelvesIds;
		this.discount = discount;
		this.iva = iva;
		this.pvp = pvp;
	}
	
	public long getId() {  //é um metodo que acessa a ID do objeto da minha classe Product
		return id;
	}
	public void setId(long id) { //
		this.id = id;
		//acai.setId(30) - setId - muda para um novo valor a id do meu produto
	}
	public List<Long> getShelvesIds() {
		return shelvesIds;
	}
	public void setShelvesIds(List<Long> shelvesIds) {
		this.shelvesIds = shelvesIds;
	}
	public void addShelfId(long shelfId) {
		this.shelvesIds.add(shelfId);
	}
	public void removeShelfId(long shelfId) {
		this.shelvesIds.remove(shelfId);
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getIva() {
		return iva;
	}
	public void setIva(int iva) {
		this.iva = iva;
	}
	public float getPvp() {
		return pvp;
	}
	public void setPvp(float pvp) {
		this.pvp = pvp;
	}

	@Override  // -  notacao - means que esse metodo é acessado na classe de onde essa classe é extendida. Sobre escreve o metodo 
	//da classe da qual foi estendia, caso decida mudar o metodo o compilador me devolve um erro. 
	public String toString() {
		return "Product [id=" + id + ", shelvesIds=" + shelvesIds + ", discount=" + discount + ", iva=" + iva + ", pvp="
				+ pvp + "]";
	}
	
	
	
}
