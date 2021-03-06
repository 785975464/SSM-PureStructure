package com.jay.dao; /**
 * Created by Jay on 2017/6/21.
 */
import com.jay.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class UserDaoTest {

    @Autowired
    private UserDao dao;

    @Test
    public void testSelectUser() throws Exception {
        int id = 1;
        User user = dao.selectUser(id);
        System.out.println(user.getUsername());
    }

}

