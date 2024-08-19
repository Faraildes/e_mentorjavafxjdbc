package model.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.entities.Teacher;

public class TeacherService {
	
	public List<Teacher> findAll(){
		List<Teacher> list = new ArrayList<>();
		list.add(new Teacher(1, "Francisco", new Date(), "12345678956", "98765423", 12000.00 ));
		list.add(new Teacher(2, "Maria", new Date(), "12345645321", "984356233", 15000.00 ));		
		return list;
	}
}
