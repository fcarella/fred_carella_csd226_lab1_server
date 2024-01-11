package ca.saultcollege.fred_carella_csd226_lab1_server.controller;

import ca.saultcollege.fred_carella_csd226_lab1_server.data.Account;
import ca.saultcollege.fred_carella_csd226_lab1_server.data.Content;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BookstoreController {

    @GetMapping("/publiccontent")
    public ResponseEntity<String> getPublicContent(){ // map a URL to a method
        return ResponseEntity.ok("getPublicContent() :");
    }
    @GetMapping("/publiccontent2")
    public Content getPublicContent2(){ // map a URL to a method
        return new Content("some content");
    }

//    @PostMapping("/signup")
//    public ResponseEntity<String> createAccount(@RequestBody Account signUpFormData){
//        return ResponseEntity.ok("createAccount() : "+signUpFormData.getEmail());
//    }
}
