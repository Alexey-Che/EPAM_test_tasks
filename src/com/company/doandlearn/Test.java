package com.company.doandlearn;

        import java.sql.*;
        import java.util.ArrayList;
        import java.util.List;

public class Test {
    public static void main(String[]args) throws SQLException, ClassNotFoundException {

        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://127.0.0.1:5432/testConnect";

        Connection cn = DriverManager.getConnection(url,
                "postgres", "postgres");
        Statement st = cn.createStatement() ;

        ResultSet rs = st.executeQuery("SELECT * FROM student");

        List<String> studentName = new ArrayList<>();
        while (rs.next()) {
            studentName.add(rs.getString("name"));
        }
        studentName.forEach(System.out::println);
        cn.close();
    }
}
