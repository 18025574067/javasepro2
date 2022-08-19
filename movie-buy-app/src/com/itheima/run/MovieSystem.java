package com.itheima.run;

import com.itheima.bean.Business;
import com.itheima.bean.Customer;
import com.itheima.bean.Movie;
import com.itheima.bean.User;

import java.util.*;

/**
     系统角色类准备：
        1. 集成日志框架，用于后续记录日志信息。
        2. 定义一个电影类Movie类，Movie类包含：片名，主演，评分，时长，票价，余票。
        3. 系统包含2个用户角色：客户，商家。存在大量相同属性信息。
        4. 定义User类作为父类，属性：登录名称，密码，真实名称，性别，电话，账户金额
        5. 定义Business类代表商家角色，属性：店铺名称，地址。
        6. 定义Customer类代表客户角色，属性：
        7. 定义集合List<User>用户存放系统注册的用户对象信息。
        8. 定义集合Map<Business, List<Movie>>存放商家和其排片信息。

 */

public class MovieSystem {
    /**
        定义系统的用户存储容器:
        1. 存储很多客户对象，商家对象
     */
    public static final List<User> ALL_USERS = new ArrayList<>();

    /**
        2. 存储商家及其排片信息
            商家1 = [p1, p2, p3...]
            商家2 = [p1, p2, p3...]
     */
    public static final Map<Business, List<Movie>> ALL_MOVIES = new HashMap<>();

    // 扫描器
    public static final Scanner SYS_SC = new Scanner(System.in);
    /**
        3. 准备一些测试数据。
     */
    static {
        Customer c = new Customer();
        c.setLoginName("zyf888");
        c.setPassWord("123456");
        c.setUserName("黑马刘德华");
        c.setSex('男');
        c.setPhone("110110");
        ALL_USERS.add(c);

        Customer c1 = new Customer();
        c1.setLoginName("gzl888");
        c1.setPassWord("123456");
        c1.setUserName("黑马关之琳");
        c1.setSex('女');
        c1.setPhone("111111");
        ALL_USERS.add(c1);

        Business b = new Business();
        b.setLoginName("baozugong888");
        b.setPassWord("123456");
        b.setUserName("黑马包租公");
        b.setMoney(0);
        b.setSex('男');
        b.setPhone("110110");
        b.setAddress("火星6号2B二层");
        b.setShopName("甜甜圈国际影城");
        ALL_USERS.add(b);
        // 注意：商家一定需要加入到店铺排片信息中去
        List<Movie> movies = new ArrayList<>();
        ALL_MOVIES.put(b, movies);

        Business b2 = new Business();
        b2.setLoginName("baozupo888");
        b2.setPassWord("123456");
        b2.setUserName("黑马包租婆");
        b2.setMoney(0);
        b2.setSex('女');
        b2.setPhone("110110");
        b2.setAddress("火星8号8B八层");
        b2.setShopName("巧克力国际影城");
        ALL_USERS.add(b2);
        // 注意：商家一定需要加入到店铺排片信息中去
        List<Movie> movies2 = new ArrayList<>();
        ALL_MOVIES.put(b2, movies2);

    }

    public static void main(String[] args) {
        showMain();

    }

    /**
        首页展示
     */
    private static void showMain() {
        while (true) {
            System.out.println("===============黑马电影首页===================");
            System.out.println("1. 登录");
            System.out.println("2. 客户注册");
            System.out.println("3. 商家登录");
            System.out.println("请输入操作命令：");
            String command = SYS_SC.nextLine();
            switch (command){
                case "1":
                    // 登录
                    begin();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                default:
                    System.out.println("你的输入有误，请确认！");
            }
        }
    }

    private static void begin() {
        while (true) {
            System.out.println("请输入用户名：");
            String loginName = SYS_SC.nextLine();
            System.out.println("请输入密码：");
            String passWord = SYS_SC.nextLine();

            // 1. 根据用户查询用户对象
            User u = getUserByLoginName(loginName);

            // 2. 判断登录名是否存在，存在说明用户存在
            if (u != null){
                // 3. 判断密码是否正确
                if (u.getPassWord().equals(passWord)){
                    // 登录成功了
                    // 判断是普通用户还是商家
                    if (u instanceof Customer){
                        // 普通用户
                        showCustomerMain();
                    }else {
                        // 商户用户
                        showBusinessMain();
                    }
                    return;

                }else {
                    System.out.println("密码错误，请确认！");
                }
            }else {
                System.out.println("登录名错误，请确认！");
            }
        }
    }

    /**
        商家后台操作界面
     */
    private static void showBusinessMain() {
    }

    /**
        普通用户操作界面
     */
    private static void showCustomerMain() {
    }

    public static User getUserByLoginName(String loginName){
        for (User user : ALL_USERS) {
            // 判断这个用户是否我们想要的
            if (user.getLoginName().equals(loginName)){
                return user;

            }
        }
        return null; // 查无此人。
    }
}
