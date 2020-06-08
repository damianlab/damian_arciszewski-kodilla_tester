package com.kodilla.collections.adv.immutable.Exercise.Picture;

import java.util.ArrayList;
import java.util.List;

public class PictureMain {
    public static void main(String[] args) {
        List<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("Karol", "Karol Wielki"));
        pictures.add(new Picture("Waza", "Waza na koniu"));
        pictures.add(new Picture("Matejko", "Matejko wielki"));

        PictureManager pictureManager = new PictureManager();
        Picture pic01 = pictureManager.createPicture("Wasyl", "Wasyl i nieśmiertelni");
        Picture pic02 = pictureManager.createPicture("Kobra", "Kobra i wrogowie");
        Picture pic03 = pictureManager.createPicture("Maj", "Maj w lesie");

        pictures.add(pic01);
        pictures.add(pic02);
        pictures.add(pic03);


        for (Picture picturePrint : pictures) {
            System.out.println(picturePrint.getAuthor() + " - " + picturePrint.getTitle());
        }

    }
}
