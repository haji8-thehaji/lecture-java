INSERT INTO book2(book_id,title,author,publisher,release_date,isbn) VALUES('10011','장기20세기','조반니 아리기','그린비','20140520','9788976827821');
INSERT INTO book2(book_id,title,author,publisher,release_date,isbn) VALUES('10021','신의 지문','그레이엄 핸콕','까치','20170120','9788972916307');
INSERT INTO book2(book_id,title,author,publisher,release_date,isbn) VALUES('10031','신화의 이미지','조지프 캠벨','살림출판사','20060220','9788952204776');
INSERT INTO book2(book_id,title,author,publisher,release_date,isbn) VALUES('10041','블랙아테나 1','마틴 버낼','소나무','20060110','9788971395479');
INSERT INTO book2(book_id,title,author,publisher,release_date,isbn) VALUES('10051','판다의 엄지','스티븐 제이 굴드','사이언스북스','20160520','9788983717788');
INSERT INTO book2(book_id,title,author,publisher,release_date,isbn) VALUES('10061','이기적 유전자','리처드 도킨스','을유문화사','20181020','9788932473901');

INSERT INTO lemp(id,state) VALUES('1','on');
INSERT INTO lemp(id,state) VALUES('2','on');
INSERT INTO lemp(id,state) VALUES('3','on');
INSERT INTO lemp(id,state) VALUES('4','off');
INSERT INTO lemp(id,state) VALUES('5','on');
INSERT INTO lemp(id,state) VALUES('6','on');
INSERT INTO lemp(id,state) VALUES('7','on');
INSERT INTO lemp(id,state) VALUES('8','off');
INSERT INTO lemp(id,state) VALUES('9','on');
INSERT INTO lemp(id,state) VALUES('10','on');
INSERT INTO lemp(id,state) VALUES('11','on');
INSERT INTO lemp(id,state) VALUES('12','off');
INSERT INTO lemp(id,state) VALUES('13','on');

INSERT INTO boardHaji (id, name, content, created_at, views) VALUES
('01', '홍길동', '놀라운 발견! 첫 번째 게시글입니다.', NOW(), 10);

INSERT INTO board (id, name, content, created_at, views) VALUES
('01', '홍길동', '놀라운 발견! 첫 번째 게시글입니다.', NOW(), 10);

-- 게시글 삽입
INSERT INTO board (id, name, content, created_at, views) VALUES ('1', '첫 번째 게시글', '안녕하세요! 첫 번째 게시글입니다.', NOW(), 10);
INSERT INTO board (id, name, content, created_at, views) VALUES ('2', '두 번째 게시글', '두 번째 게시글에 오신 것을 환영합니다.', NOW() - INTERVAL 1 DAY, 5);
INSERT INTO board (id, name, content, created_at, views) VALUES ('3', '세 번째 게시글', '여기는 세 번째 게시글입니다. 많은 참여 부탁드립니다!', NOW() - INTERVAL 2 DAY, 15);
INSERT INTO board (id, name, content, created_at, views) VALUES ('4', '네 번째 게시글', '새로운 소식이 있습니다. 확인해보세요!', NOW() - INTERVAL 3 DAY, 20);
INSERT INTO board (id, name, content, created_at, views) VALUES ('5', '다섯 번째 게시글', '여러분의 의견을 듣고 싶습니다.', NOW() - INTERVAL 4 DAY, 3);
INSERT INTO board (id, name, content, created_at, views) VALUES ('6', '여섯 번째 게시글', '재미있는 이야기를 공유해볼까요?', NOW() - INTERVAL 5 DAY, 8);
INSERT INTO board (id, name, content, created_at, views) VALUES ('7', '일곱 번째 게시글', '오늘의 날씨는 어떤가요?', NOW() - INTERVAL 6 DAY, 12);
INSERT INTO board (id, name, content, created_at, views) VALUES ('8', '여덟 번째 게시글', '주말 계획은 무엇인가요?', NOW() - INTERVAL 7 DAY, 6);
INSERT INTO board (id, name, content, created_at, views) VALUES ('9', '아홉 번째 게시글', '취미에 대해 이야기해봐요.', NOW() - INTERVAL 8 DAY, 9);
INSERT INTO board (id, name, content, created_at, views) VALUES ('10', '열 번째 게시글', '추천하고 싶은 책이 있습니다.', NOW() - INTERVAL 9 DAY, 11);
INSERT INTO board (id, name, content, created_at, views) VALUES ('11', '열한 번째 게시글', '오늘의 뉴스에 대해 논의해봅시다.', NOW() - INTERVAL 10 DAY, 4);
INSERT INTO board (id, name, content, created_at, views) VALUES ('12', '열두 번째 게시글', '여행 경험을 공유해주세요!', NOW() - INTERVAL 11 DAY, 14);
INSERT INTO board (id, name, content, created_at, views) VALUES ('13', '열세 번째 게시글', '요즘 핫한 주제는 무엇인가요?', NOW() - INTERVAL 12 DAY, 2);
INSERT INTO board (id, name, content, created_at, views) VALUES ('14', '열네 번째 게시글', '여러분의 소중한 의견을 기다립니다.', NOW() - INTERVAL 13 DAY, 7);
INSERT INTO board (id, name, content, created_at, views) VALUES ('15', '열다섯 번째 게시글', '재미있는 사진을 올려봐요.', NOW() - INTERVAL 14 DAY, 18);
INSERT INTO board (id, name, content, created_at, views) VALUES ('16', '열여섯 번째 게시글', '최근에 본 영화는 어땠나요?', NOW() - INTERVAL 15 DAY, 13);
INSERT INTO board (id, name, content, created_at, views) VALUES ('17', '열일곱 번째 게시글', '꿈꾸는 직업에 대해 이야기해요.', NOW() - INTERVAL 16 DAY, 19);
INSERT INTO board (id, name, content, created_at, views) VALUES ('18', '열여덟 번째 게시글', '요즘 즐겨 듣는 음악이 있나요?', NOW() - INTERVAL 17 DAY, 16);
INSERT INTO board (id, name, content, created_at, views) VALUES ('19', '열아홉 번째 게시글', '오늘 하루 어땠나요? 나눠주세요!', NOW() - INTERVAL 18 DAY, 1);
INSERT INTO board (id, name, content, created_at, views) VALUES ('20', '스무 번째 게시글', '다음 모임에 대한 계획을 세워봅시다.', NOW() - INTERVAL 19 DAY, 17);
