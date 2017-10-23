
import java.util.ArrayList;
import java.util.List;

public class ErroGetSet {

    private final List<Integer> Linha = new ArrayList<>();
    private final List<String> Erro = new ArrayList<>();

    public List<Integer> getLinha() {
        return Linha;
    }

    public void setLinha(Integer Linha) {

        this.Linha.add(Linha);

    }

    public List<String> getErro() {
        return Erro;
    }

    public void setErro(String Token) {

        this.Erro.add(Token);

    }

}
