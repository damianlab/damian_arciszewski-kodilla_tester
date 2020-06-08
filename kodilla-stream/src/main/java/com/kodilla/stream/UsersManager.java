package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> usernames = UsersRepository.getUserList() // Przypisanie elementow przeplywajacych przez strumien listy przypisanej do zmiennej
        //UsersRepository.getUserList()
                .stream()
                .filter(u -> u.getGroup().equals("Chemists"))
                //.filter(u -> u.getGroup().equals("Sales"))
                .map(UsersManager :: getUserName)
                //.map(u -> u.getUsername())
                .collect(Collectors.toList());
        System.out.println(usernames);
                //.forEach(un -> System.out.println(un));
    }

    public static String getUserName(User user) {
        return user.getUsername();
          }
}
