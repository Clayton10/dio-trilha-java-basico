package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
  
  // ATRIBUTOS
  private int cargaHoraria;
  
  // CONSTRUTOR VAZIO
  public Curso(){
  }
  
  @Override
  public double calcularXP() {
    // XP PADRAO
    return XP_PADRAO * cargaHoraria;
  }

  // METODO GET DE CARGA HORARIA
  public int getCargaHoraria() {
    return cargaHoraria;
  }
  // METODO SET DE CARGA HORARIA  
  public void setCargaHoraria(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }

  @Override
  public String toString(){
    return  "Curso{" +
            "titulo = '" + getTitulo()  + '\'' + 
            ", descrição = '" + getDescricao() + '\'' +
            ", cargaHorária = " + cargaHoraria +
            '}';  
  }

}