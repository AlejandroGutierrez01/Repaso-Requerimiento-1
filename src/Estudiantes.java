public class Estudiantes {
    private String cedula;
    private String nombre;
    private float b1;
    private float b2;
    private String edad;
    private String correo;
    private String direccion;

    public Estudiantes(String cedula, String nombre, float b1, float b2, String edad, String correo, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.b1 = b1;
        this.b2 = b2;
        this.edad = edad;
        this.correo = correo;
        this.direccion = direccion;
    }

    // Getters y Setters
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getB1() {
        return b1;
    }

    public void setB1(float b1) {
        this.b1 = b1;
    }

    public float getB2() {
        return b2;
    }

    public void setB2(float b2) {
        this.b2 = b2;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
