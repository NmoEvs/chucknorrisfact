package com.chezouam.chucknorrisfact.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FactServiceImpl implements FactService {

    private ChuckNorrisQuotes chuckNorrisQuotes;

    @Autowired
    public FactServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getRandomJoke(){

        return   chuckNorrisQuotes.getRandomQuote();
    }
}
