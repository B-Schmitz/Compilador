
import java.util.ArrayList;
import java.util.List;


public class TokenGetSet {
 
     private final List<Integer> Codigo = new ArrayList<>();
     private final List<Integer> Linha = new ArrayList<>();
     private final List<String> Token = new ArrayList<>();
     private ErroGetSet err;

    
    public List<Integer> getCodigo() {
        return Codigo;
    }

    public ErroGetSet getErr() {
        return err;
    }

    public void setErr(ErroGetSet err) {
        this.err = err;
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
