package com.example.song.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.song.model.Song;

public interface SongJpaRepository extends JpaRepository<Song, Integer> {

}