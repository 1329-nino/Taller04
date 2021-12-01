package modelo;

import java.util.ArrayList;

public enum TipoDesastre {

    VIVA(200);
    DESAPARECIDA(5);
    MUERTA(3)

    private String nombre;
    private String pais;
    private String ciudad;
    private String año;
    private ArrayList<Persona> persona;

    public TipoDesastre(String nombre, String pais, String ciudad, String año, ArrayList<Persona> Personas){
        this.nombre = nombre;
        this.pais = pais;
        this.ciudad = ciudad;
        this.año = año;
        this.persona = persona;
    }

    public TipoDesastre(ArrayList<Persona> persona){
        this.persona = persona;
    }

    public String getPais(){
        return pais;
    }

    public void setPais(String pais){
        this.pais = pais;
    }

    public String getCiudad(){
        return ciudad;
    }

    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }

    public String getAño(){
        return año;
    }

    public void setAño(String año){
        this.año = año;
    }

    public ArrayList<Persona> getPersona(){
        return persona;
    }

    public void setPersona(ArrayList<Persona> personas){
        this.persona = personas;
    }

    public void actualizarPersonas(ArrayList<Persona> personas, Persona persona){
        personas.add(persona);
    }

    public void detalleDesastre(){

    }
}