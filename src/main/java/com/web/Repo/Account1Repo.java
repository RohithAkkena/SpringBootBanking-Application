package com.web.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.model.Account1;
@Repository
public interface Account1Repo extends CrudRepository<Account1, Integer> {

}
