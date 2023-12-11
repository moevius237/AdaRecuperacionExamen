package Examen2.mysql;

import Examen2.model.Ejemplar;
import Examen2.model.Prestamo;
import Examen2.util.DatabaseConnection;

import java.sql.*;

public class PrestamoDB {
     private static Connection con = DatabaseConnection.getConn();

     public static int insertPrestamo (Prestamo[] listaPrestamos, Ejemplar ejemplar) throws SQLException {
          for (Prestamo prestamo:listaPrestamos) {
               String insert = "INSERT INTO prestamo(usuario ,fecha_prestamo,fecha_devolucion,ejemplar_id) VALUES(?,?,?,?)";
               try( PreparedStatement pInsert = con.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS)){
                    pInsert.setString(1, prestamo.getUsuario());
                    pInsert.setTimestamp(2, Timestamp.valueOf(prestamo.getFecha_prestamo()));
                    pInsert.setTimestamp(3,Timestamp.valueOf(prestamo.getFecha_devolucion()));
                    pInsert.setInt(4,ejemplar.getId());

                    ResultSet rs = pInsert.getResultSet();
                    int row = pInsert.executeUpdate();
                    if (row >= 0 && rs.next()){
                         return rs.getInt(1);
                    }

               }
          }

          return -1;
     }
}
