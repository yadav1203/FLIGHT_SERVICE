//package com.CodeTech.Flight.Service.Controller;
//
//
//import com.CodeTech.Flight.Service.Entiry.Users;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.ParseException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.json.simple.parser.JSONParser;
//
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//
//@RestController
//public class UserController {
//
//
//    @Autowired
//    private UserService userService;
//
//// "D:\PROJECT\interview.json"
//
//    @PostMapping("/import")
//    public String importJsoFIle() throws FileNotFoundException {
//
//        try {
//            JSONParser jsonParser = new JSONParser();
//
//            JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("D:\\PROJECT\\interview.json"));
//
//
//            String name = jsonObject.get("name").toString();
//            Number ageNumber = (Number) jsonObject.get("age");
//            String email = jsonObject.get("email").toString();
//            String address = jsonObject.get("address").toString();
//            int age = ageNumber.intValue();
//
//
//            if (name == null || name.isEmpty()) {
//
//                throw new RuntimeException("NAME IS EMPTY");
//            }
//
//            if (age < 18) {
//
//                throw new RuntimeException("AGE IS LESS THAN 18");
//            }
//
//            if (email.startsWith("y")){
//
//                throw new RuntimeException("  E MAIL NOT START WITH Y");
//            }
//
//            Users user = new Users();
//            user.setAge(age);
//            user.setName(name);
//            user.setAddress(address);
//            user.setEmail(email);
//
//            userService.saveUser(user);
//
//            return "Data successfully inserted into the database.";
//        } catch (IOException | ParseException e) {
//            return "Error processing JSON file: " + e.getMessage();
//        } catch (IllegalArgumentException e) {
//            return "Validation error: " + e.getMessage();
//        }
//
//    }
//
//    @DeleteMapping("/{id}")
//    public String deleteRecordBYId(@PathVariable int id){
//
//        userService.deleteRecordBYId(id);
//
//        return "RECORD DELETED " +id;
//    }
//}
