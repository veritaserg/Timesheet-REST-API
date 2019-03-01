package com.timesheet.service;

import com.timesheet.model.Position;

public interface PositionServise extends GenericService<Position,Long> {
    Position findByName(String name);
}
