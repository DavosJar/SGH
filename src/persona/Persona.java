package persona;

public abstract class Persona {
    String apellido;
    int edad;
    String nombre;
    String direccion;
    private String telefono;

    public Persona() {
    }



    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    @Override
    public String toString() {
        return "persona.Persona [apellido=" + apellido + ", edad=" + edad + ", nombre=" + nombre + ", direccion=" + direccion + "]";
    }
}



