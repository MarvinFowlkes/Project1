package com.company.summative1FowlkesMarvin.model;

import java.util.Objects;

public class eight_ball { private String question;
private String answer;
private int id;
public eight_ball(){

}
public eight_ball (String answer, int id){
    this.answer=answer;
}

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        eight_ball that = (eight_ball) o;
        return id == that.id && Objects.equals(question, that.question) && Objects.equals(answer, that.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question, answer, id);
    }
}


