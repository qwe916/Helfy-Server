package com.codingbottle.fixture;

import com.codingbottle.domain.user.entity.Role;
import com.codingbottle.domain.user.entity.User;
import com.codingbottle.domain.category.entity.Category;
import com.codingbottle.domain.image.entity.Directory;
import com.codingbottle.domain.image.entity.Image;
import com.codingbottle.domain.information.entity.Information;
import com.codingbottle.domain.information.model.InformationResponse;
import com.codingbottle.domain.post.entity.Post;
import com.codingbottle.domain.post.model.PostRequest;
import com.codingbottle.domain.quiz.entity.Quiz;
import com.codingbottle.domain.quiz.entity.QuizStatus;
import com.codingbottle.domain.quiz.entity.QuizType;
import com.codingbottle.domain.quiz.model.QuizStatusRequest;
import com.codingbottle.domain.quiz.model.UserQuizInfo;
import com.codingbottle.domain.rank.model.UserRankResponse;
import com.codingbottle.domain.region.entity.Region;
import com.codingbottle.domain.user.model.UserNicknameRequest;

import java.util.HashMap;
import java.util.List;


public class DomainFixture {
    public static final Image 게시글1_이미지 = Image.builder()
            .id(1L)
            .directory(Directory.POST)
            .imageUrl("https://d1csu9i9ktup9e.cloudfront.net/default.png")
            .convertImageName("default.png")
            .build();

    public static final Image 게시글2_이미지 = Image.builder()
            .id(2L)
            .directory(Directory.POST)
            .imageUrl("https://d1csu9i9ktup9e.cloudfront.net/default.png")
            .convertImageName("default.png")
            .build();

    public static final Image 게시글3_이미지 = Image.builder()
            .id(3L)
            .directory(Directory.POST)
            .imageUrl("https://d1csu9i9ktup9e.cloudfront.net/default.png")
            .convertImageName("default.png")
            .build();

    public static final User 유저1 = User.builder()
            .firebaseUid("firebaseUid1")
            .nickname("닉네임")
            .email("helfy@gmail.com")
            .region(Region.SEOUL)
            .role(Role.ROLE_USER)
            .build();

    public static final User 유저2 = User.builder()
            .firebaseUid("firebaseUid2")
            .nickname("닉네임")
            .email("helfy@gmail.com")
            .region(Region.SEOUL)
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

    public static final Post 게시글3 = Post.builder()
            .content("게시글")
            .image(게시글3_이미지)
            .user(유저1)
            .build();

    public static final PostRequest 게시글_생성_요청1 = new PostRequest("게시글", 1L, List.of("해시태그"));

    public static final PostRequest 게시글_생성_요청2 = new PostRequest("게시글", 3L, null);

    public static final PostRequest 게시글_수정_요청1 = new PostRequest("게시글 수정", 1L, List.of("해시태그"));

    public static final PostRequest 게시글_수정_요청2 = new PostRequest("게시글 수정", 4L, List.of("해시태그"));

    public static final Image 게시글_수정_이미지1 = Image.builder()
            .id(3L)
            .directory(Directory.POST)
            .imageUrl("https://d1csu9i9ktup9e.cloudfront.net/default.png")
            .convertImageName("default.png")
            .build();

    public static final Image 게시글_수정_이미지2 = Image.builder()
            .id(4L)
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

    public static final UserNicknameRequest 유저_닉네임_변경_요청1 = new UserNicknameRequest("닉네임 변경");

    public static final  Image 정보_이미지1 = Image.builder()
            .directory(Directory.INFORMATION)
            .imageUrl("https://d1csu9i9ktup9e.cloudfront.net/default.png")
            .convertImageName("default.png")
            .build();

    public static final Information 정보1 = Information.builder()
            .category(Category.FLOOD)
            .content("내용")
            .news("뉴스")
            .youtube("유튜브")
            .image(정보_이미지1)
            .build();

    public static final InformationResponse 정보_응답1 = InformationResponse.of(정보1);

    public static final QuizStatusRequest 퀴즈_결과_요청 = new QuizStatusRequest(QuizStatus.CORRECT);

    public static final UserQuizInfo 퀴즈정보1 = new UserQuizInfo("닉네임", 10);

    public static final UserRankResponse 유저_랭킹1 = new UserRankResponse(1L, "닉네임", 30);

    public static final UserRankResponse 유저_랭킹2 = new UserRankResponse(2L, "닉네임", 20);

    public static final UserRankResponse 유저_랭킹3 = new UserRankResponse(3L, "닉네임", 10);
}

