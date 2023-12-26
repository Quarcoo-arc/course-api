package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

/*
* JPA includes an interface, CrudRepository which accepts generic types
* <type_of_entity, type_of_id>
* and provides the default crud operations
* */
public interface TopicRepository extends CrudRepository<Topic, String> {

}
