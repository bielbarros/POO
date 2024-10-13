import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Programação Orientada a Objetos");
        curso1.setCargaHoraria(65);
        curso1.setDescricao("Curso para se aprofundar na linguagem Java, entendendo sobre POO (Programação Orientada a Objetos");
        System.out.println(curso1);

        Curso curso2= new Curso();
        curso2.setTitulo("Programação Orientada a Eventos");
        curso2.setCargaHoraria(65);
        curso2.setDescricao("Curso para se aprofundar na linguagem Java, entendendo sobre POE (Programação Orientada a Eventos");
        System.out.println(curso2);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Crie seu portfólio do zero!");
        mentoria1.setDescricao("Mentoria para ajudar devs iniciantes a criar seu próprio portfólio para subirem seus projetos");
        mentoria1.setData(LocalDateTime.now());
        System.out.println(mentoria1);


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Curso intensivo da linguagem Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel Barros");
        devGabriel.inscrever(bootcamp);
        System.out.println("XP: " + devGabriel.calcularTotalXp());
        System.out.println("Conteudo inscrito: " + devGabriel.getConteudosInscritos());
        System.out.println("------------------------------------------");
        devGabriel.progredir();
        System.out.println("Conteudo inscrito: " + devGabriel.getConteudosInscritos());
        System.out.println("Conteudo concluido: " + devGabriel.getConteudosConcluidos());
        System.out.println("XP: " + devGabriel.calcularTotalXp());

        System.out.println("------------------------------------------");
        Dev devNicole = new Dev();
        devNicole.setNome("Nicole Barros");
        devNicole.inscrever(bootcamp);
        System.out.println("Conteudo inscrito: " + devNicole.getConteudosInscritos());



    }
}