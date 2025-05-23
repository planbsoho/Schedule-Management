package com.example.schedule.dto;

import com.example.schedule.entity.Schedule;
import com.example.schedule.golbal.ScheduleStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDate;
@Getter
public class ScheduleUpdateResponseDto {
    private Long id ;
    private LocalDate date;//수정된날짜?
    private String title;
    private String body;
    private ScheduleStatus status; //COMPELTE

    //생성자
    public ScheduleUpdateResponseDto(Schedule schedule){
        this.id = schedule.getId();
        this.date = schedule.getDate();
        this.title = schedule.getTitle();
        this.body = schedule.getBody();
        this.status = schedule.getStatus();
    }
}
