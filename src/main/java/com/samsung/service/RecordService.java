package com.samsung.service;


import com.samsung.domain.Record;

import java.util.List;

public interface RecordService {

    Record insert(Record record);

    List<Record> getAll();

    Record getById(int id);

    Record getByName(String name);

}
