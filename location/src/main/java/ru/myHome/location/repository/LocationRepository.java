package ru.myHome.location.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.myHome.location.model.Location;

@Repository
public interface LocationRepository extends CrudRepository <Location, Integer> {

}
