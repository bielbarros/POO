import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Programação Orientada a Objetos");
        curso1.setCargaHoraria(65);
        curso1.setDescricao("Curso para se aprofundar na linguagem Java, entendendo sobre POO (Programação Orientada a Objetos");
        System.out.println(curso1);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Crie seu portfólio do zero!");
        mentoria1.setDescricao("Mentoria para ajudar devs iniciantes a criar seu próprio portfólio para subirem seus projetos");
        mentoria1.setData(LocalDateTime.now());
        System.out.println(mentoria1);
    }
}