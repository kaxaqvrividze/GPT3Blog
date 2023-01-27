package com.javatpoint.springboothelloworldexample.Controller;

import org.springframework.ui.Model;
import com.javatpoint.springboothelloworldexample.API.GetTrends;
import com.javatpoint.springboothelloworldexample.Model.TrendsResponse;
import io.restassured.response.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HomeController {
    @GetMapping("/")
    public String home(Model model){
        TrendsResponse response = GetTrends.Trends().as(TrendsResponse.class);
//        model.addAttribute("TrendsData",response);

        System.out.println(response.united_states);



        return "index";
    }
}
