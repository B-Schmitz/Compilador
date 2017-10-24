
import java.util.ArrayList;
import java.util.List;

public class NaoTerminais {

    private Integer NaoTerminais;
    private final List<Integer> producao = new ArrayList<>();

    public Integer getNaoTerminais() {
        return NaoTerminais;
    }

    public void setNaoTerminais(Integer NaoTerminais) {
        this.NaoTerminais = NaoTerminais;
    }

    public List<Integer> getProducao() {
        return producao;
    }

    public void setProducao(Integer producao) {
        this.producao.add(producao);
    }
}
