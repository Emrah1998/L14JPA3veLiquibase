package com.Telebeler2.Telebeler2.SERVICE;

import com.Telebeler2.Telebeler2.MODEL.Request.CreateTelebeRequest;
import com.Telebeler2.Telebeler2.MODEL.Request.UpdateAgeRequest;
import com.Telebeler2.Telebeler2.MODEL.Response.TelebeResponse;

public interface TelebeService {
    void saveTelebe (CreateTelebeRequest telebe);
    void updateTelebeAge (Long id, UpdateAgeRequest request);
    void deleteTelebe (Long id);
    TelebeResponse getTelebe (Long id);
}
