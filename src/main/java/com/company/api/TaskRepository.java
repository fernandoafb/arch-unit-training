package com.company.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public abstract class TaskRepository implements CrudRepository<Task, Long> {

    @Autowired
    private UserService userService;

    public List<Task> getUserTasks(Long id) throws Exception {
        return userService.getUser(id).get().getTasks();
    }

}
