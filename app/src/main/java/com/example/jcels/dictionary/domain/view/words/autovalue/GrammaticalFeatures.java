package com.example.jcels.dictionary.domain.view.words.autovalue;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Jasmien Cels on 29/01/2018.
 */

@AutoValue
public abstract class GrammaticalFeatures {

    @SerializedName("text")
    public abstract String text();

    @SerializedName("type")
    public abstract String type();

    public static TypeAdapter<GrammaticalFeatures> typeAdapter(Gson gson) {
        return new AutoValue_GrammaticalFeatures.GsonTypeAdapter(gson);
    }

}
