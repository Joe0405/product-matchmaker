package com.stackroute.downstreamservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.downstreamservice.model.Projects;

@Repository
public interface ProjectRepository extends MongoRepository<Projects, String> {

}
