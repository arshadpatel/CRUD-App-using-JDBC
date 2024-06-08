package myPackage;

public class Query {
	
//	these are static because we are returning them in getters which are static methods
	private static String insert = "insert into students(id, name, email) values(?, ?, ?)";
	private static String select = "select * from students";
	private static String update = "update students set name = ?, email = ? where id = ?";
	private static String delete = "delete from students where id = ?";
	
//	these are static because these are called using class name as Query.getInsert() which is possible only if method is static
	public static String getInsert() {
		return insert;
	}

	public static String getSelect() {
		return select;
	}

	public static String getUpdate() {
		return update;
	}

	public static String getDelete() {
		return delete;
	}
	
}
