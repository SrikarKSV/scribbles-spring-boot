package com.srikar.scribbles.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srikar.scribbles.entity.Scribble;
import com.srikar.scribbles.exception.ScribbleNotFoundException;
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
    public Scribble getScribbleById(Long id) throws ScribbleNotFoundException {
        Optional<Scribble> scribble = scribbleRepository.findById(id);
        if (scribble.isEmpty()) {
            throw new ScribbleNotFoundException("Scribble not found!");
        }
        return scribble.get();

    }

    @Override
    public List<Scribble> getScribbles() {
        return scribbleRepository.findAll();
    }

    @Override
    public void deletePost(Long id) {
        scribbleRepository.deleteById(id);
    }

}
