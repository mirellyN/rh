import java.util.Date;

public class Documentos
{
  private String numeroRG;
  private String numeroCPF;
  private String telefone;
  private String endereco; 
  private Date dataDeNasc;
  private String email;
  
  public void setNumeroRG(String numeroRG){
      this.numeroRG = numeroRG;
    }
    public void setNumeroCPF(String numeroCPF){
      this.numeroCPF = numeroCPF;
    }
    public void setTelefone(String telefone){
      this.telefone = telefone;
    }
    public void setEndereco(String endereco){
      this.endereco = endereco;
    }
    public void setEmail(String email){
      this.email = email;
    }
    public void setDataDeNasc(Date dataDeNasc){
      this.dataDeNasc = dataDeNasc;
    }
    
    
    public String getNumeroRG(String numeroRG){
     return  this.numeroRG;
    }
    public String getNumeroCPF(String numeroCPF){
      return this.numeroCPF;
    }
    public String getTelefone(String telefone){
      return this.telefone;
    }
    public String getEndereco(String endereco){
      return this.endereco;
    }
    public String getEmail(String email){
      return this.email;
    }
    public Date getDataDeNasc(Date dataDeNasc){
      return this.dataDeNasc;
    }
}
