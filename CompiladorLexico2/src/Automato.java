
public class Automato {
    
    TokenGetSet t;
    
    public Automato() {
        
        t = new TokenGetSet();
        
    }
    
    public void inicio(String Sentenca, int i, String token) {

         token += String.valueOf(Sentenca.charAt(i));
        //esse if é especifico para uma variavel
        if (Sentenca.charAt(i) == '#') {

            //vai para o metodo LetraVar verificar se o proximo é letra
            LetraVar(Sentenca, i++, token);
            
        } //esse vai verificar if, while, for, etc...
        else if (Character.isLetter(Sentenca.charAt(i))) {

            //esse metodo vai verificar se o proximo é letra
            Letra(Sentenca, i++, token);
            
        } else if (Character.isDigit(Sentenca.charAt(i))) {
            
            Digit(Sentenca, i++, token);
            
        } else if (Sentenca.charAt(i) == '$') {
            
            cifrao(Sentenca, i++, token);
            
        } else if (Sentenca.charAt(i) == '"') {
            
            aspasDuplas(Sentenca, i, token);
            
        } //Precisa ver se isso funciona
        else if (String.valueOf(Sentenca.charAt(i)).equals("'")) {
            
            LetraAspas(Sentenca, i++, token);
            
        } else if (Sentenca.charAt(i) == '=') {
            
            Igual(Sentenca, i++, token);
            
        } else if (Sentenca.charAt(i) == '+') {
            
            Mais(Sentenca, i++, token);
            
        } else if (Sentenca.charAt(i) == '*') {

            //Ainda falta linha
            t.setToken(token);
            t.setCodigo(41);
            
        } else if (Sentenca.charAt(i) == '/') {

            //Ainda falta coisa
            t.setCodigo(39);
            t.setToken(token);
            
        } else if (Sentenca.charAt(i) == '>') {
            
            MaiorOuIgual(Sentenca, i++, token);
            
        } else if (Sentenca.charAt(i++) == '<') {
            
            MenorOuIgual(Sentenca, i++, token);
            
        } else if (Sentenca.charAt(i) == '{') {
            
            t.setCodigo(36);
            t.setToken(token);
            
        } else if (Sentenca.charAt(i) == '}') {
            
            t.setCodigo(35);
            t.setToken(token);
        } else if (Sentenca.charAt(i) == '(') {
            
            t.setCodigo(43);
            t.setToken(token);
        } else if (Sentenca.charAt(i) == ',') {
            
            t.setCodigo(40);
            t.setToken(token);
            
        } else if (Sentenca.charAt(i) == ':') {
            
            t.setCodigo(38);
            t.setToken(token);
            
        } else if (Sentenca.charAt(i) == ';') {
            
            t.setCodigo(37);
            t.setToken(token);
            
        } else if (Sentenca.charAt(i) == '-') {

            Menos(Sentenca, i++, token);
        } else if (Sentenca.charAt(i) == '!') {
            
            Difernte(Sentenca, i, token);
            
        } else if (Sentenca.charAt(i) == '[') {

            ComentarioBloco(Sentenca, i++, token);
            
        }
        
    }

    //verifica letra de uma possivel variavel
    //Obs: Acredito que precise ser separado a parte da variavel dos outros. Ex: while, if, etc...
    public void LetraVar(String Sentenca, int i, String token) {
        
        if (Character.isLetter(Sentenca.charAt(i))) {
            
            LetraDigitVar(Sentenca, i++, token);
        } else {

            //código
        }
        
    }
    
    public void LetraDigitVar(String Sentenca, int i, String token) {
        
        if (Character.isDigit(Sentenca.charAt(i)) || Character.isLetter(Sentenca.charAt(i))) {
            
            LetraDigitVar(Sentenca, i++, token);
        } else {

            //código
        }
        
    }

    //Aqui não sei se ta certo, apenas fiz como tava o nosso automato
    //mas nessa parte ele verifica se é letra
    public void Letra(String Sentenca, int i, String token) {
        
        if (Character.isLetter(Sentenca.charAt(i))) {

            //E esse é o problema, o método a baixo vai verificar se o proximo é letra ou numero
            //mas só faria sentido se fosse uma variavel Ex; n2; mas se chegar até aqui ja não pode 
            //ser uma variavel, mas fiz igual tava no automato que entregamos
            LetraDigit(Sentenca, i++, token);
            
        } else {

            //código
        }
        
    }
    
    public void LetraDigit(String Sentenca, int i, String token) {
        
        if (Character.isDigit(Sentenca.charAt(i)) || Character.isLetter(Sentenca.charAt(i))) {
            
            LetraDigit(Sentenca, i++, token);
        } else {

            //código
        }
        
    }
    
    public void Digit(String Sentenca, int i, String token) {
        
        if (Character.isDigit(Sentenca.charAt(i))) {
            
            Digit(Sentenca, i++, token);
            
        } else if (Sentenca.charAt(i) == ',') {
            
            DigitFloat(Sentenca, i++, token);
        } else {
            
            t.setCodigo(5);
            t.setToken(token);
        }
        
    }
    
    public void DigitFloat(String Sentenca, int i, String token) {
        
        if (Character.isDigit(Sentenca.charAt(i))) {
            
            DigitFloat(Sentenca, i++, token);
        } else {
            
            t.setCodigo(6);
            t.setToken(token);
        }
        
    }
    
    public void aspasDuplas(String Sentenca, int i, String token) {
        
        if ('"' == Sentenca.charAt(i)) {
            
            t.setCodigo(9);
            t.setToken(token);
        } else if (Sentenca.charAt(i) == '@') {
            
        } else {
            
            inicio(Sentenca, i++, token);
        }
        
    }
    
    public void cifrao(String Sentenca, int i, String token) {
        
        if ('$' != Sentenca.charAt(i)) {
            
            cifrao(Sentenca, i++, token);
        } else {

            //código
        }
        
    }
    //Char

    public void LetraAspas(String Sentenca, int i, String token) {
        
        if (Character.isLetter(Sentenca.charAt(i))) {
            
            Aspas(Sentenca, i++, token);
            
        } else {

            //Erro
        }
        
    }
    
    public void Aspas(String Sentenca, int i, String token) {
        
        if (String.valueOf(Sentenca.charAt(i)).equals("'")) {

            t.setCodigo(8);
            t.setToken(token);
            
        } else {

            //Erro
          
        }
        
    }
    
    public void Igual(String Sentenca, int i, String token) {
        
        if (Sentenca.charAt(i) == '=') {

           
            t.setCodigo(28);
            t.setToken(token);
        } else {

            t.setCodigo(29);
            t.setToken(token);
        }
    }
    
    public void Mais(String Sentenca, int i, String token) {
        
        if (Sentenca.charAt(i) == '+') {

            
            t.setCodigo(34);
            t.setToken(token);
        } else {

            t.setCodigo(33);
            t.setToken(token);
        }
    }
    
    public void Menos(String Sentenca, int i, String token) {
        
        if (Sentenca.charAt(i) == '-') {

            t.setCodigo(47);
            t.setToken(token);
        } else {

            t.setCodigo(46);
            t.setToken(token);
        }
    }
    
    public void MaiorOuIgual(String Sentenca, int i, String token) {
        
        if (Sentenca.charAt(i) == '>') {

            //código
            //Retorna >>
        } else if (Sentenca.charAt(i) == '=') {

            //código
            //retorna >=
        } else {

            //código
        }
    }
    
    public void MenorOuIgual(String Sentenca, int i, String token) {
        
        if (Sentenca.charAt(i) == '<') {

            //código
            //retorna <<
        } else if (Sentenca.charAt(i) == '=') {

            //código
            //retorna <=
        }
    }
    
    public void Difernte(String Sentenca, int i, String token) {
        
        if (Sentenca.charAt(i) == '=') {

            //código
            //retorna !=
            //codigo 45
        } else {

            //código
            //vai para o comentario de linha
            ComentarioLinha(Sentenca, i++, token);
        }
        
    }
    
    public void ComentarioLinha(String Sentenca, int i, String token) {
        
        if (Sentenca.charAt(i) != '\n') {
            
            ComentarioLinha(Sentenca, i++, token);
        } else {

            //código
        }
        
    }
    
    public void ComentarioBloco(String Sentenca, int i, String token) {
        
        if (Sentenca.charAt(i) != ']') {
            
            ComentarioBloco(Sentenca, i++, token);
        } else {

            //código
        }
        
    }
    
}
