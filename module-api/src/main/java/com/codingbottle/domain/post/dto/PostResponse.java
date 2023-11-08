package com.codingbottle.domain.post.dto;

import com.codingbottle.domain.Image.entity.Image;
import com.codingbottle.domain.Post.entity.Post;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

public record PostResponse (
        Long postId,
        String content,
        String username,
        Image image,
        LocalDateTime createTime,
        LocalDateTime updateTime
){
    public static PostResponse createInstance(Post post) {
        return new PostResponse(post.getId(), post.getContent(), post.getUser().getUsername(),post.getImage(), post.getCreateTime(), post.getUpdateTime()
        );
    }
}
