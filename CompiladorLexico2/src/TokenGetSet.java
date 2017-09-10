
import java.util.ArrayList;
import java.util.List;


public class TokenGetSet {
 
     private final List<Integer> Codigo = new ArrayList<>();
     private final List<Integer> Linha = new ArrayList<>();
     private final List<String> Token = new ArrayList<>();

    
    public List<Integer> getCodigo() {
        return Codigo;
    }
    
    public void  setCodigo(Integer Codigo) {
        
        this.Codigo.add(Codigo);
        
    }

    public List<Integer> getLinha() {
        return Linha;
    }
    
     public void setLinha(Integer Linha) {
         
         this.Linha.add(Linha);
         
    }

    public List<String> getToken() {
        return Token;
    }
    
    public void setToken(String Token){
        
        this.Token.add(Token);
        
    }
}
