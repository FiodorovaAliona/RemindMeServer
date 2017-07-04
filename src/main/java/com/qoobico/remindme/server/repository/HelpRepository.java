package com.qoobico.remindme.server.repository;

import com.qoobico.remindme.server.entity.Help;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface HelpRepository extends JpaRepository<Help, Long> {
    @Query("select h from Help h where h.title = :title")
    Help findByTitle(String title);
}
