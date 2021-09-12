package com.study.todolist;

import lombok.Builder;
import lombok.Getter;

@Getter
public class TaskDto {
    private Long id;
    private String title;
    private boolean completed = false;
    private String date;

    @Builder
    private TaskDto(Long id, String title, String date) {
        this.id = id;
        this.title = title;
        this.date = date;
    }
}
