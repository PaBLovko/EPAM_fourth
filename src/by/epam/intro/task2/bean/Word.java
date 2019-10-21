package by.epam.intro.task2.bean;

import java.util.Objects;

public class Word {
    private String word;

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word){ this.word = word; }

    @Override
    public int hashCode(){ return Objects.hash(word); }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return Objects.equals(this.word, word.word);
    }

    @Override
    public String toString(){
        return "Word{" +
                "word =" + word +
                '}';
    }
}

