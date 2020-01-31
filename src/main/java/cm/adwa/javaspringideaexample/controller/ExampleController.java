package cm.adwa.javaspringideaexample.controller;

import cm.adwa.javaspringideaexample.models.Person;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/example")
public class ExampleController {

    @GetMapping("/hello-world")
    public String get() {
        return "Etinge";
    }

    @PostMapping("/create/account")
    public String createAccount(@RequestParam("name") String name, @RequestParam("age") int age) {
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        String json = new Gson().toJson(person);
        return json;
    }
}
