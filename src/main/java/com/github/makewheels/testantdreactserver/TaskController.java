package com.github.makewheels.testantdreactserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
public class TaskController {
    @GetMapping("task/{taskId}")
    public Task getTaskById(@PathVariable("taskId") String taskId) {
        Task task = new Task();
        task.setTaskId(UUID.randomUUID().toString());
        task.setCreateTime(new Date());
        task.setTitle(task.getTaskId() + "-title");
        return task;
    }

    @GetMapping("tasks")
    public List<Task> getTaskList() {
        List<Task> taskList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Task task = new Task();
            task.setTaskId(UUID.randomUUID().toString());
            task.setCreateTime(new Date());
            task.setTitle(task.getTaskId() + "-title");
            taskList.add(task);
        }
        return taskList;
    }
}
