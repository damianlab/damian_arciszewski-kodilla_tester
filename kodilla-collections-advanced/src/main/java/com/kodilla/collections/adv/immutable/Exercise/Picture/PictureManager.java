package com.kodilla.collections.adv.immutable.Exercise.Picture;

import com.kodilla.collections.adv.immutable.special.homework.Book;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PictureManager {
    private Set<Picture> pictureSet;

    public PictureManager () {
        this.pictureSet = new HashSet<>();
    }

    public Picture createPicture(String title, String author) {
        Picture picture = new Picture(title, author);
        if (!pictureSet.contains(picture)) {
            pictureSet.add(picture);
            return picture;
        }

        for (Picture picture1 : pictureSet) {

            if (picture1.equals(picture)) {
                return picture1;
            }
        }
        return null;
    }


}
