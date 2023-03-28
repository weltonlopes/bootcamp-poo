import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {

        Curso curso1 = new Curso();
        curso1.setTitulo("java curso");
        curso1.setDescricao("java curso descricao");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("js curso");
        curso2.setDescricao("js curso descricao");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("java mentoria");
        mentoria.setDescricao("java mentoria descricao");
        mentoria.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
