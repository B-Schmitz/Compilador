
public class Automato {

    public void inicio(String texto, int i) {

        if (texto.charAt(i) == '#') {

            //código
        } else if (Character.isLetter(texto.charAt(i))) {

            //código
        } else if (Character.isDigit(texto.charAt(i))) {

            //código
        } else if (texto.charAt(i) == '$') {

            //código
        } else if (texto.charAt(i) == '"') {

            //código
        } //Precisa ver se isso funciona
        else if (String.valueOf(texto.charAt(i)).equals("'")) {

            //código
        } else if (texto.charAt(i) == '=') {

            //código
        } else if (texto.charAt(i) == '+') {

            //código
        } else if (texto.charAt(i) == '*') {

            //código
        } else if (texto.charAt(i) == '/') {

            //códgo
        } else if (texto.charAt(i) == '>') {

            //código
        } else if (texto.charAt(i) == '<') {

            //código
        } else if (texto.charAt(i) == '{') {

            //código
        } else if (texto.charAt(i) == '}') {

            //código
        } else if (texto.charAt(i) == '(') {

            //código
        } else if (texto.charAt(i) == ',') {

            //código
        } else if (texto.charAt(i) == ':') {

            //código
        } else if (texto.charAt(i) == ';') {

            //código
        } else if (texto.charAt(i) == '-') {

            //código
        } else if (texto.charAt(i) == '!') {

            //código
        }
        
        else if(texto.charAt(i) == '['){
            
            //código
            
        }

    }

    //verifica letra de uma possivel variavel
    //Obs: Acredito que precise ser separado a parte da variavel dos outros. Ex: while, if, etc...
    public void LetraVar(String texto, int i) {

        if (Character.isLetter(texto.charAt(i))) {

            //código
        } else {

            //código
        }

    }

    public void LetraDigitVar(String texto, int i) {

        if (Character.isDigit(texto.charAt(i)) || Character.isLetter(texto.charAt(i))) {

            //código
        } else {

            //código
        }

    }

    public void LetraID(String texto, int i) {

        if (Character.isLetter(texto.charAt(i))) {

            //código
        } else {

            //código
        }

    }

    public void LetraDigitID(String texto, int i) {

        if (Character.isDigit(texto.charAt(i)) || Character.isLetter(texto.charAt(i))) {

            //código
        } else {

            //código
        }

    }

    public void Digit(String texto, int i) {

        if (Character.isDigit(texto.charAt(i))) {

            //código
        } else if (texto.charAt(i) == ',') {

            //código
        } else {

            //código
        }

    }

    public void DigitFloat(String texto, int i) {

        if (Character.isDigit(texto.charAt(i))) {

            //código
        } else {

            //código
        }

    }

    public void aspasDuplas(String texto, int i) {

        if (texto.charAt(i) == '"') {

            //código
        } else {

            //código
        }

    }

    public void cifrao(String texto, int i) {

        if (texto.charAt(i) == '$') {

            //código
        } else {

            //código
        }

    }
    //Char

    public void LetraAspas(String texto, int i) {

        if (Character.isLetter(texto.charAt(i))) {

            //código
        } else {

            //código
        }

    }

    public void Aspas(String texto, int i) {

        if (String.valueOf(texto.charAt(i)).equals("'")) {

            //código
        } else {

            //código
        }

    }

    public void Igual(String texto, int i) {

        if (texto.charAt(i) == '=') {

            //código
        } else {

            //código
        }
    }

    public void Mais(String texto, int i) {

        if (texto.charAt(i) == '+') {

            //código
        } else {

            //código
        }
    }

    public void Menos(String texto, int i) {

        if (texto.charAt(i) == '-') {

            //código
        } else {

            //código
        }
    }

    public void MaiorOuIgual(String texto, int i) {

        if (texto.charAt(i) == '>') {

            //código
        } else if (texto.charAt(i) == '=') {

            //código
        } else {

            //código
        }
    }

    public void MenorOuIgual(String texto, int i) {

        if (texto.charAt(i) == '<') {

            //código
        } else if (texto.charAt(i) == '=') {

            //código
        }
    }


public void Difernte(String texto, int i){
   
    if(texto.charAt(i) == '='){
        
        //código
        
    }
    else{
        
        //código
        //vai para o comentario de linha
        
    }
    
}

public void ComentarioLinha(String texto, int i){
    
    if(texto.charAt(i) != '\n'){
        
        //código
        
    }
    else{
        
        //código
        
    }
    
}

public void ComentarioBloco(String texto, int i){
    
  if(texto.charAt(i) == ']')  {
      
      //código
      
  }
  else{
      
      //código
      
  }
    
}


}
