package academy.prog.myshortenlink.controllers;


import academy.prog.myshortenlink.dto.UrlStatDTO;
import academy.prog.myshortenlink.services.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StatController {

    private UrlService urlService;

    @Autowired
    public StatController(UrlService urlService) {
        this.urlService = urlService;
    }

    @GetMapping(value = "/stat", produces = "text/html")
    public String statHtml() {
        return "stat";
    }

    @ResponseBody
    @GetMapping(value = "/stat", headers = "Accept=application/json")
    public List<UrlStatDTO> getJson() {
        return urlService.getStatistics();
    }


}