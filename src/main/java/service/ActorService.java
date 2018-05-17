package service;

import pojo.Actor;

import java.util.List;

public interface ActorService {
    List<Actor> findActorsByOname() throws Exception;
}
