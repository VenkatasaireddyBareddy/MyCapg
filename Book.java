package com.cg;

public class Book {
	private int bno;
	private String title;
	private String author;
	private int price;
	
	public Book(int bno,String title, String author, int price) {
		
		this.bno = bno;
		this.title =title;
		this.author =author;
		this.price = price;
	}
	public void displayDetails() {
		System.out.println("\n Book No:" +bno);
		System.out.println("\n Titke:" +title);
		System.out.println("\n Author:" +author);
		System.out.println("\n Price:" +price);
		
	}
	
	public int getBno() {
		return bno;
	}
	
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title =title;
		
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
		
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void discountedPrice (int discount) {
		System.out.println("\n After Discount:" +((100-discount)*price)/100);
	
	}
	

}
