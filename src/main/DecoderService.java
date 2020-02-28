package main;


public class DecoderService {
    String alphabet = "аАбБвВгГдДеЕёЁжЖзЗиИйЙкКлЛмМнНоОпПрРсСтТуУфФхХцЦчЧшШщЩъЪыЫьЬэЭюЮяЯ";

    String getDecodedText(String text, int key) {
        StringBuilder decodedText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                decodedText.append(alphabet.charAt((alphabet.indexOf(text.charAt(i)) + 2 * key) % 66));
            } else {
                decodedText.append(text.charAt(i));
            }
        }
        return decodedText.toString();
    }
}