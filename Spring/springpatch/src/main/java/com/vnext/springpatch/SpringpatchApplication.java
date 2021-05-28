package com.vnext.springpatch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.vnext.springpatch")
public class SpringpatchApplication implements CommandLineRunner{

    @Autowired
    JobLauncher jobLauncher;

    @Autowired
    Job job;

    public static void main(String[] args) {
       SpringApplication.run(SpringpatchApplication.class, args);

    }


    @Override
    public void run(String... args) throws Exception {

        while (true){
            JobParameters parameters = new JobParametersBuilder().addLong("time",System.currentTimeMillis()).toJobParameters();
            JobExecution jobExecution = jobLauncher.run(job,parameters);
            System.out.println("JobExecution: " + jobExecution.getStatus());

            System.out.println("Batch is Running...");
            while (jobExecution.isRunning()) {
                System.out.println("...");
            }
        }

    }
}
