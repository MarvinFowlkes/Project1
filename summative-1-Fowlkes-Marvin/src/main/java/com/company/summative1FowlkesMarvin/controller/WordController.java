package com.company.summative1FowlkesMarvin.controller;

import com.company.summative1FowlkesMarvin.model.word;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WordController {
    private List<word> wordList;
    private static int idCounter=1;

    public WordController () {
        wordList.add(new word(idCounter++, "diamond", "a precious stone consisting of a clear and colorless crystalline form of pure carbon, the hardest naturally occurring substance"))
        wordList.add(new word(idCounter++, "recant", "take back as being false give up"))
        wordList.add(new word(idCounter++, "blatant", "noisy and rough"))
        wordList.add(new word(idCounter++, "gorge", "eat greedily/narrow opening with a stream"))
        wordList.add(new word(idCounter++, "attenuate", "make thin. weaken enervate"))
        wordList.add(new word(idCounter++, "inimical", "harmful or friendly"))
        wordList.add(new word(idCounter++, "barista", "a person whose job involves preparing and serving different types of coffee"))
        wordList.add(new word(idCounter++, "bitcoin ", "an online payment system that does not require an intermediary"))
        wordList.add(new word(idCounter++, "blog", "a regularly updated website or web page, typically one run by an individual or small group"))
        wordList.add(new word(idCounter++, "regale", "to delight or entertain to feast"))
    }

}
