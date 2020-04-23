package com.capgemini.client;

import java.util.Scanner;

import com.capgemini.entity.Author;
import com.capgemini.service.AuthorService;
import com.capgemini.service.AuthorServiceimpl;

public class Client {

	public static void main(String[] args) {
		
	
AuthorService service=new AuthorServiceimpl();

     Author author=new Author();
  
	   author.setAuthorId(1);
	    author.setFirstName("shiva");
	author.setLastName("talamanchi");
	author.setMiddleName("kumar");
	author.setPhoneNumber(1234567896);
	service.addAuthor(author);
	
	
	   author.setAuthorId(2);
	    author.setFirstName("hello");
	author.setLastName("hi");
	author.setMiddleName("kumar");
	author.setPhoneNumber(123587896);
	service.addAuthor(author);
	
	   author.setAuthorId(3);
	    author.setFirstName("abcd");
	author.setLastName("talamanchi");
	author.setMiddleName("kumar");
	author.setPhoneNumber(1234563896);
	service.addAuthor(author);
	
	author = service.findAuthorById(1);
	System.out.print("ID:"+author.getAuthorId());
	System.out.println(" Name:"+author.getFirstName());
	System.out.println(" Name:"+author.getMiddleName());
	System.out.println(" Name:"+author.getLastName());
	System.out.println(" phone:"+author.getPhoneNumber());
	
	author.setFirstName("welcome");
	service.updateAuthor(author);
	int n=1;
	int id;
	String firstname,lastname,middlename;
	int phone;
	while(n>0)
	{
		int s;
		System.out.println("enter the choice:");
		System.out.println("1.add author");
		System.out.println("2.update author");
		System.out.println("3.delet author");
		System.out.println("4.find author by id");
		Scanner sc=new Scanner(System.in);
		s=sc.nextInt();
		switch(s)
		{
		case 1: System.out.println("enter id");
		       id=sc.nextInt();
		       System.out.println("enter first name");
		       firstname=sc.nextLine();
		       System.out.println("enter middle name");
		       middlename=sc.nextLine();
		       System.out.println("enter last name");
		       lastname=sc.nextLine();
		       System.out.println("enter phone number");
		       phone=sc.nextInt();
		       author.setAuthorId(id);
			    author.setFirstName(firstname);
			author.setLastName(lastname);
			author.setMiddleName(middlename);
			author.setPhoneNumber(phone);
		       service.addAuthor(author);
		       break;
		case 2: System.out.println("enter id");
	       id=sc.nextInt();
	       System.out.println("enter first name");
	       firstname=sc.nextLine();
	       System.out.println("enter middle name");
	       middlename=sc.nextLine();
	       System.out.println("enter last name");
	       lastname=sc.nextLine();
	       System.out.println("enter phone number");
	       phone=sc.nextInt();
	       author.setAuthorId(id);
		    author.setFirstName(firstname);
		author.setLastName(lastname);
		author.setMiddleName(middlename);
		author.setPhoneNumber(phone);
	       service.updateAuthor(author);
	       break;
	case 3:System.out.println("enter author id to delete");
    id=sc.nextInt();
    author=service.findAuthorById(id);
    service.deleteAuthor(author);
    break;
		
		
	case 4:	System.out.println("enter id");
    id=sc.nextInt();
    author=service.findAuthorById(id);
    System.out.println(author.getAuthorId());
    System.out.println(author.getFirstName());
    System.out.println(author.getMiddleName());
    System.out.println(author.getLastName());
    System.out.println(author.getPhoneNumber());
    break;
    
    default:System.out.println("enter valid number");
		}
	}
	
	
	}
	
}
