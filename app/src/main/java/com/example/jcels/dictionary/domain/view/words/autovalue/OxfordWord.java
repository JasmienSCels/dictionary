package com.example.jcels.dictionary.domain.view.words.autovalue;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Jasmien Cels on 29/01/2018.
 *
 * The purpose of this list is to
 */

@AutoValue
public abstract class OxfordWord {

    @SerializedName("metadata")
    public abstract String metadata();

    @SerializedName("results")
    public abstract OxfordWordResult result();


    public static TypeAdapter<OxfordWord> typeAdapter(Gson gson) {
        return new AutoValue_OxfordWord.GsonTypeAdapter(gson);
    }
}
