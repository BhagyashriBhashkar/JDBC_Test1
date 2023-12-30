package com.Film;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Film name");
            String fName=sc.next();
            System.out.println("Enter Film Year");
            String fYear= sc.next();
            System.out.println("Enter Film Language");
            String fLang=sc.next();
            System.out.println("Enter Film Ratings out of 5....");
            int fRate=sc.nextInt();
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/FilmDB","root","tiger");
        String q="Insert into film (fName,fYear,fLang,fRate) values( ?,?,?,?)";
            PreparedStatement pstmt=con.prepareStatement(q);
            pstmt.setString(1,fName);
            pstmt.setString(2,fYear);
            pstmt.setString(3,fLang);
            pstmt.setInt(4,fRate);
            pstmt.executeUpdate();
            System.out.println("Details inserted Succesfully!!!!");

    }
    catch (SQLException s){
        System.out.println(s);
    }

    }
}
