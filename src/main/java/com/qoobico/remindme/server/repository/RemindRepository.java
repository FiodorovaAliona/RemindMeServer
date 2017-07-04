package com.qoobico.remindme.server.repository;

import com.qoobico.remindme.server.entity.Remind;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RemindRepository extends JpaRepository<Remind, Long> {

    @Query("select r from Remind r where r.title = :title")
    Remind findByTitle(String title);

    @Query("select r from Remind r where r.remind_date = :remind_date")
    List<Remind> findByRemindDate(String remind_date);
}
