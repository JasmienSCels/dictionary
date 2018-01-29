package com.example.jcels.dictionary.domain.view.words.autovalue;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by jcels on 29/01/2018.
 */

@AutoValue
public abstract class InflectionOf {

    @SerializedName("id")
    public abstract String id();

    @SerializedName("text")
    public abstract String text();


    public static TypeAdapter<InflectionOf> typeAdapter(Gson gson) {
        return new AutoValue_InflectionOf.GsonTypeAdapter(gson);
    }
}
