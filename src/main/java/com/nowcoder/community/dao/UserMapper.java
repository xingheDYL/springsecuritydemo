package com.nowcoder.community.dao;

import com.nowcoder.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author admin
 */
@Mapper
public interface UserMapper {

    User selectByName(String username);

}
