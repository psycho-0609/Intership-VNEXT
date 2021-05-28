package com.vnext.springpatch.batch;

import com.vnext.springpatch.model.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class Processer implements ItemProcessor<Task,Task> {
    private static final Logger log = LoggerFactory.getLogger(Processer.class);
    @Override
    public Task process(Task task) throws Exception {

        task.setStatus(0);

        log.info("Setting tasks");
        return task;
    }
}
