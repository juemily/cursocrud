package com.crud.curso.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.crud.curso.entity.Course;
import com.crud.curso.repository.CourseJpaRepository;
import com.crud.curso.service.CourseService;

@Service("courseServiceImp")
public class CourseServiceImp implements CourseService{
	
	@Autowired
	@Qualifier("courseJpaRepository")
	private CourseJpaRepository courseJpaRepository;

	@Override
	public List<Course> listAllCourse() {
		
		return courseJpaRepository.findAll();
	}

	@Override
	public Course addCourse(Course course) {
		
		return courseJpaRepository.save(course);
	}

	@Override
	public int removeCourse(int id) {
		courseJpaRepository.deleteById(id);
		return 0;
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		return courseJpaRepository.save(course);
	}

	@Override
	public Optional<Course> getCourseById(int id) {
		// TODO Auto-generated method stub
		return courseJpaRepository.findById(id);
	}

}
