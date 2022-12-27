/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amand
 */
import java.sql.*;

class DatabaseConnection {
    private static final String DATABASE_URL = "jdbc:mysql://127.0.0.1/java";
    private static final String DATABASE_USERNAME = "root";
    private static final String DATABASE_PASSWORD = "Vep4pta8xv";
    private static final String GET_LOGIN = "SELECT * FROM employee WHERE rollno = ?";
    static String attn = null;
    static String id = null;
    static String name = null;
    static String rollno = null;
    public Connection connectDatabase() throws Exception {
     
            return  DriverManager.getConnection("jdbc:sqlserver://sumitsqlserver1.database.windows.net:1433;database=my_database;user=sqladmin@sumitsqlserver1;password=ntMs123#;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30; "); 

    }
    public boolean getLogin(String x) throws Exception {
        Connection connection = connectDatabase();
             PreparedStatement preparedStatement = connection.prepareStatement(GET_LOGIN);
            preparedStatement.setString(1, x);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                this.attn = resultSet.getString("profile_");
                this.id = resultSet.getString("Id");
                this.name = resultSet.getString("name_");
                this.rollno = x;
                return true;
            }
            else
                return false;
        }
    
}
