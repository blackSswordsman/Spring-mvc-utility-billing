package com.ryodan.utilitybills.repository;

import com.ryodan.utilitybills.pojo.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentInfoRepository extends JpaRepository<PaymentInfo,Long> {
}
