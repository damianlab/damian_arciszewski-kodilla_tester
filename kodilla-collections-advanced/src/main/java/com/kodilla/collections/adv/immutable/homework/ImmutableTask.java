package com.kodilla.collections.adv.immutable.homework;


public class ImmutableTask {
    public static void main(String[] args) {
Task task = new Task("Cooking egg", 15);
        TaskHacked taskHacked = (TaskHacked) task;
        taskHacked.modifyTitle("Fry egg");
        taskHacked.modifyDuration(18);
        System.out.println(task.getDuration());

        //System.out.println(task.getTitle() + " " + task.getDuration());
    }

}
