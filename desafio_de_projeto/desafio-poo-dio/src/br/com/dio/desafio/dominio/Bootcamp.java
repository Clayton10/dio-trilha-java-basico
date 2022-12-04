package br.com.dio.desafio.dominio;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Objects;

public class Bootcamp {

  /******************************* ATRIBUTOS ******************************/
  private String nome;
  private String descricao;
  private final LocalDate dataInicial = LocalDate.now();
  private final LocalDate dataFinal   = dataInicial.plusDays(45);
  private Set<Dev> devsInscritos      = new HashSet<>();
  private Set<Conteudo> conteudos     = new LinkedHashSet<>();
  /************************************************************************/

  /******************************* METODOS ********************************/

  // METODO GET NOME  
  public String getNome() {
    return nome;
  }
  // METODO SET NOME
  public void setNome(String nome) {
    this.nome = nome;
  }

  // METODO GET DESCRICAO
  public String getDescricao() {
    return descricao;
  }
  // METODO SET DESCRICAO
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  // METODO GET DEVS INSCRITOS
  public Set<Dev> getDevsInscritos() {
    return devsInscritos;
  }
  // METODO SET DEVS INSCRITOS
  public void setDevsInscritos(Set<Dev> devsInscritos) {
    this.devsInscritos = devsInscritos;
  }

  // METODO GET CONTEUDOS
  public Set<Conteudo> getConteudos() {
    return conteudos;
  }
  // METODO SET CONTEUDOS
  public void setConteudos(Set<Conteudo> conteudos) {
    this.conteudos = conteudos;
  }

  @Override
  public boolean equals(Object o){
    if(this == o) return true;
    if(o == null || getClass() != o.getClass()) return false;
    Bootcamp bootcamp = (Bootcamp) o;
    return ((Objects.equals(nome, bootcamp.nome)) && (Objects.equals(descricao, bootcamp.descricao)) && (Objects.equals(dataInicial, bootcamp.dataInicial)) && (Objects.equals(dataFinal, bootcamp.dataFinal)) && (Objects.equals(devsInscritos, bootcamp.devsInscritos)) && (Objects.equals(conteudos, bootcamp.conteudos)));
  }

  @Override
  public int hashCode(){
    return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
  }

}