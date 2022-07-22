# MariaDB 사용자 및 권한 조회 & 추가

먼저, 터미널에 접속한다

## 마리아DB 접속
`sudo mysql -u root`   

mysql -u root -p 명령어를 사용하면 비밀번호를 입력하라고 하는데,    
처음 설치하면 root 계정의 설정이 되어있지 않아서 root 설정을 따로 해줘야한다

## Database 확인
mysql> `show databases;`

## mysql DB 로 전환
mysql> `use mysql;`

## Table 확인
mysql> `show tables;`

## 사용자 확인
mysql> `select host, user, password from user;`

## 사용자별 권한 확인
mysql> `show grants for 사용자계정@호스트;`
#### # [예시] 사용자 cheonga 권한 확인
mysql> show grants for cheonga@localhost;

## 사용자 추가 및 권한 설정
mysql> `GRANT ALL PRIVILEGES ON DB이름.테이블이름 TO 아이디@호스트 IDENTIFIED BY '비밀번호' with grant option;`
#### # [예시] 사용자 cheonga 추가 및 SELECT 권한 설정
mysql> GRANT SELECT ON indiz.* TO 'cheonga'@'localhost' IDENTIFIED BY '비밀번호' with grant option;

### 권한 종류
- ALL PRIVILEGES : 모든 권한 추가 
- SELECT, INSERT, UPDATE, DELETE, ... : 권한을 일부분을 추가 

### 적용될 DB 및 테이블 
- DB이름.테이블이름 : `*.*` 시 모든 DB, 모든 Table 권한 부여 

### with grant option 옵션
- with grant option : GRANT를 사용할 수 있는 권한 추가

## 사용자 삭제
mysql> `drop user 사용자계정@호스트;`
#### # [예시] 사용자 cheonga 삭제
mysql> drop user cheonga@localhost;