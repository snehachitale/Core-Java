package com.collection;

public class Product implements Comparable<Product>{

	private int id;
	private String name;
	private double price;
	
	
	public Product() {

	}
	public Product(int id, String name, double price) {
		
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [id=").append(id).append(", name=")
				.append(name).append(", price=").append(price).append("]");
		return builder.toString();
	}
	
	@Override
	public int compareTo(Product p) {
		int ret = this.id - p.id;
		if(ret==0) {
			ret = this.name.compareTo(p.name);
			
			if(ret==0) {
				ret = Double.compare(this.price, p.price);
			}
		}
		return ret;
	}
}
