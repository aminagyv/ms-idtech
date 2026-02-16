package com.example.msidtech.scheduler;

import com.example.msidtech.entity.TeacherEntity;
import com.example.msidtech.repository.TeacherRepository;
import com.example.msidtech.service.EmailService;
import com.example.msidtech.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Component
public class BirthdayScheduler {
    private final TeacherRepository teacherRepository;
    private final EmailService emailService;

    @Scheduled(cron = "0 0 0 * * ?")
    public void sendBirthdayMessages(){
        LocalDate today = LocalDate.now();
        List<TeacherEntity>teachers=teacherRepository.findAll();
        for(TeacherEntity t:teachers){
            if (t.getBrithDay()!=null&&t.getBrithDay().getMonth()==today.getMonth()&&
                    t.getBrithDay().getDayOfMonth()==today.getDayOfMonth()){
                emailService.sendEmail(
                        t.getTeacherEmail(),"Happy BrithDay"+t.getTeacherName()
                );
            }
        }

    }
}
