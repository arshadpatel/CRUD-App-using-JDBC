package myPackage;

public class Table {
	
	int id;
	String name;
	String email;
	
	Table(int id, String name, String email){
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public String toString() {
		return "id : " + id + ", name : " + name + ", email : " + email;
	}
	
}
