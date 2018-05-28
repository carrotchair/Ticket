package pl.sdacademy.java.intermediate;

import lombok.extern.log4j.Log4j2;

@Log4j2
class Main {
    public static void main(String[] args) {
        log.info("hello");
        User user = new User();
        user.setName("sjdkf");
        log.info(user);
    }
}
