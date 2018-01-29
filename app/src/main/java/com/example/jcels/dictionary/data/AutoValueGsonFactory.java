package com.example.jcels.dictionary.data;

import com.google.gson.TypeAdapterFactory;
import com.ryanharter.auto.value.gson.GsonTypeAdapterFactory;

/**
 * Created by Jasmien Cels on 29/01/2018.
 */

@GsonTypeAdapterFactory
public abstract class AutoValueGsonFactory implements TypeAdapterFactory {


    public static TypeAdapterFactory create() {
        return new AutoValueGson_AutoValueGsonFactory();
    }

}

