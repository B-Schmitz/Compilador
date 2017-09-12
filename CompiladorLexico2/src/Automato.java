
public class Automato {

    private TokenGetSet t;
    private ErroGetSet err;
    private Integer i, cont, contAux;
    private String token;

    public TokenGetSet getToken(String Sentenca) {

        i = 0;
        cont = 1;
        t = new TokenGetSet();
        err = new ErroGetSet();
        inicio(Sentenca);

        return t;
    }

    public void inicio(String Sentenca) {

        token = "";
        token += String.valueOf(Sentenca.charAt(i));

        if (Sentenca.charAt(i) == ' ') {
            i++;
            inicio(Sentenca);
        } else if (Sentenca.charAt(i) == '\n') {

            cont++;
            i++;
            inicio(Sentenca);

        } else if (Sentenca.charAt(i) == '\t') {

            i++;
            inicio(Sentenca);

        } else if (Sentenca.charAt(i) != '@') {

            //esse if é especifico para uma variavel
            if (Sentenca.charAt(i) == '#') {
                i++;
                //vai para o metodo LetraVar verificar se o proximo é letra
                LetraVar(Sentenca);

            } //esse vai verificar if, while, for, etc...
            else if (Character.isLetter(Sentenca.charAt(i))) {
                i++;
                //esse metodo vai verificar se o proximo é letra
                Letra(Sentenca);

            } else if (Character.isDigit(Sentenca.charAt(i))) {
                i++;
                Digit(Sentenca);

            } else if (Sentenca.charAt(i) == '$') {
                i++;
                token = "";
                contAux = cont;
                cifrao(Sentenca);

            } else if (Sentenca.charAt(i) == '"') {
                i++;
                aspasDuplas(Sentenca);

            } //Precisa ver se isso funciona
            else if (String.valueOf(Sentenca.charAt(i)).equals("'")) {
                token = "";
                contAux = cont;
                i++;
                LetraAspas(Sentenca);

            } else if (Sentenca.charAt(i) == '=') {
                i++;
                Igual(Sentenca);

            } else if (Sentenca.charAt(i) == '+') {
                i++;
                Mais(Sentenca);

            } else if (Sentenca.charAt(i) == '*') {

                //Ainda falta linha
                t.setToken(token);
                t.setCodigo(41);
                t.setLinha(cont);
                i++;
                //verificar final de arquivo?
                inicio(Sentenca);

            } else if (Sentenca.charAt(i) == '/') {

                //Ainda falta coisa
                t.setCodigo(39);
                t.setToken(token);
                t.setLinha(cont);
                i++;
                //verificar final de arquivo?
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
                t.setLinha(cont);
                i++;
                //verificar final de arquivo?
                inicio(Sentenca);

            } else if (Sentenca.charAt(i) == '}') {

                t.setCodigo(35);
                t.setToken(token);
                t.setLinha(cont);
                i++;
                //verificar final de arquivo?
                inicio(Sentenca);
            } else if (Sentenca.charAt(i) == '(') {

                t.setCodigo(43);
                t.setToken(token);
                t.setLinha(cont);
                i++;
                //verificar final de arquivo?
                inicio(Sentenca);
            } else if (Sentenca.charAt(i) == ')') {

                t.setCodigo(42);
                t.setToken(token);
                t.setLinha(cont);
                i++;
                //verificar final de arquivo?
                inicio(Sentenca);

            } else if (Sentenca.charAt(i) == ',') {

                t.setCodigo(40);
                t.setToken(token);
                t.setLinha(cont);
                i++;
                //verificar final de arquivo?
                inicio(Sentenca);

            } else if (Sentenca.charAt(i) == ':') {

                t.setCodigo(38);
                t.setToken(token);
                t.setLinha(cont);
                i++;
                //verificar final de arquivo?
                inicio(Sentenca);

            } else if (Sentenca.charAt(i) == ';') {

                t.setCodigo(37);
                t.setToken(token);
                t.setLinha(cont);
                i++;
                //verificar final de arquivo?
                inicio(Sentenca);

            } else if (Sentenca.charAt(i) == '-') {
                i++;
                Menos(Sentenca);
            } else if (Sentenca.charAt(i) == '!') {

                i++;
                Diferente(Sentenca);

            } else if (Sentenca.charAt(i) == '[') {

                i++;
                ComentarioBloco(Sentenca);

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

            err.setLinha(cont);
            err.setErro("Declaração de variável errada");
            t.setErr(err);
            i++;
            brancoString(Sentenca);
        }
    }

    public void brancoString(String Sentenca) {

        if (Sentenca.charAt(i) == '\n') {

            cont++;
            i++;
            inicio(Sentenca);
        } else if (Sentenca.charAt(i) != ' ') {

            i++;
            brancoString(Sentenca);

        } else {

            inicio(Sentenca);
        }
    }

    public void LetraDigitVar(String Sentenca) {
        //Não sei se isso é para estar dentro do if

        if (Character.isDigit(Sentenca.charAt(i)) || Character.isLetter(Sentenca.charAt(i))) {
            token += String.valueOf(Sentenca.charAt(i));
            i++;
            LetraDigitVar(Sentenca);
        } else {

            //código
            t.setCodigo(7);
            t.setToken(token);
            t.setLinha(cont);
            //verificar final de arquivo?

            inicio(Sentenca);
        }

    }

    //Aqui não sei se ta certo, apenas fiz como tava o nosso automato
    //mas nessa parte ele verifica se é letra
    public void Letra(String Sentenca) {

        if (Character.isLetter(Sentenca.charAt(i))) {

            token += String.valueOf(Sentenca.charAt(i));
            //E esse é o problema, o método a baixo vai verificar se o proximo é letra ou numero
            //mas só faria sentido se fosse uma variavel Ex; n2; mas se chegar até aqui ja não pode 
            //ser uma variavel, mas fiz igual tava no automato que entregamos
            i++;
            LetraDigit(Sentenca);

        } else {

            tokens(Sentenca);
        }

    }

    public void LetraDigit(String Sentenca) {

        if (Character.isDigit(Sentenca.charAt(i)) || Character.isLetter(Sentenca.charAt(i))) {

            token += String.valueOf(Sentenca.charAt(i));
            i++;
            LetraDigit(Sentenca);
        } else {

            tokens(Sentenca);
        }

        inicio(Sentenca);
    }

    public void tokens(String Sentenca) {

        if (token.equals("while")) {

            t.setCodigo(1);
            t.setToken(token);
            t.setLinha(cont);

        } else if (token.equals("void")) {

            t.setCodigo(2);
            t.setToken(token);
            t.setLinha(cont);

        } else if (token.equals("string")) {

            t.setCodigo(3);
            t.setToken(token);
            t.setLinha(cont);

        } else if (token.equals("return")) {

            t.setCodigo(4);
            t.setToken(token);
            t.setLinha(cont);

        } else if (token.equals("main")) {

            t.setCodigo(10);
            t.setToken(token);
            t.setLinha(cont);

        } else if (token.equals("integer")) {

            t.setCodigo(12);
            t.setToken(token);
            t.setLinha(cont);

        } else if (token.equals("inicio")) {

            t.setCodigo(13);
            t.setToken(token);
            t.setLinha(cont);

        } else if (token.equals("if")) {

            t.setCodigo(14);
            t.setToken(token);
            t.setLinha(cont);

        } else if (token.equals("for")) {

            t.setCodigo(16);
            t.setToken(token);
            t.setLinha(cont);

        } else if (token.equals("float")) {

            t.setCodigo(17);
            t.setToken(token);
            t.setLinha(cont);

        } else if (token.equals("fim")) {

            t.setCodigo(18);
            t.setToken(token);
            t.setLinha(cont);

        } else if (token.equals("else")) {

            t.setCodigo(19);
            t.setToken(token);
            t.setLinha(cont);

        } else if (token.equals("do")) {

            t.setCodigo(20);
            t.setToken(token);
            t.setLinha(cont);

        } else if (token.equals("cout")) {

            t.setCodigo(21);
            t.setToken(token);
            t.setLinha(cont);

        } else if (token.equals("cin")) {

            t.setCodigo(22);
            t.setToken(token);
            t.setLinha(cont);

        } else if (token.equals("char")) {

            t.setCodigo(23);
            t.setToken(token);
            t.setLinha(cont);

        } else if (token.equals("callfuncao")) {

            t.setCodigo(24);
            t.setToken(token);
            t.setLinha(cont);

        } else {
            err.setLinha(cont);
            err.setErro("Declaração de variável errada");
            t.setErr(err);
            inicio(Sentenca);

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

            t.setCodigo(5);
            t.setToken(token);
            t.setLinha(cont);
            //verificar final de arquivo?
            inicio(Sentenca);
        }

    }

    public void DigitFloat(String Sentenca) {

        if (Character.isDigit(Sentenca.charAt(i))) {

            token += String.valueOf(Sentenca.charAt(i));
            DigitFloat(Sentenca);
        } else {

            t.setCodigo(6);
            t.setToken(token);
            t.setLinha(cont);
            i++;
            //verificar final de arquivo?
            inicio(Sentenca);
        }

    }

    public void aspasDuplas(String Sentenca) {

        if (Sentenca.charAt(i) == '@') {

            err.setLinha(contAux);
            err.setErro("Erro nome string");
            t.setErr(err);
            inicio(Sentenca);

        } else if ('"' != Sentenca.charAt(i)) {

            token += String.valueOf(Sentenca.charAt(i));
            if (Sentenca.charAt(i) == '\n') {
                cont++;
            }
            i++;
            aspasDuplas(Sentenca);

        } else {

            t.setCodigo(9);
            t.setToken(token);
            t.setLinha(contAux);
            i++;
            //verificar final de arquivo?
            inicio(Sentenca);

        }

    }

    public void cifrao(String Sentenca) {

        if (Sentenca.charAt(i) == '@') {

            err.setLinha(contAux);
            err.setErro("Erro Comentario de bloco");
            t.setErr(err);
            inicio(Sentenca);

        } else if ('$' != Sentenca.charAt(i)) {

            token += String.valueOf(Sentenca.charAt(i));
            if (Sentenca.charAt(i) == '\n') {
                cont++;
            }
            i++;
            cifrao(Sentenca);
        } else {

            t.setCodigo(11);
            t.setLinha(contAux);
            t.setToken(token);
            i++;
            inicio(Sentenca);
        }

    }
    //Char

    public void LetraAspas(String Sentenca) {

        //precisa pergunatar pra professoara, no automato qur fizemos ta que só pode letra no char
        //Não sei se podemos mudar mais
        if (Character.isLetter(Sentenca.charAt(i)) /*|| Character.isLetter(Sentenca.charAt(i))*/) {
            token += String.valueOf(Sentenca.charAt(i));
            i++;
            Aspas(Sentenca);

        }

        /* else{
            //Erro?
        }*/
    }

    public void Aspas(String Sentenca) {

        if (Sentenca.charAt(i) == '@') {

            err.setErro("Erro no nome do char");
            err.setLinha(contAux);
            t.setErr(err);

        } else if (!String.valueOf(Sentenca.charAt(i)).equals("'")) {

            token += String.valueOf(Sentenca.charAt(i));
            i++;
            Aspas(Sentenca);

        } else {
            if (token.length() > 1) {

                err.setErro("Erro no tamanho do no nome do char");
                err.setLinha(contAux);
                t.setErr(err);
            }
            t.setCodigo(8);
            t.setToken(token);
            t.setLinha(contAux);
            i++;
            inicio(Sentenca);

        }

    }

    public void Igual(String Sentenca) {

        if (Sentenca.charAt(i) == '=') {

            token += String.valueOf(Sentenca.charAt(i));
            t.setCodigo(28);
            t.setToken(token);
            t.setLinha(cont);
            i++;
            //verificar final de arquivo?
            inicio(Sentenca);
        } else {

            t.setCodigo(29);
            t.setToken(token);
            t.setLinha(cont);

            //verificar final de arquivo?
            inicio(Sentenca);
        }
    }

    public void Mais(String Sentenca) {

        if (Sentenca.charAt(i) == '+') {

            token += String.valueOf(Sentenca.charAt(i));
            t.setCodigo(34);
            t.setToken(token);
            t.setLinha(cont);
            i++;
            //verificar final de arquivo?
            inicio(Sentenca);
        } else {

            t.setCodigo(33);
            t.setToken(token);
            t.setLinha(cont);
            i++;
            //verificar final de arquivo?
            inicio(Sentenca);
        }
    }

    public void Menos(String Sentenca) {

        if (Sentenca.charAt(i) == '-') {

            token += String.valueOf(Sentenca.charAt(i));
            t.setCodigo(47);
            t.setToken(token);
            t.setLinha(cont);
            i++;
            //verificar final de arquivo?
            inicio(Sentenca);
        } else {

            t.setCodigo(46);
            t.setToken(token);
            t.setLinha(cont);
            i++;
            //verificar final de arquivo?
            inicio(Sentenca);
        }
    }

    public void MaiorOuIgual(String Sentenca) {

        if (Sentenca.charAt(i) == '>') {

            token += String.valueOf(Sentenca.charAt(i));
            t.setCodigo(25);
            t.setToken(token);
            t.setLinha(cont);
            i++;
            //verificar final de arquivo?
            inicio(Sentenca);

        } else if (Sentenca.charAt(i) == '=') {

            token += String.valueOf(Sentenca.charAt(i));
            t.setCodigo(26);
            t.setToken(token);
            t.setLinha(cont);
            i++;
            //verificar final de arquivo?
            inicio(Sentenca);
        } else {

            t.setCodigo(27);
            t.setToken(token);
            t.setLinha(cont);
            i++;
            //verificar final de arquivo?
            inicio(Sentenca);
        }
    }

    public void MenorOuIgual(String Sentenca) {

        if (Sentenca.charAt(i) == '<') {

            token += String.valueOf(Sentenca.charAt(i));
            t.setCodigo(31);
            t.setToken(token);
            t.setLinha(cont);
            i++;

        } else if (Sentenca.charAt(i) == '=') {

            token += String.valueOf(Sentenca.charAt(i));
            t.setCodigo(30);
            t.setToken(token);
            t.setLinha(cont);

            i++;
            //verificar final de arquivo?
            inicio(Sentenca);
        } else {

            //Código
            //retorna <
            t.setCodigo(32);
            t.setToken(token);
            t.setLinha(cont);

            //verificar final de arquivo?
            inicio(Sentenca);

        }
    }

    public void Diferente(String Sentenca) {

        if (Sentenca.charAt(i) == '=') {
            token += String.valueOf(Sentenca.charAt(i));
            //código
            //retorna !=
            t.setCodigo(45);
            t.setToken(token);
            t.setLinha(cont);

            i++;
            //verificar final de arquivo?
            inicio(Sentenca);
        } else {

            //código
            i++;
            //vai para o comentario de linha
            ComentarioLinha(Sentenca);
        }

    }

    public void ComentarioLinha(String Sentenca) {

        if (Sentenca.charAt(i) != '\n') {

            i++;
            ComentarioLinha(Sentenca);
        } else {

            cont++;
            i++;
            inicio(Sentenca);
        }

    }

    public void ComentarioBloco(String Sentenca) {

        if (Sentenca.charAt(i) == '@') {

            err.setLinha(cont);
            err.setErro("Erro Comentario de bloco");
            t.setErr(err);
            inicio(Sentenca);

        } else if (Sentenca.charAt(i) != ']') {

            if (Sentenca.charAt(i) == '\n') {
                cont++;
            }
            i++;
            ComentarioBloco(Sentenca);
        } else {

            i++;
            inicio(Sentenca);
        }
    }
}
