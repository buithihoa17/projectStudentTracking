/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 *
 * @author PC
 */
public class JdbcConnectionProvider implements ConnectionProvider {

    private final ConfigurationProvider configurationProvider;

    public JdbcConnectionProvider() {
        this.configurationProvider = new ConfigurationProviderImpl();
    }
    

    @Override
    public Connection getConnection() {

        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            final Properties prop = (Properties) configurationProvider.getConfiguration();
            final String username = prop.getProperty("username");
            final String password = prop.getProperty("password");
            final String url = prop.getProperty("url");
            conn = DriverManager.getConnection(url, username, password);
            conn.setAutoCommit(false);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return conn;
    }

}
