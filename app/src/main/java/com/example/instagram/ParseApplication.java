package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("2sqJ6unA5pMG9WMct56E7DP4mbKfQNGj4nfjn09e")
                .clientKey("rtUpEFjQRd90mrFKjAqsn9uYHAS8yLULPIYFnCAU")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
