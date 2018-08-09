public class Candidatos
{
  private String nome;
  private Documentos documentos;
  
  public void setNome(String nome){
      this.nome = nome;
    }
    public void setDocumentos(Documentos documentos){
        this.documentos = documentos;
    }
    public String getNome(){
        return this.nome;
    }
    public Documentos getDocumentos(){
        return this.documentos;
    }
}
