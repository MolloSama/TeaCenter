package com.bkg.teacenter.repository;

import com.bkg.teacenter.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User , Long> {

}