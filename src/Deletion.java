import java.sql.*;

public class Deletion {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db2","root","");
        Statement stmt=con.createStatement();
        String sql="delete from table2 where age=3";
        PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql);
        ps.executeUpdate();
        con.close();
    }
}
