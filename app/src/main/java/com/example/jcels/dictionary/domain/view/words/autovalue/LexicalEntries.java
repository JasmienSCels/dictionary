package com.example.jcels.dictionary.domain.view.words.autovalue;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Jasmien Cels  on 29/01/2018.
 */

@AutoValue
public abstract class LexicalEntries {

    @SerializedName("grammaticalFeatures")
    public abstract GrammaticalFeatures grammaticalFeatures();

    @SerializedName("inflectionOf")
    public abstract InflectionOf inflectionOf();

    @SerializedName("language")
    public abstract String language();

    @SerializedName("lexicalCategory")
    public abstract String lexicalCategory();

    @SerializedName("text")
    public abstract String text();


    public static TypeAdapter<LexicalEntries> typeAdapter(Gson gson) {
        return new AutoValue_LexicalEntries.GsonTypeAdapter(gson);
    }


}
