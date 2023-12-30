package com.Film;

import java.sql.*;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Film name which you want to update ");
            String name=sc.next();
            System.out.println("Enter Film Year which you want to update");
            String year=sc.next();
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/FilmDB","root","tiger");
            String q="Update film set fYear='"+year+"'  where fName='"+name+"'";
            Statement stmt=con.createStatement();

            int n=stmt.executeUpdate(q);
            if(n>0){
                System.out.println("record updated suucessfully.!!!");
            }
            else{
                System.out.println("Records not updated..!!!");
            }



        }
        catch(SQLException s){
            System.out.println(s);
        }
    }
}
