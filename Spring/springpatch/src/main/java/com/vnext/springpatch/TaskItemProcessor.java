//package com.vnext.springpatch;
//
//import com.vnext.springpatch.model.Task;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.batch.item.ItemProcessor;
//
//public class TaskItemProcessor implements ItemProcessor<Task,Task> {
//
//    private static final Logger log = LoggerFactory.getLogger(TaskItemProcessor.class);
//    @Override
//    public Task process(Task task) throws Exception {
////        task.setStatus(0);
//
//        Task transformTask = new Task();
//        transformTask.setName(task.getName());
//        transformTask.setStatus(0);
//        return transformTask;
//    }
//}
