package com.vnext.springpatch.repository;

import com.vnext.springpatch.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
