package cm.adwa.javaspringideaexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

@SpringBootApplication
public class JavaSpringIdeaExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaSpringIdeaExampleApplication.class, args);
        openHomePage();
    }

    private static void openHomePage() {
        Runtime rt = Runtime.getRuntime();
        try {
            rt.exec("rundll32 url.dll,FileProtocolHandler " + "http://192.168.8.112:8080"); //open a browser when spring boot finish setting up,
            // this address can be change to suit your need
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
