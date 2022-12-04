package br.com.dio.desafio.dominio;

// classe criada, pois Curso e Mentoria tem atributos comuns
public abstract class Conteudo {

  // XP PADRAO
  protected static final double XP_PADRAO = 10d;
  
  // ATRIBUTOS - modifier Type name
  private String titulo;
  private String descricao;

  // METODOS
  // classes filhas (classes que extenderao de conteudo) serao obrigadas a implementar uma logico no metodo
  public abstract double calcularXP();  

  // METODO GET DE TITULO
  public String getTitulo() {return titulo;}
  // METODO SET DE TITULO
  public void setTitulo(String titulo) {this.titulo = titulo;}

  // METODO GET DE DESCRICAO
  public String getDescricao() {return descricao;}
  // METODO SET DE DESCRICAO  
  public void setDescricao(String descricao) {this.descricao = descricao;}
  
}