import java.sql.*;
import java.util.Scanner;

public class Insert {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db2","root","");
        Statement smtl=con.createStatement();
        //Statement s=con.createStatement();
        ResultSet rs=smtl.executeQuery("select * from table2");
       /* String sqlquery="insert into table2 values(?,?,?,?)";
        PreparedStatement ps=(PreparedStatement) con.prepareStatement(sqlquery);
        while(true){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter student name");
            String name=sc.next();
            System.out.println("enter student age");
            int age= Integer.parseInt(sc.next());
            System.out.println("enter student marks");
            int marks= Integer.parseInt(sc.next());
            System.out.println("enter roll");
            int roll= Integer.parseInt(sc.next());
            ps.setString(1,name);
            ps.setInt(2,age);
            ps.setInt(3,marks);
            ps.setInt(4,roll);
            ps.executeUpdate();
            System.out.println("do you want to continue");
            String choice=sc.next();
            if(choice.equalsIgnoreCase("no"))
            {
                break;
            }
        }*/ while(rs.next())
        {
            System.out.println(rs.getString("name")+" "+rs.getInt("age")+rs.getInt("roll")+" "+rs.getString("marks"));
        }
        con.close();
    }
}

