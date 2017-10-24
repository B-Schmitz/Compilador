
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class BloqFimArquivo extends PlainDocument {

    @Override
    public void insertString(int offset, String str, javax.swing.text.AttributeSet attr)
            throws BadLocationException {

        super.insertString(offset, str.replaceAll("[@]", ""), attr);

    }

}
