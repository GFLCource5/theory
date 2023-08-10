package com.example.noteDTO;

public class NoteDTO{

	private int id;
	private String name;

	public NoteDTO(){
	}

	public NoteDTO(int id, String name){
		this.id = id;
		this.name = name;
	}

	public int getId() {
	  return id;
	}

	public String getName() {
	  return name;
	}

	public void setId(int id) {
	   this.id = id;
	}

	public void setName(String name) {
	  this.name = name;
	}

	@Override
	public int hashCode() {
	  return id;
	}

	@Override
	public boolean equals(Object  object){
	  if (this == object) {
	     return true;
	    }

	  if (object instanceof NoteDTO) {
	    NoteDTO dto = (NoteDTO) object;
            return dto.getId() == this.id;
	  }

	  return false;
	}

	@Override
	public String toString() {
 	  return String.valueOf(id) + " " + name;
	}

}
