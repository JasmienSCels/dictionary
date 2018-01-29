package com.example.jcels.dictionary.domain.view.words;

import com.example.jcels.dictionary.domain.view.words.autovalue.OxfordWord;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Jasmien Cels on 29/01/2018.
 */

public interface OxfordDictionaryApi {

    //TODO: find the correct api url call
    @GET("/api/words")
    Call<List<OxfordWord>> getOxfordWord();

}
