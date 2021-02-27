package com.company.summative1FowlkesMarvin.model;

public class word { private int id; private String word; private String definition;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public word(int id, String word, String definition) {
        this.id = id;
        this.word = word;
        this.definition = definition;
    }
}
