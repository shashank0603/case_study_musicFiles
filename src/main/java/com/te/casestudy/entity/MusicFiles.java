package com.te.casestudy.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "musicfiles")
public class MusicFiles implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer song_id;
	@Column
	private String song_title;
	@Column
	private String artist_name;
	@Column
	private String album_name;
	@Column
	private String song_location;
	@Column
	private String description;

	public MusicFiles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MusicFiles(Integer song_id, String song_title, String artist_name, String album_name, String song_location,
			String description) {
		super();
		this.song_id = song_id;
		this.song_title = song_title;
		this.artist_name = artist_name;
		this.album_name = album_name;
		this.song_location = song_location;
		this.description = description;
	}

	public Integer getSong_id() {
		return song_id;
	}

	public void setSong_id(Integer song_id) {
		this.song_id = song_id;
	}

	public String getSong_title() {
		return song_title;
	}

	public void setSong_title(String song_title) {
		this.song_title = song_title;
	}

	public String getArtist_name() {
		return artist_name;
	}

	public void setArtist_name(String artist_name) {
		this.artist_name = artist_name;
	}

	public String getAlbum_name() {
		return album_name;
	}

	public void setAlbum_name(String album_name) {
		this.album_name = album_name;
	}

	public String getSong_location() {
		return song_location;
	}

	public void setSong_location(String song_location) {
		this.song_location = song_location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
