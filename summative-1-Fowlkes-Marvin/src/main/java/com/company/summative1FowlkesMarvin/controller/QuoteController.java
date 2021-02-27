package com.company.summative1FowlkesMarvin.controller;

import com.company.summative1FowlkesMarvin.model.quote;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuoteController {
    private List<quote> quoteList;
    private static int idCounter=1;

    public QuoteController () {
        quoteList.add(new quote(idCounter++, "Behold The Green and Gold", "Norfolk State University"))
        quoteList.add(new quote(idCounter++, "The greatest glory in living lies not in never falling, but in rising every time we fall", "Nelson Mandela"))
        quoteList.add(new quote(idCounter++, "If life were predictable it would cease to be life, and be without flavor", "Eleanor Roosevelt"))
        quoteList.add(new quote(idCounter++, "Life is what happens when you're busy making other plans", "John Lennon"))
        quoteList.add(new quote(idCounter++, "Spread love everywhere you go. Let no one ever come to you without leaving happier", "Mother Teresa"))
        quoteList.add(new quote(idCounter++, "Always remember that you are absolutely unique. Just like everyone else", "Margaret Mead"))
        quoteList.add(new quote(idCounter++, "The future belongs to those who believe in the beauty of their dreams", "Eleanor Roosevelt"))
        quoteList.add(new quote(idCounter++, "Tell me and I forget. Teach me and I remember. Involve me and I learn", "Benjamin Franklin"))
        quoteList.add(new quote(idCounter++, "Whoever is happy will make others happy too", "Anne Frank"))
        quoteList.add(new quote(idCounter++, "Don't judge each day by the harvest you reap but by the seeds that you plant", "Robert Louis Stevenson"))
    }

}
