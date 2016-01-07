package com.carnewal.gameofthrones.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Brecht on 7/01/2016.
 */
public class GOTCharacter implements Serializable{

    public String imageUrl;
    public String name;
    public String description;



    public GOTCharacter(String imageUrl, String name, String description) {
        this.imageUrl = imageUrl;
        this.name = name;
        this.description = description;
    }


}
