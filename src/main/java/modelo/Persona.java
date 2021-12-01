package modelo;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	private String rut;
	private EstadoPersona estado;
	private String pais;
	private String sexo;
	private TipoDesastre tipoDesastre;

	public Persona (String nombre, String apellido, int edad, String rut, String pais, String sexo, EstadoPersona estado){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.rut = rut;
		this.pais = pais;
		this.sexo = sexo;
		this.estado = estado;
		this.tipoDesastre = tipoDesastre;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getApellido(){
		return apellido;
	}

	public void setApellido(String apellido){
		this.apellido = apellido;
	}

	public int getEdad(){
		return edad;
	}

	public void setEdad(int edad){
		this.edad = edad;
	}

	public String getRut(){
		return rut;
	}

	public void setRut(String rut){
		this.rut = rut;
	}

	public String getPais(){
		return pais;
	}

	public void setPais(String pais){
		this.pais = pais;
	}

	public String getSexo(){
		return sexo;
	}

	public void setSexo(String sexo){
		this.sexo = sexo;
	}

	public EstadoPersona getEstado(){
		return estado;
	}

	public void setEstado(EstadoPersona estado){
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Desaparecido{" +
				"nombre = " + nombre + '\'' +
				", apellido = " + apellido + '\'' +
				", edad = " + edad + '\'' +
				", rut =" + rut +'\'' +
				", pais = " + pais +'\'' +
				", sexo = " + sexo +'\'' +
				", estado = " + estado +'\'' +
				" } ";
	}

	public String[] arreglo() {
		String nombre = this.nombre;
		String apellido = this.apellido;
		int edad = this.edad;
		String rut = this.rut;
		String pais = this.pais;
		String sexo = this.sexo;
		EstadoPersona estado = this.estado;
		String nombreDesastre = this.tipoDesastre.getNombre();
		return new String[]{nombre,apellido,edad,rut,pais,sexo,estado,tipoDesastre};
	}

	}
}