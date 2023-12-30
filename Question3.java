package com.Film;

import java.sql.*;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        try{
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/FilmDB","root","tiger");
            Statement stmt = con.createStatement();
            String q="Select * from Film where fRate>3";
            ResultSet rs= stmt.executeQuery(q);
            System.out.println("Film Details whose ratings more than average............***********");
            System.out.println("FID Fname FLang FYear FRate");
            while (rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+rs.getInt(5));
            }
        }
        catch (SQLException s){
            System.out.println(s);
        }
    }
}
