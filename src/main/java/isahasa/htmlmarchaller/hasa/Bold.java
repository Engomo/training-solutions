package isahasa.htmlmarchaller.hasa;

import isahasa.htmlmarchaller.TextSource;

public class Bold extends TextDecorator{

   private TextSource textSource;

    public Bold(TextSource textSource) {
        super(textSource);
    }

    @Override
    public String getPlainText() {
        return "<b>" + getTextSource().getPlainText() + "</b>";
    }
}
