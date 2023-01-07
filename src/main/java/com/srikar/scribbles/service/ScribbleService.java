package com.srikar.scribbles.service;

import java.util.List;

import com.srikar.scribbles.entity.Scribble;

public interface ScribbleService {

    Scribble addScribble(Scribble scribble);

    Scribble getScribbleById(Long id);

    List<Scribble> getScribbles();

}
