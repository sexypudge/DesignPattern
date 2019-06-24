package AdapterPattern;

public class TranslationAdapter implements VietnameseTarget {

    private JapaneseAdaptee japaneseAdaptee;

    public TranslationAdapter(JapaneseAdaptee adaptee) {
        this.japaneseAdaptee = adaptee;
    }

    public void send(String words) {
        japaneseAdaptee.receive(this.translate(words));
    }

    private String translate(String words) {
        return words;
    }
}
