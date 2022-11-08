import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class StudentDAO {
	Connection con; 
    Statement stmt;

	public StudentDAO() throws Exception{
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
    	
  		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
	
			System.out.println("Connection Successful");
		
			 List<Student> searchEmployee(String lastName) throws Exception {
				List<Student> list = new ArrayList<>();

				PreparedStatement myStmt = null;
				ResultSet myRs = null;

				try {
					id += "%";
					myStmt = myConn.prepareStatement("select * from employees where last_name like ?");
					
					myStmt.setString(1, lastName);
					
					myRs = myStmt.executeQuery();
					
					while (myRs.next()) {
						Employee tempEmployee = convertRowToEmployee(myRs);
						list.add(tempEmployee);
					}
					
					return list;
				}
				finally {
					close(myStmt, myRs);
				}
			}

	}
	
	public static void main(String[] args) throws Exception {
			
			StudentDAO dao = new StudentDAO();
			System.out.println(dao.searchStudent("001029903"));
	
		}
}
