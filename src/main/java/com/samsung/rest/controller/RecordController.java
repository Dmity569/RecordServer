package com.samsung.rest.controller;

import com.samsung.domain.Record;
import com.samsung.rest.dto.RecordDto;
import com.samsung.service.RecordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class RecordController {

    private final RecordService recordService;

    @PostMapping("/record")
    public RecordDto createNewRecord(
            @RequestParam String nameName,
            @RequestParam String nameScore) {
        //System.out.println(recordDto);
        Record record = recordService.insert(new Record(0, nameName, Integer.parseInt(nameScore)));
        return RecordDto.toDto(record);
    }

    @GetMapping("/record")
    public List<RecordDto> getAllRecords() {

        return recordService
                .getAll()
                .stream()
                .map(RecordDto::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/record/{id}")
    public RecordDto getRecordById(@PathVariable int id) {

        return RecordDto.toDto(recordService.getById(id));
    }

    @GetMapping("/record/name")
    public RecordDto getRecordByName(@RequestParam String name) {

        return RecordDto.toDto(recordService.getByName(name));
    }


}
