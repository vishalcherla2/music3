package com.example.song.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.*;

import com.example.song.repository.SongRepository;

@Service
public SongJpaSerivce implements SongRepository{
    @Autowired
    public SongJpaRepository songJpaRepository;
    @Override
    public ArrayList<Song>getSongs(){
        List<Song>songslist=songJpaRepository.findAll();
        ArrayList<Song>songs=new ArrayList<>(songslist);
        return songs;
    }
    @Override
    public Song getSongById(int songId){
        try{
            Song song=songJpaRepository.findById(songId).get();
            return song;
        }
        catch(Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
    @Override
    public Song addSong(Song song){
        songJpaRepository.save(song);
        return song;
    }
    @Override
    public Song updateSong(int songId, Song song){
        
    }
    
}
