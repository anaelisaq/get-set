public class TestaAluno{
    public static void main (String[] args){
       
        Curso curso = new Curso(18,"Ciencia da Computacao");
        
        Aluno a = new Aluno ("Victoria Silva","800.999.111-03", 25, curso);
        Aluno b = new Aluno ("Bruna Fernandes","72727227-72",25, new Curso(17, "Engenharia"));
        System.out.println("Dados do aluno: "+a.getNomeAluno());
        System.out.println("CPF: "+a.getCpfAluno());
        System.out.println("Idade: "+a.getIdadeAluno());
        System.out.println("Curso: "+a.getCursoAluno().getNomeCurso());

        System.out.println("\n");

        System.out.println("Dados do aluno: "+b.getNomeAluno());
        System.out.println("CPF: "+b.getCpfAluno());
        System.out.println("Idade: "+b.getIdadeAluno());
        System.out.println("Curso: "+b.getCursoAluno().getNomeCurso());

        System.out.println("\n");

        a.setCpfAluno("NOVO_CPF");
        a.setIdadeAluno(20);
        a.setNomeAluno("NOVO_NOME");
        curso = new Curso(21, "História");
        a.setCursoAluno(curso);
        System.out.println("Dados do aluno: "+a.getNomeAluno());
        System.out.println("CPF: "+a.getCpfAluno());
        System.out.println("Idade: "+a.getIdadeAluno());
        System.out.println("Curso: "+a.getCursoAluno().getNomeCurso());
        
    }
}
