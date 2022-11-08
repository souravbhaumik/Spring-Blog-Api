package com.sourav.blog;

import com.sourav.blog.repositories.UserRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogAppApisApplicationTests {

    @Autowired
    private UserRepo userRepo;

    @Test
    void contextLoads() {
    }
    @Test
    public void repoTest() {
        String className = this.userRepo.getClass().getName();
        String packageName = this.userRepo.getClass().getPackageName();
        System.out.println(className);  // jdk.proxy2.$Proxy101
        System.out.println(packageName);    // jdk.proxy2
    }
}
