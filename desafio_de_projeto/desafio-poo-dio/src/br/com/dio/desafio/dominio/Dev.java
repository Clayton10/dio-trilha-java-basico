package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

  // ATRIBUTOS  
  private String nome;
  // grupo que contem conteudos de Inscritos
  private Set<Conteudo> conteudosInscritos  = new LinkedHashSet<>();   
  // grupo de conteudos concluidos
  private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    
  // METODO INSCREVER BOOTCAMP
  public void inscreverBootcamp(Bootcamp bootcamp){
    // add set de conteudos inscritos
    this.conteudosInscritos.addAll(bootcamp.getConteudos());
    // adicionando os Devs inscritos no Bootcamp
    bootcamp.getDevsInscritos().add(this);
  }

  // METODO PROGREDIR (colocar conteudo do boot. e inserir no cont. insc.)
  public void progredir(){
    // pegando os conteudos em ordem de add na plataforma (cursos e mentorias)
    Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
    if(conteudo.isPresent()){
      this.conteudosConcluidos.add(conteudo.get());
      this.conteudosInscritos.remove(conteudo.get());
    }else{
      System.err.println("Você não está matriculado em nenhum conteúdo");
    }
  }

  // METODO CALCULAR TOTAL XP
  public double calcularTotalXp(){
    //this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXP().sum());
    return this.conteudosConcluidos
      .stream()
      .mapToDouble(Conteudo::calcularXP)
      .sum();
  }
  
  // METODO GET NOME
  public String getNome() {
    return nome;
  }
  // METODO SET NOME
  public void setNome(String nome) {
    this.nome = nome;
  }

  // METODO GET CONTEUDO INSCRITOS
  public Set<Conteudo> getConteudosInscritos() {
      return conteudosInscritos;
  }
  // METODO SET CONTEUDO INSCRITOS
  public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
      this.conteudosInscritos = conteudosInscritos;
  }

  // METODO GET CONTEUDOS CONCLUIDOS
  public Set<Conteudo> getConteudosConcluidos() {
      return conteudosConcluidos;
  }
  // METODO SET CONTEUDOS CONCLUIDOS
  public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
      this.conteudosConcluidos = conteudosConcluidos;
  }

  @Override
  public boolean equals(Object o){
    if(this == o) return true;
    if(o == null || getClass() != o.getClass()) return false;
    Dev dev = (Dev) o;
    return ((Objects.equals(nome, dev.nome)) && (Objects.equals(conteudosInscritos, dev.conteudosInscritos)) && (Objects.equals(conteudosConcluidos, dev.conteudosConcluidos)));
  }

  @Override
  public int hashCode(){
    return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
  }
   
}