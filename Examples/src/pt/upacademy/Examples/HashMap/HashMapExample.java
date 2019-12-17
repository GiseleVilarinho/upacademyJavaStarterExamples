package pt.upacademy.Examples.HashMap;

import java.util.Collection;
import java.util.HashMap;
<<<<<<< HEAD
import java.util.Iterator;
=======
>>>>>>> jscortes
import java.util.Map;

public class HashMapExample {
	
	Map<Long,Product> myMap = new HashMap<Long, Product>();
	
	
	public static void main(String[] args) {
		HashMapExample myapp = new HashMapExample();
		Product p1 = new Product("Coca Cola");
<<<<<<< HEAD
//		System.out.println(p1);
		myapp.addProduct(p1);
		Product p2 = new Product("Batatas");
//		System.out.println(p2);
		myapp.addProduct(p2);
		
//		System.out.println(myapp.getAll());
//		myapp.removeProduct(p1);
//		System.out.println(myapp.getAllIds());
		myapp.printAll();
=======
		System.out.println(p1);
		myapp.addProduct(p1);
		Product p2 = new Product("Batatas");
		System.out.println(p2);
		myapp.addProduct(p2);
		
		System.out.println(myapp.getAll());
>>>>>>> jscortes
	}
	
	public void addProduct(Product p) {
		myMap.put(p.getId(), p);
	}
	
<<<<<<< HEAD
	public void removeProduct(Product p) {
		myMap.remove(p.getId(), p);
	}
	
=======
>>>>>>> jscortes
	public boolean isEmpty() {
		return (myMap.size() == 0) ? true: false;
	}
	
	public Collection<Product> getAll() {
		return myMap.values();
	}
<<<<<<< HEAD
	
	public Collection<Long> getAllIds() {
		return myMap.keySet();
	}
	
	public void printAll() {
		Iterator<Product> prodInterator = getAll().iterator();
		while (prodInterator.hasNext()) {
			Product product = (Product) prodInterator.next();
			System.out.println(product);
		}
	}
=======
>>>>>>> jscortes
}

class Product {
	static long count = 1;
	private long id;
	private String name;
	
	public Product(String name) {
		this.name = name;
		this.id = count++;
	}
	
	public long getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}

	
	
}
