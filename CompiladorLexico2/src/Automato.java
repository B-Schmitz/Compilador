
public class Automato {

    public void inicio(String Sentenca, int i, String token) {

        if (Sentenca.charAt(i) == '#') {

            LetraVar(Sentenca, i, token);

        } 
        
        
        else if (Character.isLetter(Sentenca.charAt(i))) {

            Letra(Sentenca, i, token);

        } 
        
        
        else if (Character.isDigit(Sentenca.charAt(i))) {

            Digit(Sentenca, i, token);

        }
        
        
        else if (Sentenca.charAt(i) == '$') {

            cifrao(Sentenca, i, token);

        } 
        
        
        else if (Sentenca.charAt(i) == '"') {

            aspasDuplas(Sentenca, i, token);

        } 

         //Precisa ver se isso funciona
        else if (String.valueOf(Sentenca.charAt(i)).equals("'")) {

            LetraAspas(Sentenca, i, token);

        } 
        
        
        else if (Sentenca.charAt(i) == '=') {
          
            Igual(Sentenca, i, token);
            
        } 
        else if (Sentenca.charAt(i) == '+') {

            Mais(Sentenca, i, token);
            
        } 
        else if (Sentenca.charAt(i) == '*') {

            //código
            //retorna *
            
        } 
        else if (Sentenca.charAt(i) == '/') {

            //códgo
            //retorna /
            
        }
        else if (Sentenca.charAt(i) == '>') {

            MaiorOuIgual(Sentenca, i, token);
            
        } 
        else if (Sentenca.charAt(i) == '<') {

            MenorOuIgual(Sentenca, i, token);
            
        } 
        else if (Sentenca.charAt(i) == '{') {

            //código
        } else if (Sentenca.charAt(i) == '}') {

            //código
        } else if (Sentenca.charAt(i) == '(') {

            //código
        } else if (Sentenca.charAt(i) == ',') {

            //código
        } else if (Sentenca.charAt(i) == ':') {

            //código
        } else if (Sentenca.charAt(i) == ';') {

            //código
        } else if (Sentenca.charAt(i) == '-') {

            //código
        } else if (Sentenca.charAt(i) == '!') {

            //código
        } else if (Sentenca.charAt(i) == '[') {

            //código
        }

    }

    //verifica letra de uma possivel variavel
    //Obs: Acredito que precise ser separado a parte da variavel dos outros. Ex: while, if, etc...
    public void LetraVar(String Sentenca, int i, String token) {

        if (Character.isLetter(Sentenca.charAt(i))) {

            LetraDigitVar(Sentenca, i, token);
        } else {

            //código
        }

    }

    public void LetraDigitVar(String Sentenca, int i, String token) {

        if (Character.isDigit(Sentenca.charAt(i)) || Character.isLetter(Sentenca.charAt(i))) {

            LetraDigitVar(Sentenca, i, token);
        } else {

            //código
        }

    }

    public void Letra(String Sentenca, int i, String token) {

        if (Character.isLetter(Sentenca.charAt(i))) {

            LetraDigit(Sentenca, i, token);

        } else {

            //código
        }

    }

    public void LetraDigit(String Sentenca, int i, String token) {

        if (Character.isDigit(Sentenca.charAt(i)) || Character.isLetter(Sentenca.charAt(i))) {

            //código
        } else {

            //código
        }

    }

    public void Digit(String Sentenca, int i, String token) {

        if (Character.isDigit(Sentenca.charAt(i))) {

            Digit(Sentenca, i, token);
            
        } else if (Sentenca.charAt(i) == ',') {

            DigitFloat(Sentenca, i, token);
        } else {

            //código
        }

    }

    public void DigitFloat(String Sentenca, int i, String token) {

        if (Character.isDigit(Sentenca.charAt(i))) {

            //código
        } else {

            //código
        }

    }

    public void aspasDuplas(String Sentenca, int i, String token) {

        if ('"' != Sentenca.charAt(i)) {

            aspasDuplas(Sentenca, i, token);
        } else {

            //código
        }

    }

    public void cifrao(String Sentenca, int i, String token) {

        if ('$' != Sentenca.charAt(i)) {

            cifrao(Sentenca, i, token);
        } else {

            //código
        }

    }
    //Char

    public void LetraAspas(String Sentenca, int i, String token) {

        if (Character.isLetter(Sentenca.charAt(i))) {

            Aspas(Sentenca, i, token);
            
        } else {

            //código
        }

    }

    public void Aspas(String Sentenca, int i, String token) {

        if (String.valueOf(Sentenca.charAt(i)).equals("'")) {

            
            //código
            
        } else {

            //código
        }

    }

    public void Igual(String Sentenca, int i, String token) {

        if (Sentenca.charAt(i) == '=') {

            //código
            //Retorna ==
            
        } else {

            //código
            //retorna =
        }
    }

    public void Mais(String Sentenca, int i, String token) {

        if (Sentenca.charAt(i) == '+') {

            //código
            //retorna ++
        } else {

            //código
            //retorna +
        }
    }

    public void Menos(String Sentenca, int i, String token) {

        if (Sentenca.charAt(i) == '-') {

            //código
        } else {

            //código
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
            ComentarioLinha(Sentenca, i, token);
        }

    }

    public void ComentarioLinha(String Sentenca, int i, String token) {

        if (Sentenca.charAt(i) != '\n') {

            ComentarioLinha(Sentenca, i, token);
        } else {

            //código
        }

    }

    public void ComentarioBloco(String Sentenca, int i, String token) {

        if (Sentenca.charAt(i) != ']') {

            ComentarioBloco(Sentenca, i, token);
        } else {

            //código
        }

    }

}
