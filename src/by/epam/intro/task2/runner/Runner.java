package by.epam.intro.task2.runner;

import by.epam.intro.task2.bean.Sentence;
import by.epam.intro.task2.bean.Text;
import by.epam.intro.task2.bean.Word;
import by.epam.intro.task2.logic.TextLogic;

import java.util.ArrayList;
import java.util.Collections;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Word> wordArrayList = new ArrayList<>();
        wordArrayList.add(new Word("quote's"));
        wordArrayList.add(new Word("Les"));
        wordArrayList.add(new Word("Brawn"));
        Sentence sentence = new Sentence(wordArrayList);
        ArrayList<Sentence> sentenceArrayList = new ArrayList<>();
        sentenceArrayList.add(sentence);
        sentenceArrayList.add(sentence);
        sentenceArrayList.add(sentence);
        Text text = new Text("Pablo", sentenceArrayList);
        TextLogic textLogic = new TextLogic();
        textLogic.addSentence(text, new Sentence(new ArrayList<>(Collections.singleton(new Word("Pablo")))));
        System.out.println(text.getHeader());
        System.out.println(textLogic.getTextToString(text));
    }
}