package com.jiang.blog.service;

import com.jiang.blog.entity.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Service
public class UserService {
    @Resource
    private JdbcTemplate jdbcTemplate;
    public User toLogin(String username,String password){
        String sql="select * from user where name=? and password=?";
        List<User> users = jdbcTemplate.query(sql, new Object[] { username, password },
                new RowMapper<User>() {
                    @Override
                    public User mapRow(ResultSet rs, int num)
                            throws SQLException {
                        User u = new User();
                        u.setUsername(rs.getString("name"));
                        u.setPassword(rs.getString("password"));
                       /* u.setAbout(rs.getString("about"));*/
                        return u;
                    }
                });
        // 定义返回值
        User user = null;
        // 判断集合对象是否为null 并且长度大于0
        if (users != null && users.size() > 0) {
            user = users.get(0); // 取第一个值
        }
        return user;

    }
    public String findAbout(){
        String sql="select about from user where name=?";
        Map map = jdbcTemplate.queryForMap(sql, new Object[]{"jiang"});
        String res = (String) map.get("about");
        return res;
    }
    public boolean saveAbout( String about ) {
        System.out.println(about);
        String sql = " update user set about = ? where name = ? ";
        int res = jdbcTemplate.update( sql, new Object[]{ about, "jiang" } );
        if( res > 0 ) {
            return true;
        } else {
            return false;
        }
    }
}
