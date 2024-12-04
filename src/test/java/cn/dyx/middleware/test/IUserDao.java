package cn.dyx.middleware.test;

import cn.dyx.middleware.db.router.annotation.DBRouter;



public interface IUserDao {

    @DBRouter(key = "userId")
    void insertUser(String req);

}
