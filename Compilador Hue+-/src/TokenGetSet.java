
import java.util.ArrayList;
import java.util.List;

public class TokenGetSet {

    private final List<Integer> Codigo = new ArrayList<>();
    private final List<Integer> Linha = new ArrayList<>();
    private final List<String> Token = new ArrayList<>();
    private final List<Integer> X = new ArrayList<>();
    private final List<Integer> A = new ArrayList<>();
    private final List<String> P = new ArrayList<>();
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

    public void setCodigo(Integer Codigo) {

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

    public void setToken(String Token) {

        this.Token.add(Token);

    }

    public List<Integer> getX() {
        return X;
    }

    public void setX(Integer X) {

        this.X.add(X);

    }

    public List<Integer> getA() {
        return A;
    }

    public void setA(Integer A) {

        this.A.add(A);

    }

    public List<String> getP() {
        return P;
    }

    public void setP(String P) {

        this.P.add(P);

    }
}
