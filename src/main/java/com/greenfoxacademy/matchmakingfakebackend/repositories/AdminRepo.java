package com.greenfoxacademy.matchmakingfakebackend.repositories;

import com.greenfoxacademy.matchmakingfakebackend.models.Admin;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends CrudRepository<Admin, Integer>, JpaSpecificationExecutor {
}
