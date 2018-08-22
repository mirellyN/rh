import java.util.*;

public class Selecao {
  
  private List candidatos= new ArrayList<Candidato>();
  private String dataInicio;
  private String dataFim;
  private String tipoDeSelecao;
  private String avaliacaoGeral;
  private boolean aprovacao;
  
  public String getDataInicio(){
    return this.dataInicio;
  }
  
  public void setDataInicio(String dataInicio){
    this.dataInicio= dataInicio;
  }
 
  public String getDataFim(){ 
    return this.dataFim;
  }
  
  public void setDataFim(String dataFim){
    this.dataFim=dataFim;
  }
  
  public String getTipoDeSelecao(){
    return this.tipoDeSelecao;
  }
  
  public void setTipoDeSelecao(String tipoDeSelecao){
    this.tipoDeSelecao= tipoDeSelecao;
  }
  
  public String getAvaliacaoGeral(){
    return this.tipoDeSelecao;
  }
  
  public void setAvaliacaoGeral(String avaliacaoGeral){
    this.avaliacaoGeral= avaliacaoGeral;
  }
  
  public boolean getAprovacao(){
    return this.aprovacao;
  }
  
  public void setAprovacao(boolean aprovacao){
    this.aprovacao=aprovacao;
  }
}
