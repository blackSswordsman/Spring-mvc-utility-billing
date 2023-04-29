package com.ryodan.utilitybills.repository;

import com.ryodan.utilitybills.pojo.Accommodation;
import com.ryodan.utilitybills.pojo.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.ryodan.utilitybills.utils.SqlTemplate.SELECT_ALL_TEMPLATE;

@Repository
/*public interface AnnouncementRepository extends JpaRepository<Announcement,Long > {
}*/

public class AnnouncementRepository extends CommonRepository<Announcement>{
    public List <Announcement> getAllAnnouncements(){
        List<Announcement> announcements = entityManager.createNativeQuery(String.format(SELECT_ALL_TEMPLATE, "announcements"), Announcement.class).getResultList();
        return announcements;
    }
}
