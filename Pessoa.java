public abstract class Pessoa{
    
  private String nome;
  private int idade;
  private String numeroRG;
  private String numeroCPF;
  private String telefone;
  private String endereco; 
  private String dataDeNasc;
  private String email;

    public Pessoa (String nome, int idade, String numeroRG, String numeroCPF, String telefone, String endereco, String dataDeNasc, String email){
          this.nome=nome; 
          this.idade=idade;
          this.numeroRG=numeroRG; 
          this.numeroCPF=numeroCPF;
          this.telefone=telefone;
          this.endereco=endereco;
          this.dataDeNasc= dataDeNasc;
          this.email= email;     
    }
  
    public void setNome(String nome){
      this.nome = nome;
    }
  
    public void setIdade(int idade){
      this.idade = idade;
    }
  
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
    
    public void setDataDeNasc(String dataDeNasc){
      this.dataDeNasc = dataDeNasc;
    }
    
    public String getNome(String nome){
     return  this.nome;
    }
     
    public int getIdade(int idade){
     return  this.idade;
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
    
    public String getDataDeNasc(String dataDeNasc){
      return this.dataDeNasc;
    }

  }
