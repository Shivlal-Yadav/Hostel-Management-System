// 
// Decompiled by Procyon v0.5.36
// 

package proFinal;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class RSDemo
{
    public static void main(final String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "");
            final Statement stmt = con.createStatement();
            final ResultSet rs = stmt.executeQuery("Select * from username");
            while (rs.next()) {
                System.out.println(String.valueOf(rs.getString(1)) + " " + rs.getString(2));
            }
            con.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
