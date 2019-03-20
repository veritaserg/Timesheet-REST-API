package com.timesheet.service.impl;

import com.timesheet.model.Position;
import com.timesheet.repository.PositionRepository;
import com.timesheet.service.PositionServise;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PositionServiseImpl implements PositionServise {

    @Autowired
    PositionRepository positionRepository;

    @Override
    public Position findByName(String name) {
        return null;
    }

    @Override
    public Position save(Position position) {
        return positionRepository.save(position);
    }

    @Override
    public List<Position> findAll() {
        return positionRepository.findAll();
    }

    @Override
    public Position findById(Long aLong) {
        return positionRepository.getOne(aLong);
    }

    @Override
    public void delete(Position position) {
        positionRepository.delete(position);

    }

    @Override
    public void deleteById(Long aLong) {
        positionRepository.deleteById(aLong);

    }
}
