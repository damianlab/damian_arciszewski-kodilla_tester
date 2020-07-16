package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListRepositoryTestSuite {


    @Autowired
    private TaskListRepository taskListRepository;

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(1, "List1", "Cleaning Tasks" );
        taskListRepository.save(taskList);

        //When
        String listName = taskList.getListName();
        List<TaskList> listOfTaskLists = taskListRepository.findByListName(listName);

        //Then
        Assert.assertEquals(1, listOfTaskLists.size());

        //CleanUp
        int id = listOfTaskLists.get(0).getId();
        taskListRepository.deleteById(id);
    }
}
