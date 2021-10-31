package com.gy.pinyou.server.user;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findByUserName(String userName);
    List<User> findByNickName(String nickName);

}
