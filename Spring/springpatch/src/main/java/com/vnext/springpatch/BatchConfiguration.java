//package com.vnext.springpatch;
//
//import com.vnext.springpatch.model.Task;
//import org.springframework.batch.core.Job;
//import org.springframework.batch.core.Step;
//import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
//import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
//import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
//import org.springframework.batch.core.launch.support.RunIdIncrementer;
//import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
//import org.springframework.batch.item.database.JdbcBatchItemWriter;
//import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
//import org.springframework.batch.item.file.FlatFileItemReader;
//import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
//import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.ClassPathResource;
//
//import javax.sql.DataSource;
//
//@Configuration
//@EnableBatchProcessing
//public class BatchConfiguration {
//
//    @Autowired
//    public JobBuilderFactory jobBuilderFactory;
//
//    @Autowired
//    public StepBuilderFactory stepBuilderFactory;
//
//    @Autowired
//    public DataSource dataSource;
//
//    @Bean
//    public FlatFileItemReader<Task> reader(){
//        return new FlatFileItemReaderBuilder<Task>()
//                    .name("taskItemReader")
//                    .resource(new ClassPathResource("/job/tasks.csv"))
//                    .delimited()
//                    .names(new String[]{"name"})
//                    .fieldSetMapper(new BeanWrapperFieldSetMapper<Task>() {{
//                        setTargetType(Task.class);
//                    }})
//                    .build();
//    }
//    @Bean
//    public TaskItemProcessor processor() {
//        return new TaskItemProcessor();
//    }
//
//    @Bean
//    public JdbcBatchItemWriter<Task> writer(DataSource dataSource){
//        return new JdbcBatchItemWriterBuilder<Task>()
//                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
//                .sql("INSERT INTO task (name, status) VALUES (:name, :status)")
//                .dataSource(dataSource)
//                .build();
//    }
//    @Bean
//    public Job importUserJob(JobCompletionNotificationListener listener, Step step1) {
//        return jobBuilderFactory.get("importUserJob")
//                .incrementer(new RunIdIncrementer())
//                .listener(listener)
//                .flow(step1)
//                .end()
//                .build();
//    }
//
//    @Bean
//    public Step step1(JdbcBatchItemWriter<Task> writer) {
//        return stepBuilderFactory.get("step1")
//                .<Task, Task> chunk(10)
//                .reader(reader())
//                .processor(processor())
//                .writer(writer)
//                .build();
//    }
//}
