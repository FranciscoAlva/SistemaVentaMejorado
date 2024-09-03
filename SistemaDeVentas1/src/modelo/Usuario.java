package modelo;

/**
 *
 * @author maygr
 */
public class Usuario {
    
    //ATRIBUTOS
    private int idUsuario;
    private String dni;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String email;
    private String direccion;
    private String password;
    private String usuario;
    private String rol;
    private int estado;
    
    //CONSTRUCTOR
    public Usuario (){
        this.idUsuario = 0;
        this.dni = "";
        this.nombre = "";
        this.apellidos = "";
        this.telefono = "";
        this.email = "";
        this.direccion = "";
        this.password = "";
        this.usuario = "";
        this.rol="";
        this.estado = 0;        
    }
    
    //SETTER AND GETTER

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getEstado() {
        return estado;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    

    public void setEstado(int estado) {
        this.estado = estado;
    }    

}
