# Comento 실습과제

## 1주차 : 환경구축 

### 1. github 계정생성
- 기존 계정 사용

### 2. JDK/Tomcat/mybatis Eclipse 설치
- JDK 15.0.1, Tomcat 9, Eclipse, mybatis 3.5.6v 설치

### 3. Spring 환경구축
- STS와 마켓플레이스 중, STS를 선택
- STS 설치 이후, 추가로 필요한 기능은 MarketPlace 이용 (Spring 3 Tool for 4)

### 4. mariaDB 설치 및 연동 테스트용 Web 어플리케이션 제작
- mariaDB, Mysql Workbench 사용
- root 계정 사용 대신 권한제한 계정 생성 후 사용
- Maven을 통해 Spring외 log4j, mybatis, mariaDB jdbc 패키지 추가
- DAO, mybatis로 DB의 MovieTable의 요소를 읽어오는 것을 확인

### 5. Spring, Spring Boot 환경 구축 차이
- Spring-boot는 추가적 환경설정 비용이 적음(dependency, context)
  - 이 차이는 IDE에 따라 어느정도 보완해준다.
- Spring-boot는 WAS가 기본 내장 (Embedded Tomcat)

### 6. 기타사항
- 앞으로의 개발환경의 root는 dev 폴더로 설정


## 2주차 : API 문서 작성

### 1. 인터페이스 가이드 문서 작성
- 참고문서 : KAKAO API 참고문서 관심 키워드
  - link : https://www.jejudatahub.net/api/files/download/1,74603d1d84
- 과제작성 : SW 활용율 (접속자 수, 부서별 접속자 수, 로그인 요청 수, 게시글 작성 수)
  - link : https://docs.google.com/document/d/1THnGPAtFVN-mdnBL44V0dEr8IT9LXpj_lpLndkqNm74/edit?usp=sharing
