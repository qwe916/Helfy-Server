package com.codingbottle.fixture;

import com.codingbottle.auth.entity.Role;
import com.codingbottle.auth.entity.User;
import com.codingbottle.domain.image.entity.Directory;
import com.codingbottle.domain.image.entity.Image;
import com.codingbottle.domain.post.entity.Post;
import com.codingbottle.domain.post.model.PostRequest;
import com.codingbottle.domain.quiz.entity.Quiz;
import com.codingbottle.domain.quiz.entity.QuizType;
import com.codingbottle.domain.region.entity.Region;

import java.util.HashMap;


public class DomainFixture {
    public static final Image 게시글1_이미지 = Image.builder()
            .directory(Directory.POST)
            .imageUrl("https://d1csu9i9ktup9e.cloudfront.net/default.png")
            .convertImageName("default.png")
            .build();

    public static final Image 게시글2_이미지 = Image.builder()
            .directory(Directory.POST)
            .imageUrl("https://d1csu9i9ktup9e.cloudfront.net/default.png")
            .convertImageName("default.png")
            .build();

    public static final User 유저1 = User.builder()
            .username("유저1")
            .email("helfy@gmail.com")
            .region(Region.SEOUL)
            .picture("https://d1csu9i9ktup9e.cloudfront.net/default.png")
            .role(Role.ROLE_USER)
            .build();

    public static final User 유저2 = User.builder()
            .username("유저2")
            .email("helfy@gmail.com")
            .region(Region.SEOUL)
            .picture("https://d1csu9i9ktup9e.cloudfront.net/default.png")
            .role(Role.ROLE_USER)
            .build();

    public static final Post 게시글1 = Post.builder()
            .content("게시글")
            .image(게시글1_이미지)
            .user(유저1)
            .build();

    public static final Post 게시글2 = Post.builder()
            .content("게시글")
            .image(게시글2_이미지)
            .user(유저1)
            .build();

    public static final PostRequest 게시글_생성_요청1 = new PostRequest("게시글", 1L);

    public static final PostRequest 게시글_수정_요청1 = new PostRequest("게시글 수정", 1L);

    public static final Image 게시글_수정_이미지1 = Image.builder()
            .directory(Directory.POST)
            .imageUrl("https://d1csu9i9ktup9e.cloudfront.net/default.png")
            .convertImageName("default.png")
            .build();

    public static final Image 퀴즈_이미지1 = Image.builder()
            .directory(Directory.QUIZ)
            .imageUrl("https://d1csu9i9ktup9e.cloudfront.net/default.png")
            .convertImageName("default.png")
            .build();

    public static final Quiz 퀴즈1 = Quiz.builder()
            .answer("답")
            .question("질문")
            .choices(new HashMap<>(){
                {
                    put("1", "선택지1");
                    put("2", "선택지2");
                    put("3", "선택지3");
                    put("4", "선택지4");
                }
            })
            .quizType(QuizType.MULTIPLE_CHOICE)
            .image(null)
            .build();

    public static final Quiz 퀴즈2 = Quiz.builder()
            .answer("답")
            .question("질문")
            .choices(new HashMap<>(){
                {
                    put("1", "선택지1");
                    put("2", "선택지2");
                    put("3", "선택지3");
                    put("4", "선택지4");
                }
            })
            .quizType(QuizType.OX)
            .image(퀴즈_이미지1)
            .build();
}

