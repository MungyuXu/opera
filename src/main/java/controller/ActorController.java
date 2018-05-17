package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Actor;
import service.ActorService;

import java.util.List;

@Controller
@RequestMapping(value = "Actor")
public class ActorController {
    @Autowired
    ActorService actorService;

    @RequestMapping(value = "findActorByOname")
    @ResponseBody
   public List<Actor> findActorByOname() throws  Exception{
        List<Actor> actors=actorService.findActorsByOname();
        return actors;
    }
}
