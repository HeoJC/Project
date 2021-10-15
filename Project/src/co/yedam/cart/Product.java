package co.yedam.cart;

public class Product {
	private String id ;
	private String brand ;
	private String name ;
	private int originprice ;
	private int offprice ;
	private int likeit ;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOriginPrice() {
		return originprice;
	}
	public void setOriginPrice(int originprice) {
		this.originprice = originprice;
	}
	public int getOffPrice() {
		return offprice;
	}
	public void setOffPrice(int offprice) {
		this.offprice = offprice;
	}
	public int getLikeIt() {
		return likeit;
	}
	public void setLikeIt(int likeit) {
		this.likeit = likeit;
	}
}
