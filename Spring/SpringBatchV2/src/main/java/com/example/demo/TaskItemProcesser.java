package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class TaskItemProcesser implements ItemProcessor<Task,Task> {

    private static final Logger log = LoggerFactory.getLogger(TaskItemProcesser.class);
    @Override
    public Task process(Task task) throws Exception {
        task.setStatus(0);
        log.info("set task: name " +task.getName()+" status "+task.getStatus());
        return task;
    }
}
