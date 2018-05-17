package service.serviceImp;

import mapper.ActorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Actor;
import service.ActorService;

import java.util.List;

@Service
public class ActorServiceImp implements ActorService {
    @Autowired
//    OperaMapper operaMapper;
            ActorMapper actorMapper;
  public List<Actor> findActorsByOname() throws  Exception{
      return actorMapper.findActorsByOname();
  }

}
