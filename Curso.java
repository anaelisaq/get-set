public class Curso {//criando classe
    
    private int codigoCurso;
    private String nomeCurso;

    public Curso (int codigoCurso, String nomeCurso){ //definição de objeto
    
        this.codigoCurso = codigoCurso;
        this.nomeCurso = nomeCurso;
    }
//criação gets e sets
    public int getCodigoCurso(){
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso){
        this.codigoCurso = codigoCurso;
    }

    public String getNomeCurso(){
        return nomeCurso;
    }

    public void setNomeCurso (String nomeCurso){
        this.nomeCurso = nomeCurso;
    }
}