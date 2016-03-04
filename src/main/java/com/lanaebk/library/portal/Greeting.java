package com.lanaebk.library.portal;

/**
 * Created by Lanae on 3/3/2016.
 */

public class Greeting
{

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}