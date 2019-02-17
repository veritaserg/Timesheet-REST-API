package com.timesheet.dto;

import com.timesheet.model.Position;
import lombok.*;

@Getter
@Setter
@Builder
public class PositionDto {

    private Long id;
    private String name;

    public static PositionDto fromPosition(Position position) {
        return PositionDto.builder()
                .id(position.getId())
                .name(position.getName())
                .build();
    }

    public Position toPosition(){
        Position position = new Position();
        position.setId(id);
        position.setName(name);

        return position;
    }


}
