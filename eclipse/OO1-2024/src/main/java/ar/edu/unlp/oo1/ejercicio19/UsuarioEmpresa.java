package ar.edu.unlp.oo1.ejercicio19;

public class UsuarioEmpresa extends Usuario {
  private String cuit;

  public UsuarioEmpresa(String nombre, String domicilio, String cuit) {
    super(nombre, domicilio);
    this.cuit = cuit;
  }
}
