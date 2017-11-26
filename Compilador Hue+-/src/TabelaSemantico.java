
import java.util.ArrayList;
import java.util.List;

public class TabelaSemantico {

    private List<String> nome = new ArrayList<>();
    private List<String> categoria = new ArrayList<>();
    private List<String> tipo = new ArrayList<>();
    private List<String> nivel = new ArrayList<>();


    public List<String> getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome.add(nome);
    }

    public List<String> getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria.add(categoria);
    }

    public List<String> getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo.add(tipo);
    }

    public List<String> getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel.add(nivel);
    }

}
