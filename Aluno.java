public class Aluno {//criando classe
    
    private String nomeAluno;
    private String cpfAluno;
    private int idadeAluno;
    private Curso cursoAluno;

    public Aluno (String nomeAluno, String cpfAluno, int idadeAluno, Curso cursoAluno){ //definição de objeto
        
        this.nomeAluno = nomeAluno;
        this.cpfAluno = cpfAluno;
        this.idadeAluno = idadeAluno;
        this.cursoAluno = cursoAluno;
    }
//criação gets e sets
    public String getNomeAluno(){
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno){
        this.nomeAluno = nomeAluno;
    }

    public String getCpfAluno(){
        return cpfAluno;
    }

    public void setCpfAluno(String cpfAluno){
        this.cpfAluno = cpfAluno;
    }

    public int getIdadeAluno(){
        return idadeAluno;
    }

    public void setIdadeAluno(int idadeAluno){
        this.idadeAluno = idadeAluno;
    }

    public Curso getCursoAluno(){
        return cursoAluno;
    }

    public void setCursoAluno(Curso cursoAluno){
        this.cursoAluno = cursoAluno;
    }
}