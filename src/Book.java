import java.sql.*;
import java.util.Scanner;

public class Book {
    public static void main(String args[])
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","");

        }
        catch (Exception e){
            System.out.println(e);
        }
        int choice;
        String bookname,author,category,eastablishdate;
        int bookchargeperday;
        Scanner s= new Scanner(System.in);
        while(true){
            System.out.println("1.select any option");
            System.out.println("1.insert");
            System.out.println("2.select");
            System.out.println("3.search");
            System.out.println("4.update");
            System.out.println("5.delete");
            System.out.println("6.exit");
            System.out.println("enter the choice");
            choice = s.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("insertdata");
                    System.out.println("enter book name");
                    bookname=s.next();
                    System.out.println("enter author name");
                    author=s.next();
                    System.out.println("enter category");
                    category=s.next();
                    System.out.println("enter book charge per day");
                    bookchargeperday=s.nextInt();
                    System.out.println("enter etablish date");
                    eastablishdate=s.next();

                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","");
                        String sql="INSERT INTO `book`(`bookname`, `author`, `category`, `bookchargeperday`, `eastablishdate`) VALUES (?,?,?,?,?)";
                        PreparedStatement stmt = con.prepareStatement(sql);
                        stmt.setString(2,bookname);
                        stmt.setString(3,author);
                        stmt.setString(4,category );
                        stmt.setInt(5,bookchargeperday);
                        stmt.setString(6,eastablishdate);


                    }
                    catch (Exception e){
                        System.out.println(e);
                    }

                case 2:
                    System.out.println("select data");
                case 3:
                    System.out.println("search data");

                case 4:
                    System.out.println("update data");

                case 5:
                    System.out.println("delete data");

                case 6:
                    System.out.println("exit");
                    System.exit(0);
                    break;
            }
        }
    }
}



