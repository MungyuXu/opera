package mapper;

import pojo.Actor;

import java.util.List;

public interface ActorMapper {
    List<Actor> findActorsByOname() throws  Exception;
}
