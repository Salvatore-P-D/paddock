package com.kolkhoz.paddock.dao.news;

import com.kolkhoz.paddock.dao.comment.Comment;
import com.kolkhoz.paddock.dao.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NewsDto {

    private Long id;
    private String title;
    private LocalDateTime creationDateTime;
    private String description;
    private String theme;
    private byte[] image;
    private User author;
    private List<Comment> comments;
}
