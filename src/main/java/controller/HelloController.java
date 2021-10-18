package controller;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Optional;

@RestController
public class HelloController {
    private static final String PATH = "/hello";


    @GetMapping(PATH +"/helloWorld" )
    public ResponseEntity<String> helloWorld()

    {
        String hello="Hello World"+ new Date();
        return new ResponseEntity<String>(hello, new HttpHeaders(), HttpStatus.OK);
    }


}
