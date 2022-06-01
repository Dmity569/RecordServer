package com.samsung.dao;

import com.samsung.domain.Record;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecordDao extends JpaRepository<Record, Integer> {

    // SELECT * FROM genre WHERE name = ?
    Record findByName(String name);

    List<Record> findAllByOrderByScoreDesc();
}
