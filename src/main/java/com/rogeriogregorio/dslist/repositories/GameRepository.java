package com.rogeriogregorio.dslist.repositories;

import com.rogeriogregorio.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository  extends JpaRepository<Game, Long> {

}
