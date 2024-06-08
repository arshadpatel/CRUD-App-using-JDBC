package myPackage;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("\t1.Create 2.Read 3.Update 4.Delete");
			int opt = sc.nextInt();
			switch(opt) {
				case 1 : 
					System.out.println("Enter id name email : ");
					int id = sc.nextInt();
					String name = sc.next();
					String email = sc.next();
					Table t = new Table(id, name, email);
					Operations.create(t);
					break;
				
				case 2 :
					ArrayList<Table> res = Operations.read();
					for(Table i : res) {
						System.out.println(i);
					}
					break;
				
				case 3 : 
					System.out.print("Enter id to update :");
					id = sc.nextInt();
					System.out.println("Update name email : ");
					name = sc.next();
					email = sc.next();
					t = new Table(id, name, email);
					Operations.update(t);
					break;
				
				case 4 : 
					System.out.print("Enter id to delete : ");
					id = sc.nextInt();
					Operations.delete(id);
					System.out.println("id : "+ id + " deleted successfully");
					break;
					
				default:
					System.out.println("Enter the right option");		
			}
		}
	}
}
