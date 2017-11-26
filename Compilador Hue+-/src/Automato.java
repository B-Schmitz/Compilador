
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

public class Automato {

    private TokenGetSet t;
    private ErroGetSet err;
    private Integer i, qtd_linha, contAux;
    private String token;
    private Integer encerra;
    private final ListaProducoes lis = new ListaProducoes();
    private final NaoTerminais[] Nterminais;
    private final TabelaDeParsing tabParsing;
    private TabelaSemantico semantico;
    private final Integer parsing[][];
    private final Stack pilha;
    private List<Integer> producao = new ArrayList<>();
    Integer X, a;

    public Automato() {
       
        tabParsing = new TabelaDeParsing();
        parsing = tabParsing.getParsing();
        lis.IniciarLista();
        pilha = new Stack<>();
        Nterminais = lis.getNterminal();

    }
    
    public void DivZero(){
        
       if(Integer.valueOf(token) == 0){
           
           err.setErro("Não é permitido a divizão por zero");
           err.setLinha(qtd_linha);
           t.setErr(err);
           encerra = 1;
           
       }
        
    }
    
    public void Busca(){
        
        if(!semantico.getNome().contains(token)){
            Insercao();
        }
        else{
           err.setErro("Variavel já declarada");
           err.setLinha(qtd_linha);
           t.setErr(err); 
           encerra = 1;
        }
        
        
        
    }
    
    public void Insercao(){
        
        semantico.setNome(token);
        
    }
    
    public void InsercaoTipo(){
        
        for(int i = semantico.getTipo().size(); i < semantico.getNome().size(); i++){
            
            semantico.setTipo(token);
            
        }
    }

    public void Sintatico() {

        //Início
        
                  
        //  X recebe o topo da pilha
        X = (Integer) pilha.peek();

        //a  recebe o símbolo da entrada
        if (t.getCodigo().size() > 0) {
            a = t.getCodigo().get(t.getCodigo().size() - 1);

        } else {
            return;
        }
        t.setX(X);
        t.setA(a);
        t.setP(pilha.toString());
        System.out.println("a = " + a + "X = " + X + "Pilha = " + pilha.toString());
        //Repita
        do {
            //Se X== vazio então
            if (X == 15) {
                //Retire o elemento do topo da pilha
                pilha.pop();
                System.out.println("a = " + a + "X = " + X + "Pilha = " + pilha.toString());
                t.setX(X);
                t.setA(a);
                t.setP(pilha.toString());
                //X recebe o topo da pilha
                X = (Integer) pilha.peek();
            } //Senão
            else {
                //Se X == terminal então
                if (X < 48) {
                    //Se X==a então
                    if (Objects.equals(X, a)) {

                        //Retire o elemento do topo da pilha
                        pilha.pop();
                        System.out.println("a = " + a + "X = " + X + "Pilha = " + pilha.toString());
                        t.setX(X);
                        t.setA(a);
                        t.setP(pilha.toString());
                        //Volta para o Léxico
                        break;
                    } //Senão 
                    else {

                        //Erro. Encerra o programa 
                        //Falta coisa
                        encerra = 1;
                        System.out.println("Erro");
                        break;
                    }
                } //Senão 
                else {
                    

                    //e M(X,a) <> null então
                    if (parsing[X - 48][a - 1] != null) {

                        int pos = parsing[X - 48][a - 1];
                        //Retire o elemento do topo da pilha 
                        pilha.pop();

                        producao = Nterminais[pos - 1].getProducao();
                        //Coloque o conteúdo da regra na pilha
                        for (int j = 0; j < producao.size(); j++) {

                            //Colocando o conteúdo da regra na pilha
                            pilha.push(producao.get(j));

                        }
                        //X recebe o topo da pilha
                        X = (Integer) pilha.peek();
                        System.out.println("a = " + a + "X = " + X + "Pilha = " + pilha.toString());
                        t.setX(X);
                        t.setA(a);
                        t.setP(pilha.toString());

                    } //Senão
                    else {

                        System.out.println("Erro2");
                        encerra = 1;
                        break;
                    }
                    

                }

            }

        } while (X != 44);
        //Enquanto for diferende do simbolo de final de arquivo

        if (encerra.equals(1)) {
            switch (X) {
                case 37: {
                    err.setErro("Faltando ' ; '");
                    err.setLinha(qtd_linha);
                    break;
                }
                case 25: {
                    err.setErro("Faltando ' >> '");
                    err.setLinha(qtd_linha);
                    break;
                }
                case 31: {
                    err.setErro("Faltando ' << '");
                    err.setLinha(qtd_linha);
                    break;
                }
                case 35: {
                    err.setErro("Faltando ' } '");
                    err.setLinha(qtd_linha);
                    break;
                }
                case 36: {
                    err.setErro("Faltando ' { '");
                    err.setLinha(qtd_linha);
                    break;
                }
                case 10: {
                    err.setErro("Faltando ' main ' no inicio do programa");
                    err.setLinha(qtd_linha);
                    break;
                }
                case 18: {
                    err.setErro("Faltando ' fim ' ");
                    err.setLinha(qtd_linha);
                    break;
                }
                case 4: {
                    err.setErro("Faltando ' return ' ");
                    err.setLinha(qtd_linha);
                    break;
                }
                

                default: {
                    err.setErro("Erro sintatico");
                    err.setLinha(qtd_linha);
                    break;
                }
            }

            t.setErr(err);
        }
          while(!pilha.isEmpty() && 99 < (Integer)pilha.peek()){
                        if(100 == (Integer)pilha.peek()){
                            
                            DivZero();
                            
                            
                        }
                        
                        else if(101 == (Integer)pilha.peek()){
                            
                           Busca();
                            
                        }
                        
                        else if(102 == (Integer)pilha.peek()){
                            
                            InsercaoTipo();
                            
                        }
                        
                        pilha.pop();
                        
                        
                    }
    }

    public TokenGetSet getToken(String Sentenca) {
        pilha.clear();
        pilha.push(44); //44 final de arquivo @
        pilha.push(48);

        i = 0;
        qtd_linha = 1;
        token = "";
        encerra = 0;
        err = new ErroGetSet();
        t = new TokenGetSet();
        semantico = new TabelaSemantico();

        inicio(Sentenca);
        return t;

    }

    public void inicio(String Sentenca) {

        if (encerra.equals(0)) {
            if (!"@".equals(token)) {
                token = "";
                token += String.valueOf(Sentenca.charAt(i));
                if (Sentenca.charAt(i) == ' ') {
                    i++;
                    inicio(Sentenca);

                } else if (Sentenca.charAt(i) == '\n') {
                    qtd_linha++;
                    i++;
                    inicio(Sentenca);

                } else if (Sentenca.charAt(i) == '\t') {
                    i++;
                    inicio(Sentenca);

                } else if (Sentenca.charAt(i) != '@') {

                    if (Sentenca.charAt(i) == '#') {
                        i++;
                        LetraVar(Sentenca);
                    } // Esse vai verificar if, while, for, etc...
                    else if (Character.isLetter(Sentenca.charAt(i))) {
                        i++;
                        // Esse metodo vai verificar se o proximo é letra
                        Letra(Sentenca);

                    } else if (Character.isDigit(Sentenca.charAt(i))) {
                        i++;
                        Digit(Sentenca);

                    } else if (Sentenca.charAt(i) == '$') {

                        i++;
                        contAux = qtd_linha;
                        cifrao(Sentenca);

                    } else if (Sentenca.charAt(i) == '"') {
                        i++;
                        contAux = qtd_linha;
                        aspasDuplas(Sentenca);

                    } else if (String.valueOf(Sentenca.charAt(i)).equals("'")) {
                        token = "";
                        contAux = qtd_linha;
                        i++;
                        LetraAspas(Sentenca);

                    } else if (Sentenca.charAt(i) == '=') {
                        i++;
                        Igual(Sentenca);

                    } else if (Sentenca.charAt(i) == '+') {
                        i++;
                        Mais(Sentenca);

                    } else if (Sentenca.charAt(i) == '*') {

                        t.setToken(token);
                        t.setCodigo(41);
                        t.setLinha(qtd_linha);
                        Sintatico();
                        i++;
                        inicio(Sentenca);

                    } else if (Sentenca.charAt(i) == '/') {

                        t.setCodigo(39);
                        t.setToken(token);
                        t.setLinha(qtd_linha);
                        Sintatico();
                        i++;
                        inicio(Sentenca);

                    } else if (Sentenca.charAt(i) == '>') {
                        i++;
                        MaiorOuIgual(Sentenca);

                    } else if (Sentenca.charAt(i) == '<') {
                        i++;
                        MenorOuIgual(Sentenca);

                    } else if (Sentenca.charAt(i) == '{') {

                        t.setCodigo(36);
                        t.setToken(token);
                        t.setLinha(qtd_linha);
                        Sintatico();
                        i++;
                        inicio(Sentenca);

                    } else if (Sentenca.charAt(i) == '}') {

                        t.setCodigo(35);
                        t.setToken(token);
                        t.setLinha(qtd_linha);
                        Sintatico();
                        i++;
                        inicio(Sentenca);
                    } else if (Sentenca.charAt(i) == '(') {

                        t.setCodigo(43);
                        t.setToken(token);
                        t.setLinha(qtd_linha);
                        Sintatico();
                        i++;
                        inicio(Sentenca);
                    } else if (Sentenca.charAt(i) == ')') {

                        t.setCodigo(42);
                        t.setToken(token);
                        t.setLinha(qtd_linha);
                        Sintatico();
                        i++;
                        inicio(Sentenca);

                    } else if (Sentenca.charAt(i) == ',') {

                        t.setCodigo(40);
                        t.setToken(token);
                        t.setLinha(qtd_linha);
                        Sintatico();
                        i++;
                        inicio(Sentenca);

                    } else if (Sentenca.charAt(i) == ':') {

                        t.setCodigo(38);
                        t.setToken(token);
                        t.setLinha(qtd_linha);
                        Sintatico();
                        i++;
                        inicio(Sentenca);

                    } else if (Sentenca.charAt(i) == ';') {

                        t.setCodigo(37);
                        t.setToken(token);
                        t.setLinha(qtd_linha);
                        Sintatico();
                        i++;
                        inicio(Sentenca);

                    } else if (Sentenca.charAt(i) == '-') {
                        i++;
                        Menos(Sentenca);

                    } else if (Sentenca.charAt(i) == '!') {

                        i++;
                        Diferente(Sentenca);

                    } else if (Sentenca.charAt(i) == '[') {

                        i++;
                        token = "";
                        contAux = qtd_linha;
                        ComentarioBloco(Sentenca);

                    } else {
                        i++;
                        tokens(Sentenca);
                    }

                } else {

                    t.setCodigo(44);
                    t.setToken(token);
                    t.setLinha(qtd_linha);
                    Sintatico();
                    System.out.println("Fim");
                }
            }
        }

    }

    // Verifica letra de uma possivel variavel
    public void LetraVar(String Sentenca) {

        if (Character.isLetter(Sentenca.charAt(i))) {
            token += String.valueOf(Sentenca.charAt(i));

            i++;
            LetraDigitVar(Sentenca);
        } else {

            err.setLinha(qtd_linha);
            err.setErro("Declaração de variável errada");
            t.setErr(err);
            // brancoString(Sentenca);
        }
    }

    public void brancoString(String Sentenca) {

        if (Character.isDigit(Sentenca.charAt(i)) || Character.isLetter(Sentenca.charAt(i))) {

            i++;
            brancoString(Sentenca);

        } else if (Sentenca.charAt(i) == '\n') {

            qtd_linha++;
            i++;
            inicio(Sentenca);
        } else {
            inicio(Sentenca);
        }
    }

    public void LetraDigitVar(String Sentenca) {

        if (Character.isDigit(Sentenca.charAt(i)) || Character.isLetter(Sentenca.charAt(i))) {
            token += String.valueOf(Sentenca.charAt(i));
            i++;
            LetraDigitVar(Sentenca);
        } else {

            if (token.length() < 129) {
                t.setCodigo(7);
                t.setToken(token);
                t.setLinha(qtd_linha);
                Sintatico();
                inicio(Sentenca);
            } else {
                err.setLinha(qtd_linha);
                err.setErro("Variável muito grande");
                t.setErr(err);
            }

        }

    }

    public void Letra(String Sentenca) {

        if (Character.isLetter(Sentenca.charAt(i))) {

            token += String.valueOf(Sentenca.charAt(i));
            i++;
            LetraToken(Sentenca);

        } else {
            tokens(Sentenca);
        }
    }

    public void LetraToken(String Sentenca) {

        if (Character.isLetter(Sentenca.charAt(i))) {

            token += String.valueOf(Sentenca.charAt(i));
            i++;
            LetraToken(Sentenca);
        } else {
            tokens(Sentenca);
            if (encerra == 0) {
                inicio(Sentenca);
            }
        }

    }

    public void tokens(String Sentenca) {

        switch (token) {
            case "while":
                t.setCodigo(1);
                t.setToken(token);
                t.setLinha(qtd_linha);
                break;
            case "void":
                t.setCodigo(2);
                t.setToken(token);
                t.setLinha(qtd_linha);
                break;
            case "string":
                t.setCodigo(3);
                t.setToken(token);
                t.setLinha(qtd_linha);
                break;
            case "return":
                t.setCodigo(4);
                t.setToken(token);
                t.setLinha(qtd_linha);
                break;
            case "main":
                t.setCodigo(10);
                t.setToken(token);
                t.setLinha(qtd_linha);
                break;
            case "integer":
                t.setCodigo(12);
                t.setToken(token);
                t.setLinha(qtd_linha);
                break;
            case "inicio":
                t.setCodigo(13);
                t.setToken(token);
                t.setLinha(qtd_linha);
                break;
            case "if":
                t.setCodigo(14);
                t.setToken(token);
                t.setLinha(qtd_linha);
                break;
            case "for":
                t.setCodigo(16);
                t.setToken(token);
                t.setLinha(qtd_linha);
                break;
            case "float":
                t.setCodigo(17);
                t.setToken(token);
                t.setLinha(qtd_linha);
                break;
            case "fim":
                t.setCodigo(18);
                t.setToken(token);
                t.setLinha(qtd_linha);
                break;
            case "else":
                t.setCodigo(19);
                t.setToken(token);
                t.setLinha(qtd_linha);
                break;
            case "do":
                t.setCodigo(20);
                t.setToken(token);
                t.setLinha(qtd_linha);
                break;
            case "cout":
                t.setCodigo(21);
                t.setToken(token);
                t.setLinha(qtd_linha);
                break;
            case "cin":
                t.setCodigo(22);
                t.setToken(token);
                t.setLinha(qtd_linha);
                break;
            case "char":
                t.setCodigo(23);
                t.setToken(token);
                t.setLinha(qtd_linha);
                break;
            case "callfuncao":
                t.setCodigo(24);
                t.setToken(token);
                t.setLinha(qtd_linha);
                break;
            default:
                err.setLinha(qtd_linha);
                err.setErro("Palavra  '" + token + "'  desconhecida");
                t.setErr(err);
                encerra = 1;
                // inicio(Sentenca);
                break;
        }
        if (encerra.equals(0)) {
            Sintatico();
        }
    }

    public void Digit(String Sentenca) {

        if (Character.isDigit(Sentenca.charAt(i))) {
            token += String.valueOf(Sentenca.charAt(i));
            i++;
            Digit(Sentenca);

        } else if (Sentenca.charAt(i) == ',') {
            token += String.valueOf(Sentenca.charAt(i));
            i++;
            DigitFloat(Sentenca);
        } else {

            //O L depois do numero converte para long. Obs: não sabia disso kk
            if (token.length() < 11 && 2147483649L > Long.parseLong(token)) {

                t.setCodigo(5);
                t.setToken(token);
                t.setLinha(qtd_linha);
                Sintatico();
                inicio(Sentenca);

            } else {
                err.setLinha(qtd_linha);
                err.setErro("Integer muito grande");
                t.setErr(err);
            }
        }

    }

    public void DigitFloat(String Sentenca) {

        if (Character.isDigit(Sentenca.charAt(i))) {

            token += String.valueOf(Sentenca.charAt(i));
            i++;
            DigitFloat(Sentenca);
        } else {

            if (token.length() < 12) {
                t.setCodigo(6);
                t.setToken(token);
                t.setLinha(qtd_linha);
                Sintatico();
                inicio(Sentenca);
            } else {
                err.setLinha(qtd_linha);
                err.setErro("Float muito grande");
                t.setErr(err);

            }
        }

    }

    public void aspasDuplas(String Sentenca) {

        if (Sentenca.charAt(i) == '@') {

            err.setLinha(contAux);
            err.setErro("Erro nome string");
            t.setErr(err);

        } else if ('"' != Sentenca.charAt(i)) {

            token += String.valueOf(Sentenca.charAt(i));
            if (Sentenca.charAt(i) == '\n') {
                qtd_linha++;
            }
            i++;
            aspasDuplas(Sentenca);

        } else {

            token += String.valueOf(Sentenca.charAt(i));
            if (token.length() < 131) {
                t.setCodigo(9);
                t.setToken(token);
                t.setLinha(contAux);
                Sintatico();

            } else {
                err.setLinha(qtd_linha);
                err.setErro("String muito grande");
                t.setErr(err);
            }

            i++;
            inicio(Sentenca);
        }

    }

    public void cifrao(String Sentenca) {

        if (Sentenca.charAt(i) == '@') {

            err.setLinha(contAux);
            err.setErro("Erro de literal");
            t.setErr(err);

        } else if ('$' != Sentenca.charAt(i)) {

            token += String.valueOf(Sentenca.charAt(i));
            if (Sentenca.charAt(i) == '\n') {
                qtd_linha++;
            }
            i++;
            cifrao(Sentenca);
        } else {

            token += String.valueOf(Sentenca.charAt(i));
            t.setCodigo(11);
            t.setLinha(contAux);
            t.setToken(token);
            Sintatico();
            i++;
            inicio(Sentenca);
        }

    }

    //Char
    public void LetraAspas(String Sentenca) {

        if (!String.valueOf(Sentenca.charAt(i)).equals("'")) {
            token += String.valueOf(Sentenca.charAt(i));
            i++;
            Aspas(Sentenca);
        }

    }

    public void Aspas(String Sentenca) {

        if (Sentenca.charAt(i) == '@') {
            err.setErro("Erro no nome do char");
            err.setLinha(contAux);
            t.setErr(err);

        } else if (token.length() > 1) {
            err.setErro("Erro no tamanho do nome do char");
            err.setLinha(contAux);
            t.setErr(err);

        } else if (!String.valueOf(Sentenca.charAt(i)).equals("'")) {

            token += String.valueOf(Sentenca.charAt(i));
            i++;
            Aspas(Sentenca);

        } else {
            t.setCodigo(8);
            t.setToken(token);
            t.setLinha(contAux);
            Sintatico();
            i++;
            inicio(Sentenca);
        }
    }

    public void Igual(String Sentenca) {

        if (Sentenca.charAt(i) == '=') {

            token += String.valueOf(Sentenca.charAt(i));
            t.setCodigo(28);
            t.setToken(token);
            t.setLinha(qtd_linha);
            Sintatico();
            i++;
            inicio(Sentenca);
        } else {

            t.setCodigo(29);
            t.setToken(token);
            t.setLinha(qtd_linha);
            Sintatico();
            inicio(Sentenca);
        }
    }

    public void Mais(String Sentenca) {

        if (Sentenca.charAt(i) == '+') {

            token += String.valueOf(Sentenca.charAt(i));
            t.setCodigo(33);
            t.setToken(token);
            t.setLinha(qtd_linha);
            Sintatico();
            i++;
            inicio(Sentenca);
        } else {

            t.setCodigo(34);
            t.setToken(token);
            t.setLinha(qtd_linha);
            Sintatico();
            inicio(Sentenca);
        }
    }

    public void Menos(String Sentenca) {

        if (Sentenca.charAt(i) == '-') {
            token += String.valueOf(Sentenca.charAt(i));
            t.setCodigo(46);
            t.setToken(token);
            t.setLinha(qtd_linha);
            Sintatico();
            i++;
            inicio(Sentenca);

        } else {
            t.setCodigo(47);
            t.setToken(token);
            t.setLinha(qtd_linha);
            Sintatico();
            inicio(Sentenca);
        }
    }

    public void MaiorOuIgual(String Sentenca) {

        switch (Sentenca.charAt(i)) {
            case '>':
                token += String.valueOf(Sentenca.charAt(i));
                t.setCodigo(25);
                t.setToken(token);
                t.setLinha(qtd_linha);
                Sintatico();
                i++;
                inicio(Sentenca);
                break;
            case '=':
                token += String.valueOf(Sentenca.charAt(i));
                t.setCodigo(26);
                t.setToken(token);
                t.setLinha(qtd_linha);
                Sintatico();
                i++;
                inicio(Sentenca);
                break;
            default:
                t.setCodigo(27);
                t.setToken(token);
                t.setLinha(qtd_linha);
                Sintatico();
                inicio(Sentenca);
                break;
        }
    }

    public void MenorOuIgual(String Sentenca) {

        switch (Sentenca.charAt(i)) {
            case '<':
                token += String.valueOf(Sentenca.charAt(i));
                t.setCodigo(31);
                t.setToken(token);
                t.setLinha(qtd_linha);
                Sintatico();
                i++;
                inicio(Sentenca);
                break;
            case '=':
                token += String.valueOf(Sentenca.charAt(i));
                t.setCodigo(30);
                t.setToken(token);
                t.setLinha(qtd_linha);
                Sintatico();
                i++;
                inicio(Sentenca);
                break;
            default:
                t.setCodigo(32);
                t.setToken(token);
                t.setLinha(qtd_linha);
                Sintatico();
                inicio(Sentenca);
                break;
        }
    }

    public void Diferente(String Sentenca) {

        if (Sentenca.charAt(i) == '=') {
            token += String.valueOf(Sentenca.charAt(i));
            t.setCodigo(45);
            t.setToken(token);
            t.setLinha(qtd_linha);
            Sintatico();
            i++;
            inicio(Sentenca);
        } else {

            ComentarioLinha(Sentenca);
        }

    }

    public void ComentarioLinha(String Sentenca) {

        if (Sentenca.charAt(i) != '\n') {
            if (Sentenca.charAt(i) != '@') {
                i++;
                ComentarioLinha(Sentenca);
            }
        } else {
            qtd_linha++;
            i++;
            inicio(Sentenca);
        }
    }

    public void ComentarioBloco(String Sentenca) {

        if (Sentenca.charAt(i) == '@') {

            err.setLinha(contAux);
            err.setErro("Erro no comentário de bloco");
            t.setErr(err);
            // inicio(Sentenca);

        } else if (Sentenca.charAt(i) != ']') {

            if (Sentenca.charAt(i) == '\n') {
                qtd_linha++;
            }
            i++;
            ComentarioBloco(Sentenca);
        } else {
            i++;
            inicio(Sentenca);
        }
    }
}
