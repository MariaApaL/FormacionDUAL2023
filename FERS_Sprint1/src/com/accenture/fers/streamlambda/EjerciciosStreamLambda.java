package com.accenture.fers.streamlambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.accenture.fers.entity.Event;

public class EjerciciosStreamLambda {

	public static void main(String[] args) {
		
		ArrayList<Event> list = new ArrayList<Event>();
		
		
		list.add(new Event(1,"Event 1","musical",3));
		list.add(new Event(2,"Event 2","sport",5));
		list.add(new Event(3,"Event 3","sport",10));
		list.add(new Event(4,"Event 4","cultural",34));
		list.add(new Event(5,"Event 5","sport",50));
		
		
		Stream<Event> stream = list.stream(); 
		
		//a

		System.out.println("Mostramos todos los nombres");
		list.stream()
			.forEach(e->{System.out.println(e.getName());});
		
		//b
		
		System.out.println("Mostramos solo nombres de tipo sport");
		
	    list.stream()
	    .filter(e->e.getEventType().equals("sport"))
	    .forEach(e->System.out.println(e.getName()));
	    
	    
	    //c
	    
	    System.out.println("Número de asientos de sport");
	    
	    //Con lambda
	   System.out.println(
	    
	    list.stream()
	    .filter(e->e.getEventType().equals("sport"))
	    .mapToInt(e->e.getSeatsAvailable())
	    .sum()
		 
		);
	   
	    //Sin lambda
	   System.out.println(
			    
			    list.stream()
			    .filter(e->e.getEventType().equals("sport"))
			    .mapToInt(Event::getSeatsAvailable)
			    .sum()
				 
				);
	   
	    
	    //d
	   System.out.println("Id de los eventos de tipo sport"); 
	    
	   System.out.println(
	   list.stream()
	   .filter(e->e.getEventType().equals("sport"))
	   .map(Event::getEventId)
	   .collect(Collectors.toList())
	   
		);
		
	   
	   //e
	   System.out.println("Id de los eventos de tipo sport ordenados desc"); 
	   System.out.println(
	list.stream()
	   .filter(e->e.getEventType().equals("sport"))
	   .sorted(Comparator.comparing(Event::getName).reversed())
	   .map(Event::getEventId)
	   .collect(Collectors.toList())

			   );
	   
	   
	   
		
		
		
		
		
		
		
		
	}
	
}
