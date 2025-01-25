import br.com.dio.desafio.dominio.Aluno;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.CursoIngles;
import br.com.dio.desafio.dominio.CursoEspanhol;
import br.com.dio.desafio.dominio.InstituicaoDeEnsino;

public class Main {
    public static void main(String[] args) {

        Curso cursoInglesBasico = new CursoIngles("Inglês Básico", "Curso de introdução ao inglês", 6, 120);
        Curso cursoInglesIntermediario = new CursoIngles("Inglês Intermediário", "Curso de inglês intermediário, com ênfase em fluência e escrita", 8, 160);
        Curso cursoInglesAvancado = new CursoIngles("Inglês Avançado", "Curso de conversação em inglês", 10, 180);

        InstituicaoDeEnsino instituicao = new InstituicaoDeEnsino("DIO");
        instituicao.adicionarCurso(cursoInglesBasico);
        instituicao.adicionarCurso(cursoInglesIntermediario);
        instituicao.adicionarCurso(cursoInglesAvancado);


        Aluno rosiane = new Aluno("Rosiane");
        rosiane.inscreverCurso(cursoInglesBasico);
        rosiane.concluirCurso(cursoInglesBasico);
        rosiane.inscreverCurso(cursoInglesIntermediario);
        rosiane.concluirCurso(cursoInglesIntermediario);
        rosiane.inscreverCurso(cursoInglesAvancado);
        rosiane.listarProgresso();

        System.out.println();


        Aluno daniel = new Aluno("Daniel");
        Curso cursoEspanholBasico = new CursoEspanhol("Espanhol Básico", "Curso de introdução ao espanhol", 6, 120);
        Curso cursoEspanholIntermediario = new CursoEspanhol("Espanhol Intermediário", "Curso de espanhol intermediário", 8, 160);

        daniel.inscreverCurso(cursoEspanholBasico);
        daniel.concluirCurso(cursoEspanholBasico);
        daniel.inscreverCurso(cursoEspanholIntermediario);
        daniel.listarProgresso();


    }
}
