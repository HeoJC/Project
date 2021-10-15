package co.yedam.cart;

public class Cart {
	private String id ; 
	private String name ; 
	private int count ;
	private int price ;
	private int deliveryfee ;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDeliveryFee() {
		return deliveryfee;
	}
	public void setDeliveryFee(int deliveryfee) {
		this.deliveryfee = deliveryfee;
	}
}
