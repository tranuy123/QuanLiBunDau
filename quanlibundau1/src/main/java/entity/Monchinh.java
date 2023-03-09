package entity;

public class Monchinh {
	private int id;
	private String name ; 
	private String image;
	private double price ;
	private String mieuta;
	private int idpl;
	
	
	public Monchinh() {
		
	}
	public Monchinh(int id,String name,String image,double price,String mieuta,int idpl) {
		this.id=id;
		this.name=name;
		this.image=image;
		this.price=price;
		this.mieuta=mieuta;
		this.idpl=idpl;
	
	}
	public int getIdpl() {
		return idpl;
	}
	public void setIdpl(int idpl) {
		this.idpl = idpl;
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
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getMieuta() {
		return mieuta;
	}
	public void setMieuta(String mieuta) {
		this.mieuta = mieuta;
	}
	@Override
	public String toString() {
		return "Monchinh [id=" + id + ", name=" + name + ", image=" + image + ", price=" + price + ", mieuta=" + mieuta
				+ ", idpl=" + idpl + "]";
	}

	

}
