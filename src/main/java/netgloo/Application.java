package netgloo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        System.getProperties().put( "server.port", 8181 );  //8181 port is set here kkk

        SpringApplication.run(Application.class, args);
    }

}
