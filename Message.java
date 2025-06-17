package project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Message {

    static String driver = "com.mysql.jdbc.Driver";
    static String url = "jdbc:mysql://localhost:3306/message";
    static String user = "root";
    static String password = "root";

    static String sql = "";
    static Scanner sc = new Scanner(System.in);

    void fetchFriends() throws SQLException {
        Connection con = DriverManager.getConnection(url, user, password);
        java.sql.PreparedStatement pst = con.prepareStatement("SELECT * FROM friend");
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
        }
        con.close();
    }

    void blockFriend(int id) throws SQLException {
        Connection con = DriverManager.getConnection(url, user, password);
        sql = "INSERT INTO blocked_friends (friend_id) VALUES (?)";
        java.sql.PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, id);
        int i = pst.executeUpdate();
        System.out.println("Blocked friend with ID: " + id + ", updated: " + i);
        con.close();
    }

    void addStory(String story) throws SQLException {
        Connection con = DriverManager.getConnection(url, user, password);
        sql = "INSERT INTO stories (story_content) VALUES (?)";
        java.sql.PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, story);
        int i = pst.executeUpdate();
        System.out.println("Story added, updated: " + i);
        con.close();
    }

    void addPost(String post) throws SQLException {
        Connection con = DriverManager.getConnection(url, user, password);
        sql = "INSERT INTO posts (post_content) VALUES (?)";
        java.sql.PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, post);
        int i = pst.executeUpdate();
        System.out.println("Post added, updated: " + i);
        con.close();
    }

    void sendMessage(int friendId, String message) throws SQLException {
        Connection con = DriverManager.getConnection(url, user, password);
        sql = "INSERT INTO messages (friend_id, message_content) VALUES (?, ?)";
        java.sql.PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, friendId);
        pst.setString(2, message);
        int i = pst.executeUpdate();
        System.out.println("Message sent to friend ID: " + friendId + ", updated: " + i);
        con.close();
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Enter your id::");
        int id = sc.nextInt();
        System.out.println("Enter your Name::");
        String name = sc.next();
        System.out.println("Enter your ph_number::");
        int ph = sc.nextInt();

        // Connecting the driver class
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, user, password);
        sql = "INSERT INTO friend VALUES(?,?,?)";
        java.sql.PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, id);
        pst.setString(2, name);
        pst.setInt(3, ph);
        int i = pst.executeUpdate();
        System.out.println("Friend added, updated: " + i);

        Message m = new Message();
        m.fetchFriends();

        // Example usage of new methods
        System.out.println("Enter friend ID to block:");
        int blockId = sc.nextInt();
        m.blockFriend(blockId);

        System.out.println("Enter story content:");
        String story = sc.next();
        m.addStory(story);

        System.out.println("Enter post content:");
        String post = sc.next();
        m.addPost(post);

        System.out.println("Enter friend ID to send message:");
        int friendId = sc.nextInt();
        System.out.println("Enter message content:");
        String messageContent = sc.next();
        m.sendMessage(friendId, messageContent);

        con.close();
    }
}
