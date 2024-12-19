package com.Telebeler2.Telebeler2.SERVICE;

import com.Telebeler2.Telebeler2.DAO.Entity.TelebeEntity;
import com.Telebeler2.Telebeler2.DAO.Repository.TelebeRepository;
import com.Telebeler2.Telebeler2.MODEL.Enum.TelebeStatus;
import com.Telebeler2.Telebeler2.MODEL.Request.CreateTelebeRequest;
import com.Telebeler2.Telebeler2.MODEL.Request.UpdateAgeRequest;
import com.Telebeler2.Telebeler2.MODEL.Response.TelebeResponse;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TelebeServiceHandle implements TelebeService {
    private final TelebeRepository telebeRepository;

    @Override
    public void saveTelebe(CreateTelebeRequest telebe) {
        telebeRepository.save(
                TelebeEntity.builder()
                        .name(telebe.getName())
                        .surname(telebe.getSurname())
                        .age(telebe.getAge())
                        .build()
        );
    }

    @Override
    public void updateTelebeAge(Long id, UpdateAgeRequest request) {

        var telebe = telebeRepository.findById(id)
                .orElseThrow(RuntimeException::new);
        telebe.setAge(request.getAge());
        telebeRepository.save(telebe);
    }

    @Override
    public void deleteTelebe(Long id) {
        var telebe = fetchTelebeIfExist(id);
        telebe.setStatus(TelebeStatus.DELETED);
        telebeRepository.save(telebe);
    }

    @Override
    public TelebeResponse getTelebe(Long id) {
        var telebe = fetchTelebeIfExist(id);
        return new TelebeResponse(telebe.getName(), telebe.getSurname());
    }

    private TelebeEntity fetchTelebeIfExist(Long id) {
        return  telebeRepository.findByIdAndStatusNot(id,TelebeStatus.DELETED)
                .orElseThrow(RuntimeException::new);
    }

    @PostConstruct
    public void test(){
        var nameAndSurname = telebeRepository.findNameAndSurnameById(1L);
    }
}
