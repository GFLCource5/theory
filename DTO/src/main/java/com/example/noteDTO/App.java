package com.example.noteDTO;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

	NoteDTO dto1 = new NoteDTO();
	System.out.println(dto1.toString());

	dto1.setId(1);
	dto1.setName("Name");
	System.out.println(dto1.toString());

	System.out.println("Set 'new name'");
	dto1.setName("New name");
	System.out.println(dto1.getName());

	NoteDTO dto2 = new NoteDTO(2, "name");

	System.out.println("Dto2");
	System.out.println(dto2.getName());

	System.out.println("Dto with different id isn't eqauls");
	System.out.println(dto1.equals(dto2));

	NoteDTO dto3 = new NoteDTO(1, "Name");
	System.out.println(dto3.toString());

	System.out.println("Dto with same id is equals");
	System.out.println(dto1.equals(dto3));

    }
}
