import java.time.LocalDate;
import java.util.List;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main{
  public static void main(String[] args) {
  
    // INSTANCIANDO CURSOS
    Curso curso1 = new Curso();
    curso1.setTitulo("Curso de Java");
    curso1.setDescricao("Descrição do curso de Java");
    curso1.setCargaHoraria(10);

    Curso curso2 = new Curso();
    curso2.setTitulo("Curso de JavaScript");
    curso2.setDescricao("Descrição do curso de JavaScript");
    curso2.setCargaHoraria(4);

    // INSTANCIANDO MENTORIAS
    Mentoria mentoria1 = new Mentoria();
    mentoria1.setTitulo("Mentoria de JAVA");
    mentoria1.setDescricao("Descrição sobre  a mentoria de JAVA");
    mentoria1.setData(LocalDate.now());

    // 
    Conteudo conteudo   = new Curso();
    Conteudo conteudo1  = new Mentoria();

    //List<String> palavras = new ArrayList<>();

    /*System.out.println(curso1);
    System.out.println(curso2);
    System.out.println(mentoria1);
    System.out.println(conteudo);
    System.out.println(conteudo1);*/

    // CRIANDO O BOOTCAMP
    Bootcamp bootcamp1 = new Bootcamp();
    bootcamp1.setNome("Bootcamp Java Developer DIO");
    bootcamp1.setDescricao("Descrição do bootcamp Java Developer DIO");
    bootcamp1.getConteudos().add(curso1);
    bootcamp1.getConteudos().add(curso2);
    bootcamp1.getConteudos().add(mentoria1);

    // CRIANDO OS DEVS
    Dev dev1 = new Dev();
    dev1.setNome("Clayton");
    dev1.inscreverBootcamp(bootcamp1);
    System.out.println("Conteudos Inscritos: "+ dev1.getConteudosInscritos());
    dev1.progredir();
    dev1.progredir();
    System.out.println("-");
    System.out.println("Conteudos Inscritos: "+ dev1.getConteudosInscritos());
    System.out.println("Conteudos Concluidos: "+ dev1.getConteudosConcluidos());
    System.out.println("XP: "+ dev1.calcularTotalXp());


    System.out.println("----------");

    Dev dev2 = new Dev();
    dev2.setNome("Jão");
    dev2.inscreverBootcamp(bootcamp1);
    System.out.println("Conteudos Inscritos: "+ dev2.getConteudosInscritos());
    dev2.progredir();
    dev2.progredir();
    dev2.progredir();
    System.out.println("-");
    System.out.println("Conteudos Inscritos: "+ dev2.getConteudosInscritos());
    System.out.println("Conteudos Concluidos: "+ dev2.getConteudosConcluidos());
    System.out.println("XP: "+ dev2.calcularTotalXp());

  }
}