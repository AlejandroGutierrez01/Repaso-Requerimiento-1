import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3307/estudiantes2024a"; //el puerto 3306 ya estaba usado en mi caso
        String user = "root";
        String password = "123456";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cédula del estudiante: ");
        String cedula = scanner.nextLine();
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la nota b1 del estudiante: ");
        float b1 = scanner.nextFloat();
        System.out.print("Ingrese la nota b2 del estudiante: ");
        float b2 = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Ingrese la edad del estudiante: ");
        String edad = scanner.nextLine();
        System.out.print("Ingrese el correo del estudiante: ");
        String correo = scanner.nextLine();
        System.out.print("Ingrese la dirección del estudiante: ");
        String direccion = scanner.nextLine();
        Estudiantes Estudiantes = new Estudiantes(cedula, nombre, b1, b2, edad, correo, direccion);
        String sql = "INSERT INTO estudiantes (cedula, nombre, b1, b2, edad, correo, direccion) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try(Connection connection= DriverManager.getConnection(url,user,password)) {
            System.out.println("Conexion exitosa");

            PreparedStatement cadenaPreparada = connection.prepareStatement(sql);
            cadenaPreparada = connection.prepareStatement(sql);
            cadenaPreparada.setString(1, Estudiantes.getCedula());
            cadenaPreparada.setString(2, Estudiantes.getNombre());
            cadenaPreparada.setFloat(3, Estudiantes.getB1());
            cadenaPreparada.setFloat(4, Estudiantes.getB2());
            cadenaPreparada.setString(5, Estudiantes.getEdad());
            cadenaPreparada.setString(6, Estudiantes.getCorreo());
            cadenaPreparada.setString(7, Estudiantes.getDireccion());

            cadenaPreparada.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }
}
