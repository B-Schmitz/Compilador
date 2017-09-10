
public class Automato {

    private TokenGetSet t;
    private  ErroGetSet err;
    private Integer i, cont;
    private String teste = "";


    public TokenGetSet getToken(String Sentenca) {

        i = 0;
        cont = 1;
         t = new TokenGetSet();
         err = new ErroGetSet();
        inicio(Sentenca, "");

        return t;
    }

    public void inicio(String Sentenca, String token) {

        token = "";
        token += String.valueOf(Sentenca.charAt(i));

        if (Sentenca.charAt(i) == ' ') {
            i++;
            inicio(Sentenca, token);
        } else if (Sentenca.charAt(i) == '\n') {

            cont++;
            i++;
            inicio(Sentenca, token);

        }
        else if(Sentenca.charAt(i) == '\t'){
        
            i++;
            inicio(Sentenca, token);
            
        }else if (Sentenca.charAt(i) == '@') {

            System.out.println("Fim");
            

        } else {

            //esse if é especifico para uma variavel
            if (Sentenca.charAt(i) == '#') {
                i++;
                //vai para o metodo LetraVar verificar se o proximo é letra
                LetraVar(Sentenca, token);

            } //esse vai verificar if, while, for, etc...
            else if (Character.isLetter(Sentenca.charAt(i))) {
                i++;
                //esse metodo vai verificar se o proximo é letra
                Letra(Sentenca, token);

            } else if (Character.isDigit(Sentenca.charAt(i))) {
                i++;
                Digit(Sentenca, token);

            } else if (Sentenca.charAt(i) == '$') {
                i++;
                cifrao(Sentenca, token);

            } else if (Sentenca.charAt(i) == '"') {
                i++;
                aspasDuplas(Sentenca, token);

            } //Precisa ver se isso funciona
            else if (String.valueOf(Sentenca.charAt(i)).equals("'")) {
                i++;
                LetraAspas(Sentenca, token);

            } else if (Sentenca.charAt(i) == '=') {
                i++;
                Igual(Sentenca, token);

            } else if (Sentenca.charAt(i) == '+') {
                i++;
                Mais(Sentenca, token);

            } else if (Sentenca.charAt(i) == '*') {

                //Ainda falta linha
                t.setToken(token);
                t.setCodigo(41);
                t.setLinha(cont);
                i++;
                //verificar final de arquivo?
                inicio(Sentenca, token);

            } else if (Sentenca.charAt(i) == '/') {

                //Ainda falta coisa
                t.setCodigo(39);
                t.setToken(token);
                t.setLinha(cont);
                i++;
                //verificar final de arquivo?
                inicio(Sentenca, token);

            } else if (Sentenca.charAt(i) == '>') {
                i++;
                MaiorOuIgual(Sentenca, token);

            } else if (Sentenca.charAt(i) == '<') {
                i++;
                MenorOuIgual(Sentenca, token);

            } else if (Sentenca.charAt(i) == '{') {

                t.setCodigo(36);
                t.setToken(token);
                t.setLinha(cont);
                i++;
                //verificar final de arquivo?
                inicio(Sentenca, token);

            } else if (Sentenca.charAt(i) == '}') {

                t.setCodigo(35);
                t.setToken(token);
                t.setLinha(cont);
                i++;
                //verificar final de arquivo?
                inicio(Sentenca, token);
            } else if (Sentenca.charAt(i) == '(') {

                t.setCodigo(43);
                t.setToken(token);
                t.setLinha(cont);
                i++;
                //verificar final de arquivo?
                inicio(Sentenca, token);
            }else if(Sentenca.charAt(i) == ')'){
                
                t.setCodigo(42);
                t.setToken(token);
                t.setLinha(cont);
                i++;
                //verificar final de arquivo?
                inicio(Sentenca, token);
                
                
            }
            else if (Sentenca.charAt(i) == ',') {

                t.setCodigo(40);
                t.setToken(token);
                t.setLinha(cont);
                i++;
                //verificar final de arquivo?
                inicio(Sentenca, token);

            } else if (Sentenca.charAt(i) == ':') {

                t.setCodigo(38);
                t.setToken(token);
                t.setLinha(cont);
                i++;
                //verificar final de arquivo?
                inicio(Sentenca, token);

            } else if (Sentenca.charAt(i) == ';') {

                t.setCodigo(37);
                t.setToken(token);
                t.setLinha(cont);
                i++;
                //verificar final de arquivo?
                inicio(Sentenca, token);

            } else if (Sentenca.charAt(i) == '-') {
                i++;
                Menos(Sentenca, token);
            } else if (Sentenca.charAt(i) == '!') {

                i++;
                Difernte(Sentenca, token);

            } else if (Sentenca.charAt(i) == '[') {

                i++;
                ComentarioBloco(Sentenca, token);

            }
        }
    }

    //verifica letra de uma possivel variavel
    //Obs: Acredito que precise ser separado a parte da variavel dos outros. Ex: while, if, etc...
    public void LetraVar(String Sentenca, String token) {

        if (Character.isLetter(Sentenca.charAt(i))) {
            token += String.valueOf(Sentenca.charAt(i));

            i++;
            LetraDigitVar(Sentenca, token);
        } else {

            err.setLinha(cont);
            err.setErro("Declaração de variavel errada");
            t.setErr(err);
            i++;
            brancoString(Sentenca, token);
            //inicio(Sentenca, token);
            
        }

           
    }

    //teste
    public void brancoString(String Sentenca, String token){
        
        teste = String.valueOf(Sentenca.charAt(i));
        
      if(Sentenca.charAt(i) == '\n'){
           
           cont++;
           i++;
           inicio(Sentenca, token);
       }
      else if(Sentenca.charAt(i) != ' '){
           
           i++;
           brancoString(Sentenca, token);
           
       } 
       else{
           
           inicio(Sentenca, token);
           
       }
        
    }
    public void LetraDigitVar(String Sentenca, String token) {
        //Não sei se isso é para estar dentro do if

        if (Character.isDigit(Sentenca.charAt(i)) || Character.isLetter(Sentenca.charAt(i))) {
            token += String.valueOf(Sentenca.charAt(i));
            i++;
            LetraDigitVar(Sentenca, token);
        } else {

            //código
            t.setCodigo(7);
            t.setToken(token);
            t.setLinha(cont);
            //verificar final de arquivo?

            inicio(Sentenca, token);
        }

    }

    //Aqui não sei se ta certo, apenas fiz como tava o nosso automato
    //mas nessa parte ele verifica se é letra
    public void Letra(String Sentenca, String token) {

        if (Character.isLetter(Sentenca.charAt(i))) {

            token += String.valueOf(Sentenca.charAt(i));
            //E esse é o problema, o método a baixo vai verificar se o proximo é letra ou numero
            //mas só faria sentido se fosse uma variavel Ex; n2; mas se chegar até aqui ja não pode 
            //ser uma variavel, mas fiz igual tava no automato que entregamos
            i++;
            LetraDigit(Sentenca, token);

        } else {

            tokens(Sentenca,token);
        }

    }

    public void LetraDigit(String Sentenca, String token) {

        if (Character.isDigit(Sentenca.charAt(i)) || Character.isLetter(Sentenca.charAt(i))) {

            token += String.valueOf(Sentenca.charAt(i));
            i++;
            LetraDigit(Sentenca, token);
        } else {

            tokens(Sentenca,token);
        }

        inicio(Sentenca, token);
    }

    public void tokens(String Sentenca, String token) {

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

        }
        else{
            err.setLinha(cont);
            err.setErro("Declaração de variavel errada");
            t.setErr(err);
            inicio(Sentenca, token);
           
        }

    }

    public void Digit(String Sentenca, String token) {

        if (Character.isDigit(Sentenca.charAt(i))) {
            token += String.valueOf(Sentenca.charAt(i));
            i++;
            Digit(Sentenca, token);

        } else if (Sentenca.charAt(i) == ',') {
            token += String.valueOf(Sentenca.charAt(i));
            i++;
            DigitFloat(Sentenca, token);
        } else {
            
            t.setCodigo(5);
            t.setToken(token);
            t.setLinha(cont);
            //verificar final de arquivo?
            inicio(Sentenca, token);
        }

    }

    public void DigitFloat(String Sentenca, String token) {

        if (Character.isDigit(Sentenca.charAt(i))) {

            token += String.valueOf(Sentenca.charAt(i));
            DigitFloat(Sentenca, token);
        } else {

            t.setCodigo(6);
            t.setToken(token);
            t.setLinha(cont);
            i++;
            //verificar final de arquivo?
            inicio(Sentenca, token);
        }

    }

    public void aspasDuplas(String Sentenca, String token) {

        if ('"' == Sentenca.charAt(i)) {

            token += String.valueOf(Sentenca.charAt(i));
            t.setCodigo(9);
            t.setToken(token);
            t.setLinha(cont);
            i++;
            //verificar final de arquivo?
            inicio(Sentenca, token);
        } else if (Sentenca.charAt(i) == '@') {
//???????????????????
        } else {
            i++;
            inicio(Sentenca, token);
        }

    }

    public void cifrao(String Sentenca, String token) {

        if ('$' != Sentenca.charAt(i)) {
            token += String.valueOf(Sentenca.charAt(i));
            i++;
            cifrao(Sentenca, token);
        } else {

            i++;
            inicio(Sentenca, token);
        }

    }
    //Char

    public void LetraAspas(String Sentenca, String token) {

        if (Character.isLetter(Sentenca.charAt(i))) {
            token += String.valueOf(Sentenca.charAt(i));
            i++;
            Aspas(Sentenca, token);

        } else {

            //Erro
        }

    }

    public void Aspas(String Sentenca, String token) {

        if (String.valueOf(Sentenca.charAt(i)).equals("'")) {

            token += String.valueOf(Sentenca.charAt(i));
            t.setCodigo(8);
            t.setToken(token);
            t.setLinha(cont);
            i++;
            //verificar final de arquivo?
            inicio(Sentenca, token);

        } else {

            //Erro
        }

    }

    public void Igual(String Sentenca, String token) {

        if (Sentenca.charAt(i) == '=') {

            token += String.valueOf(Sentenca.charAt(i));
            t.setCodigo(28);
            t.setToken(token);
            t.setLinha(cont);
            i++;
            //verificar final de arquivo?
            inicio(Sentenca, token);
        } else {

            t.setCodigo(29);
            t.setToken(token);
            t.setLinha(cont);
            
            //verificar final de arquivo?
            inicio(Sentenca, token);
        }
    }

    public void Mais(String Sentenca, String token) {

        if (Sentenca.charAt(i) == '+') {

            token += String.valueOf(Sentenca.charAt(i));
            t.setCodigo(34);
            t.setToken(token);
            t.setLinha(cont);
            i++;
            //verificar final de arquivo?
            inicio(Sentenca, token);
        } else {

            t.setCodigo(33);
            t.setToken(token);
            t.setLinha(cont);
            i++;
            //verificar final de arquivo?
            inicio(Sentenca, token);
        }
    }

    public void Menos(String Sentenca, String token) {

        if (Sentenca.charAt(i) == '-') {

            token += String.valueOf(Sentenca.charAt(i));
            t.setCodigo(47);
            t.setToken(token);
            t.setLinha(cont);
            i++;
            //verificar final de arquivo?
            inicio(Sentenca, token);
        } else {

            t.setCodigo(46);
            t.setToken(token);
            t.setLinha(cont);
            i++;
            //verificar final de arquivo?
            inicio(Sentenca, token);
        }
    }

    public void MaiorOuIgual(String Sentenca, String token) {

        if (Sentenca.charAt(i) == '>') {

            token += String.valueOf(Sentenca.charAt(i));
            t.setCodigo(25);
            t.setToken(token);
            t.setLinha(cont);
            i++;
            //verificar final de arquivo?
            inicio(Sentenca, token);

        } else if (Sentenca.charAt(i) == '=') {

            token += String.valueOf(Sentenca.charAt(i));
            t.setCodigo(26);
            t.setToken(token);
            t.setLinha(cont);
            i++;
            //verificar final de arquivo?
            inicio(Sentenca, token);
        } else {

            t.setCodigo(27);
            t.setToken(token);
            t.setLinha(cont);
            i++;
            //verificar final de arquivo?
            inicio(Sentenca, token);
        }
    }

    public void MenorOuIgual(String Sentenca, String token) {

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
            inicio(Sentenca, token);
        } else {

            //Código
            //retorna <
            t.setCodigo(32);
            t.setToken(token);
            t.setLinha(cont);

            
            //verificar final de arquivo?
            inicio(Sentenca, token);

        }
    }

    public void Difernte(String Sentenca, String token) {

        if (Sentenca.charAt(i) == '=') {
            token += String.valueOf(Sentenca.charAt(i));
            //código
            //retorna !=
            t.setCodigo(45);
            t.setToken(token);
            t.setLinha(cont);

            i++;
            //verificar final de arquivo?
            inicio(Sentenca, token);
        } else {

            //código
            i++;
            //vai para o comentario de linha
            ComentarioLinha(Sentenca, token);
        }

    }

    public void ComentarioLinha(String Sentenca, String token) {

        if (Sentenca.charAt(i) != '\n') {

            i++;
            ComentarioLinha(Sentenca, token);
        } else {

            cont++;
            i++;
            inicio(Sentenca, token);
        }

    }

    public void ComentarioBloco(String Sentenca, String token) {

        if (Sentenca.charAt(i) != ']') {

            if (Sentenca.charAt(i) == '\n') {
                cont++;
            }
            i++;
            ComentarioBloco(Sentenca, token);
        } else {

            //código
            i++;
            inicio(Sentenca, token);
        }

    }

}
