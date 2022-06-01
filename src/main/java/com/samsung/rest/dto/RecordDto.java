package com.samsung.rest.dto;

import com.samsung.domain.Record;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RecordDto {

    private int id;

    private String name;

    private int score;

    public static Record toDomainObject(RecordDto recordDto) {

        return new Record(recordDto.getId(), recordDto.getName(), recordDto.getScore());
    }

    public static RecordDto toDto(Record record) {

        return new RecordDto(record.getId(), record.getName(), record.getScore());
    }

}
