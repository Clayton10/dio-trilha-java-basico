package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
  
  // ATRIBUTOS
  private LocalDate data;
  
  @Override
  public double calcularXP(){
    return XP_PADRAO + 20d;
  }

  // COSNTRUTOR VAZIO
  public Mentoria(){
  }
  
  // GET DATA
  public LocalDate getData(){
    return data;
  }
  // SET DATA
  public void setData(LocalDate data){
    this.data = data;
  }
  
  @Override
  public String toString(){
    return  "Mentoria{" +
            "titulo = '" + getTitulo()  + '\'' + 
            ", descricao = '" + getDescricao() + '\'' +
            ", data = " + data +
            '}';  
  }

}
