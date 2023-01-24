package dto;

public class bookDTO {
 private String name;
 private String tyosya ;
 private String syuppan;
 private int isbn;
public bookDTO(String name, String tyosya, String syuppan, int isbn) {
	super();
	this.name = name;
	this.tyosya = tyosya;
	this.syuppan = syuppan;
	this.isbn = isbn;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTyosya() {
	return tyosya;
}
public void setTyosya(String tyosya) {
	this.tyosya = tyosya;
}
public String getSyuppan() {
	return syuppan;
}
public void setSyuppan(String syuppan) {
	this.syuppan = syuppan;
}
public int getIsbn() {
	return isbn;
}
public void setIsbn(int isbn) {
	this.isbn = isbn;
}
 
 
}
