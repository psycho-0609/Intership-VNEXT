//package com.vnext.springpatch;
//
//import com.vnext.springpatch.model.Task;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.batch.core.BatchStatus;
//import org.springframework.batch.core.JobExecution;
//import org.springframework.batch.core.listener.JobExecutionListenerSupport;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Component;
//
//@Component
//public class JobCompletionNotificationListener extends JobExecutionListenerSupport {
//
//    private static final Logger log = LoggerFactory.getLogger(JobCompletionNotificationListener.class);
//
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    @Override
//    public void afterJob(JobExecution jobExecution) {
//        if(jobExecution.getStatus() == BatchStatus.COMPLETED){
//            log.info("!!! JOB FINISHED! Time to verify the results");
//
//            jdbcTemplate.query("SELECT name,status FROM task",
//                    (rs, row) -> new Task(
//                            rs.getString(1),
//                            rs.getInt(2))
//            ).forEach(task -> log.info("Found <" + task + "> in the database."));
//        }
//    }
//}
