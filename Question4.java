package com.Film;

import java.sql.*;

public class Question4 {
    //static int count ;
    public static void main(String[] args) {
    try{
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/FilmDB","root","tiger");
        Statement stmt = con.createStatement();
        String q="Select * from Film order by fRate desc limit 5 ";
        ResultSet rs= stmt.executeQuery(q);
        System.out.println("Film Details whose Chances To get Selected For an OSCAR_***********");
        System.out.println("FID Fname FLang FYear FRate");
        int count=0;

        while (rs.next()){
            if (count <= 5) {
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5));
        }
            count++;
    }}
        catch (
    SQLException s){
        System.out.println(s);
    }
}
}
