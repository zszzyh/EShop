package com.hang.dao;

        import com.hang.bean.Tb_Admin_Info;
        import org.apache.ibatis.annotations.Param;
        import org.springframework.stereotype.Repository;

        import java.util.List;

@Repository
public interface Tb_Admin_InfoMapper {
    int deleteByPrimaryKey(Integer adminId);

    int insert(Tb_Admin_Info record);

    int insertSelective(Tb_Admin_Info record);

    Tb_Admin_Info selectByPrimaryKey(Integer adminId);

    int updateByPrimaryKeySelective(Tb_Admin_Info record);

    int updateByPrimaryKey(Tb_Admin_Info record);

//根据用户名和密码查所有
    List<Tb_Admin_Info> findAdmin(@Param("admin_code") String admin_code, @Param("password")String password);
}