import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;


public class Main {
    static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java Script");
        curso2.setDescricao("descrição curso java script");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("descrição mentria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devTito = new Dev();
        devTito.setNome("Tito");
        devTito.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos TITO:" +devTito.getConteudosInscritos());
        devTito.progredir();
        devTito.progredir();
        System.out.println("____________________________");
        System.out.println("Conteúdos Inscritos TITO:" +devTito.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos TITO:" +devTito.getConteudosConcluidos());
        System.out.println("XP: " +devTito.calcularTotalXp());


        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos JOÃO:" +devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("____________________________");
        System.out.println("Conteúdos Inscritos JOÃO:" +devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos JOÃO:" +devJoao.getConteudosConcluidos());
        System.out.println("XP: " +devJoao.calcularTotalXp());

    }
}
