package by.epam.intro.task2.logic;

import by.epam.intro.task2.bean.Sentence;
import by.epam.intro.task2.bean.Word;

public class SentenceLogic {

    public String getSentenceToString(Sentence sentence) {
        String str = "";
        for (Word word : sentence.getWordList()) {
            str +=  word.getWord() + " ";
        }
        return str;
    }
}
