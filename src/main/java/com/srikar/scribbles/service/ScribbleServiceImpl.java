package com.srikar.scribbles.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srikar.scribbles.entity.Scribble;
import com.srikar.scribbles.repository.ScribbleRepository;

@Service
public class ScribbleServiceImpl implements ScribbleService {

    @Autowired
    private ScribbleRepository scribbleRepository;

    @Override
    public Scribble addScribble(Scribble scribble) {
        return scribbleRepository.save(scribble);
    }

    @Override
    public Scribble getScribbleById(Long id) {
        return scribbleRepository.findById(id).get();
    }

}
