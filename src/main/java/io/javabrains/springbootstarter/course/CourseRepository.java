package io.javabrains.springbootstarter.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/*
* JPA includes an interface, CrudRepository which accepts generic types
* <type_of_entity, type_of_id>
* and provides the default crud operations
* */
public interface CourseRepository extends CrudRepository<Course, String> {

    public List<Course> findByTopicId (String topicId);

}
