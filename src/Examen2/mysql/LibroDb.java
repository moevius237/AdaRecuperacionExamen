package Examen2.mysql;

import Examen2.model.Ejemplar;
import Examen2.util.DatabaseConnection;

import java.sql.*;

public class LibroDb {
    private static Connection con = DatabaseConnection.getConn();

    public static boolean existe(int id){
        String select = "SELECT COUNT(*) FROM libro WHERE id =?";
        try (PreparedStatement pSelect = con.prepareStatement(select)){
            pSelect.setInt(1,id);
            ResultSet rs = pSelect.executeQuery();
            if (rs.next()){
                int count = rs.getInt(1);
                return count >0;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
    public static int insertEjemplar(Ejemplar ejemplar, int id) throws SQLException {
        String insert = "INSERT INTO ejemplar (estado , libro_id) VALUES(?,?)";
        try (PreparedStatement pInsert = con.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS)){
            pInsert.setString(1, ejemplar.getEstado());
            pInsert.setInt(2,id);

            int row = pInsert.executeUpdate();
            ResultSet rs = pInsert.getGeneratedKeys();
            if (row >= 0 && rs.next()){
                return rs.getInt(1);
            }
        }
        return -1;
    }
    public static void printFavoriteBOok(){
        String selecrt = "SELECT titulo from";
    }

}
