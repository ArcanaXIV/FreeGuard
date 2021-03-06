package freeguard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager
{

    // JDBC driver name and database URL
    public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    public String JDBC_DB_URL;
    public String DB_ENDPOINT;

    //db412.cklzsxoqzmcc.us-east-2.rds.amazonaws.com
    //  Database credentials
    public String username;
    public String password;

    //SHIFT-F6
    private Connection connect;
    private Statement statement;

    public DatabaseManager()
    {
        connect = null;
        statement = null;

        username = "root";
        password = "toorroot";
        DB_ENDPOINT = "db412.cklzsxoqzmcc.us-east-2.rds.amazonaws.com";
        JDBC_DB_URL = "jdbc:mysql://" + DB_ENDPOINT;

        setConnection();
        setDatabase();
    }

    public DatabaseManager(String username, String password, String db_url)
    {
        connect = null;
        statement = null;

        this.username = username;
        this.password = password;
        DB_ENDPOINT = db_url;
        JDBC_DB_URL = "jdbc:mysql://" + DB_ENDPOINT;

        setConnection();
        setDatabase();
    }

    private void setConnection()
    {
        try
        {
            //STEP 2: Register JDBC driver
            Class.forName(JDBC_DRIVER);
            //STEP 3: Open a connection
            System.out.println("Connecting to a selected database...");
            connect = DriverManager.getConnection(JDBC_DB_URL, username, password);
            //print on console
            System.out.println("Connected database successfully...");
            statement = connect.createStatement();

        } catch (SQLException se)
        {
            se.printStackTrace();
        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    private void setDatabase()
    {
        runStatement("use db412");
    }

    private String splitExecute(String str)
    {
        String[] strs = str.split(";");

        for (int i = 0; i < strs.length - 1; i++)
            runQuery(strs[i]);

        return strs[strs.length - 1];
    }

    public ResultSet getQueryValue(String query)
    {
        query = splitExecute(query);
        ResultSet rs = null;
        try
        {
            rs = statement.executeQuery(query);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return rs;
    }

    public static String getString(ResultSet set)
    {
        String str = "";
        try
        {
            set.next();
            str = set.getString(1);
        } catch (Exception e)
        {
            str = "---";
        }
        return str;
    }

    public void runQuery(String query)
    {
        query = splitExecute(query);
        try
        {
            statement.executeQuery(query);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void runStatement(String statement)
    {
        try
        {
            connect.createStatement().execute(statement);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void closeConnection()
    {
        //used to close resources
        try
        {
            if (connect != null)
                connect.close(); //close connection
        } catch (SQLException se)//Handle errors
        {
            se.printStackTrace();
        }
    }

}
