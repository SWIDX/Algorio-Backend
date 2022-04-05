package com.qriositylog.algorio.web.dto;

import com.qriositylog.algorio.domain.posts.Posts;

public class PostsResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;
    private String tag;

    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
        this.tag = entity.getTag();
    }
}
