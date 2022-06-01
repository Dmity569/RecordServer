package com.samsung.service;

import com.samsung.dao.RecordDao;
import com.samsung.domain.Record;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecordServiceImpl implements RecordService {

    private final RecordDao recordDao;

    @Override
    @Transactional
    public Record insert(Record record) {

        return recordDao.save(record);
    }

    @Override
    public List<Record> getAll() {

        return recordDao.findAllByOrderByScoreDesc();
    }

    @Override
    public Record getById(int id) {

        return recordDao.getById(id);
    }

    @Override
    public Record getByName(String name) {

        return recordDao.findByName(name);
    }

}
