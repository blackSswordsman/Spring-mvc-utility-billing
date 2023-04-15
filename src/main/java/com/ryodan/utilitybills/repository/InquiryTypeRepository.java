package com.ryodan.utilitybills.repository;

import com.ryodan.utilitybills.pojo.InquiryType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InquiryTypeRepository extends JpaRepository<InquiryType,Long> {
}
