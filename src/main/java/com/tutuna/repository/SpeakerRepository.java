package com.tutuna.repository;

import com.tutuna.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
