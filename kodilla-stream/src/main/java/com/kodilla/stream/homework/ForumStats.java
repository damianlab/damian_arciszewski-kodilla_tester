package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avgNumberOfPostsAgeOverAnd40 = UsersRepository.getUserList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .mapToInt(User::getNumberOfPosts)
                .average()
                .getAsDouble();
        System.out.println("Average number of posts made by users over and 40: " + avgNumberOfPostsAgeOverAnd40);

        double avgNumberOfPostsAgeBelow40 = UsersRepository.getUserList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .mapToInt(User::getNumberOfPosts)
                .average()
                .getAsDouble();
        System.out.println("Average number of posts made by users below 40: " + avgNumberOfPostsAgeBelow40);


    }
}
