package org.x.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.x.domain.User;

@Mapper
@Component
public interface UserMapper {
    User findUserById(int id);
}
