package com.tyron.mybatislearn;

import com.tyron.mybatislearn.mapper.IUserMapper;
import com.tyron.mybatislearn.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

public class MybatisLearnApplicationTests {

    @Test
    public void test_queryUserInfoById() {
        String resource = "config/mybatis-config.xml";
        try(Reader reader = Resources.getResourceAsReader(resource)) {
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            try(SqlSession session = sqlSessionFactory.openSession()){
                IUserMapper mapper = session.getMapper(IUserMapper.class);
                User user = mapper.queryUserInfoById(1L);
                System.out.println("user：" + user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
