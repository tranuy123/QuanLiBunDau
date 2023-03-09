package entity;

public class phanloai {
	private int idpl ; 
	private String namephanloai ; 
	
	public phanloai(){
		
	}
	public phanloai(int idpl,String namephanloai) {
		this.idpl=idpl;
		this.namephanloai= namephanloai;
	}
	public int getIdpl() {
		return idpl;
	}
	public void setIdpl(int idpl) {
		this.idpl = idpl;
	}
	public String getNamephanloai() {
		return namephanloai;
	}
	public void setNamephanloai(String namephanloai) {
		this.namephanloai = namephanloai;
	}
	@Override
	public String toString() {
		return "phanloai [idpl=" + idpl + ", namephanloai=" + namephanloai + "]";
	}
	

}
