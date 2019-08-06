package com.stackroute.trackservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Making track as entity to store tracks details
 * like trackId, trackName, comments into table of DB.
 */
@Entity
//generates no-arg constructor
@NoArgsConstructor
//generates all-args constructor with all properties in the class
@AllArgsConstructor
//generates Getter,Setter Methods,toString() and hashcode()
@Data
public class Track {
    @Id
    private int trackId;
    private String trackName;
    private String comments;


}
