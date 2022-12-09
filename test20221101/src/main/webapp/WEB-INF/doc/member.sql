DROP TABLE member CASCADE CONSTRAINTS;
DROP SEQUENCE member_seq;

CREATE TABLE member (
    memberno NUMBER(10) NOT NULL,
    id VARCHAR(20) NOT NULL UNIQUE,
    password VARCHAR(60) NOT NULL,
    nickname VARCHAR(30) NOT NULL,
    PRIMARY KEY(memberno)
);

COMMENT ON TABLE member is '회원';
COMMENT ON COLUMN member.memberno is '회원 번호';
COMMENT ON COLUMN member.id is '아이디';
COMMENT ON COLUMN member.password is '비밀번호';
COMMENT ON COLUMN member.nickname is '닉네임';

CREATE SEQUENCE member_seq
    START WITH 1           -- 시작 번호
    INCREMENT BY 1         -- 증가값
    MAXVALUE 9999999999 -- 최대값: 9999999999
    CACHE 2                -- 2번은 메모리에서만 계산
    NOCYCLE;               -- 다시 1부터 생성되는 것을 방지
commit;

INSERT INTO member(memberno, id, password, nickname)
VALUES (member_seq.nextval, 'id1', '1234', '홍길동');

INSERT INTO member(memberno, id, password, nickname)
VALUES (member_seq.nextval, 'id2', '1234', '김철수');

INSERT INTO member(memberno, id, password, nickname)
VALUES (member_seq.nextval, 'id3', '1234', '나영희');