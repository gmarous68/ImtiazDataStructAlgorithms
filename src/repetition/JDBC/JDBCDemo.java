package repetition.JDBC;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/employees_database";

        try {
            // Establish connection object
            Connection conn = DriverManager.getConnection(url, "root", "mysql");

            // Create a statement object to send to database
            Statement statement = conn.createStatement();

            // Execute the statement object
            //statement.executeUpdate("insert into employees_tbl (name, dept, salary) values ('Malin', 'HR', 19500)");
            //statement.executeUpdate("DELETE from employees_tbl where id = 703 AND name = 'Malin'");
            //statement.executeUpdate("UPDATE employees_tbl set salary = 11200 where name = 'Malin'");

            //int rowsAffected = statement.executeUpdate("DELETE from employees_tbl");
            //System.out.println("Rows affected in delete: " + rowsAffected);

            ResultSet resultSet = statement.executeQuery("SELECT * from employees_tbl");

            // Process the result
            while(resultSet.next()) {
                System.out.println(resultSet.getString("name") + "\t\t| " + resultSet.getString("dept")
                        + "\t\t\t| " + resultSet.getString("salary"));
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
}