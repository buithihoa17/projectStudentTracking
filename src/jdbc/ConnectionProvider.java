/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;

/**
 *
 * @author PC
 */
public interface ConnectionProvider {
    Connection getConnection();
}
