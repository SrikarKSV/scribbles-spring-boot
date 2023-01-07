package com.srikar.scribbles.service;

import java.util.List;

import com.srikar.scribbles.entity.Scribble;
import com.srikar.scribbles.exception.ScribbleNotFoundException;

public interface ScribbleService {

    Scribble addScribble(Scribble scribble);

    Scribble getScribbleById(Long id) throws ScribbleNotFoundException;

    List<Scribble> getScribbles();

    void deletePost(Long id);

}
