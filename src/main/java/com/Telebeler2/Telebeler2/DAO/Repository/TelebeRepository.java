package com.Telebeler2.Telebeler2.DAO.Repository;

import com.Telebeler2.Telebeler2.DAO.Entity.TelebeEntity;
import com.Telebeler2.Telebeler2.MODEL.Enum.TelebeStatus;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TelebeRepository extends CrudRepository<TelebeEntity,Long> {
    Optional<TelebeEntity> findByIdAndStatusNot(Long id, TelebeStatus status);


//    @Query(nativeQuery = true,
//    value = """
//select name and surname
//from telebeler
//where id =:id
//"""
//    )

    @Query(value = "select name , surname from TelebeEntity where id=:id")

    String findNameAndSurnameById(Long id);
}
