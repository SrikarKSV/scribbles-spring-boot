package com.srikar.scribbles.service;

import com.srikar.scribbles.entity.Scribble;

public interface ScribbleService {

    Scribble addScribble(Scribble scribble);

    Scribble getScribbleById(Long id);

}
