/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package player;

/**
 *
 * @author LENOVO
 */
class Song {
    private String title;
    private int durationInSec;
    
    public Song(String title, int durationInSec){
        this.title=title;
        this.durationInSec=durationInSec;
    }
    public String getTitle(){
        return title;
    }
    public int getDurationInSec(){
        return durationInSec;
    }
    @Override
    public String toString(){
        return this.title +": " + this.durationInSec;
    }
}
