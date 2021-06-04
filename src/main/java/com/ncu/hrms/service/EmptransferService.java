package com.ncu.hrms.service;

import com.ncu.hrms.bean.Emptransfer;

import java.util.List;

public interface EmptransferService {
    List<Emptransfer> getAllEmptransfer();

    int addEmptransfer(Emptransfer emptransfer);
}
