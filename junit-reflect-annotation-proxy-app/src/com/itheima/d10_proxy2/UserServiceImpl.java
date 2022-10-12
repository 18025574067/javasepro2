package com.itheima.d10_proxy2;

public class UserServiceImpl implements UserService {
    @Override
    public String login(String loginName, String passWord){
//        long startTime = System.currentTimeMillis();
        String rs = "登录名和密码错误";
        if("admin".equals(loginName) && "123456".equals(passWord)){
            rs = "登录成功";
        }
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("login方法耗时：" + (endTime - startTime) / 1000.0 + "s");
        return rs;
    }

    @Override
    public void deleteUsers(){
//        long startTime = System.currentTimeMillis();
        try{
            System.out.println("您正在删除用户数据中。。。。");
            Thread.sleep(2500);
        } catch (Exception e){
            e.printStackTrace();
        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("deleteUsers方法耗时：" + (endTime - startTime) / 1000.0 + "s");
    }

    @Override
    public String selectUsers(){
//        long startTime = System.currentTimeMillis();
        String rs = "查询到了10000个用户数据～～～";
        try {
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("selectUsers方法耗时：" + (endTime - startTime) / 1000.0 + "s");
        return rs;
    }

    @Override
    public void deleteById(int id){
        try{
            System.out.println("根据用户的id：" + id + "，删除了他。。。");
            Thread.sleep(1200);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
