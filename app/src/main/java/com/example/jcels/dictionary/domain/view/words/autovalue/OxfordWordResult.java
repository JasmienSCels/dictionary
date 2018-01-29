package com.example.jcels.dictionary.domain.view.words.autovalue;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by jcels on 29/01/2018.
 */

@AutoValue
public abstract class OxfordWordResult {

    @SerializedName("id")
    public abstract String id();

    @SerializedName("language")
    public abstract String language();

    @SerializedName("lexicalEntries")
    public abstract LexicalEntries lexicalEntries();

    @SerializedName("type")
    public abstract String type();

    @SerializedName("word")
    public abstract String word();


    public static TypeAdapter<OxfordWordResult> typeAdapter(Gson gson) {
        return new AutoValue_OxfordWordResult.GsonTypeAdapter(gson);
    }

}
