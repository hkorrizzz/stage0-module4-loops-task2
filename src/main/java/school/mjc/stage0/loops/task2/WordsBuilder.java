package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        StringBuilder phrase = new StringBuilder();
        int i = 0;
        while (i < chars.length) {
            phrase.append(chars[i]);
            i++;
        }
        System.out.println(phrase.toString());

    }
}
