package com.chart.Controll;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChartController {

    private static final Random RANDOM = new Random(System.currentTimeMillis());

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("chartData", getChartData());
        return "index";
    }

    // **adding data in controller to show in index.html through model */
    private List<List<Object>> getChartData() {
        return List.of(

                List.of("Mushrooms", RANDOM.nextInt(5)),
                List.of("Onions", RANDOM.nextInt(5)),
                List.of("Olives", RANDOM.nextInt(5)),
                List.of("Zucchini", RANDOM.nextInt(5)),
                List.of("Pepperment", RANDOM.nextInt(5)),
                List.of("Chillies", RANDOM.nextInt(5)));
    }

}
