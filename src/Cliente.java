public class Cliente {

    private String nombre;
    private int pasword;
    private int id;
    private String tipoPersona;

    public Cliente() {
        

    }

    public Cliente(String nombre, int pasword, int id, String tipoPersona) {
        this.nombre = nombre;
        this.pasword = pasword;
        this.id = id;
        this.tipoPersona = tipoPersona;

    }



    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        if(nombre=="Carlos"){
            System.out.println("Usuario Correcto");
        }else {
            System.out.println("Usuario Incorrecto");
        }

        this.nombre = nombre;
    }

    public int getPasword() {
        return pasword;
    }

    public void setPasword(int pasword) {
        if (pasword == 123){
            System.out.println("contraseña correcta");
        } else {
            System.out.println("ingresa es incorrecta");
        }

        this.pasword = pasword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }
}
