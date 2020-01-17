package main;


public class DecoderService {
    String alphabet=new String("аАбБвВгГдДеЕёЁжЖзЗиИйЙкКлЛмМнНоОпПрРсСтТуУфФхХцЦчЧшШщЩъЪыЫьЬэЭюЮяЯ");

    String getDecodedText(String text, int key){
        String decodedText = new String("");
        for (int i=0; i<text.length();i++){
            if (Character.isLetter(text.charAt(i))){
                decodedText+= alphabet.charAt((alphabet.indexOf(text.charAt(i))+2*key)%66);
            }
            else {
                decodedText+=text.charAt(i);
            }
        }
        return decodedText;
    }
}