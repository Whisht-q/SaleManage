package com.tust.salemanage.mapper;

import com.tust.salemanage.bean.Collection;
import com.tust.salemanage.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    User getUser();

    int checkLogin(User user);

    int checkRegister(User user);

    int register(User user);

    int getUserIdByName(User user);

    String getUsernameById(User user);

    User getUserInfoById(User user);

    int updatePwd(User user);

    int checkUsername(User user);

    int insertManager(User user);

    String getUserRoleByName(User user);

}
