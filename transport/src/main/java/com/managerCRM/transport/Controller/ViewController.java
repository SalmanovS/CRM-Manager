package com.managerCRM.transport.Controller;

import com.managerCRM.transport.Model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;

@Controller
public class ViewController {

    @Autowired
    private CarController carController;
    @RequestMapping("/transport")
    public String show( Model model) {
     Car car = carController.getCar(1);
        model.addAttribute("md", car);
        return "transporthome";
    }

}
