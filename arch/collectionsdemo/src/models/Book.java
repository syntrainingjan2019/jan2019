package models;

public class Book {
String name;
int price;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public Book(String name, int price) {
	super();
	this.name = name;
	this.price = price;
}
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Book [name=" + name + ", price=" + price + "]";
}

}
