package com.diduk.mvc.controllers;


import com.diduk.mvc.entity.Position;
import com.diduk.mvc.services.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller()
@RequestMapping("/positions")
public class PositionController {

    @Autowired
    private PositionService positionService;

    @RequestMapping("/showAllPositions")
    public String showAllPositions(Model model){
        model.addAttribute("allPositions", positionService.showAllPositions());
        return "all-positions";
    }


    @RequestMapping("/updatePosition")
    public String updatePosition(@RequestParam("posId") Integer id, Model model){
        Position position = positionService.getPosition(id);
        model.addAttribute("position", position);
        return "position-info";
    }

    @RequestMapping("/savePosition")
    public String savePosition(Position position){
        positionService.saveOrUpdateDepartment(position);
        return "redirect:/positions/showAllPositions";
    }

    @RequestMapping("/addNewPosition")
    public String addNewPosition(Model model){
        Position position=new Position();
      model.addAttribute("position", position);
      return "position-info";
    }

    @RequestMapping("/deletePosition")
    public String deletePosition(@RequestParam("posId") Integer id){
        positionService.deletePosition(id);
        return "redirect:/positions/showAllPositions";
    }
}
