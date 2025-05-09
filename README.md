# 🦺 산업 안전 관리 백엔드
TurnOnSafety 의 backend를 담당하는 레포입니다.

## 개발방향
- 스택

## 환경설정
- Java 17 이상
- Maven 3.8+ or Gradle? 아직 미정.
- Spring Boot 3.x
- MySQL 8.0 이상
  
## Stack

### 기본폴더 설명

### 설계 원칙

### 인수인계시 참고사항

### Convention
- 📄 Class : 🐫 Uper CamelCase, 명사 형태로 작성
- 🧩 메서드 & 변수명 : 축약어 지양, 의미 있는 이름 사용
- ✅ 상수(Constant) : 모두 대문자 + 언더스코어
- 🧪 테스트 클래스 규칙 :  클래스명 뒤에 Test 붙이기, 테스트 메서드는 should + 행동 + when + 상황
  예시)
IncidentServiceTest.java
@Test
void shouldReturnAllIncidentsWhenCalled() { ... }

- 
### 커밋
| Prefix      | 용도 예시                    |
| ----------- | ------------------------ |
| `feat:`     | 새로운 기능 추가                |
| `fix:`      | 버그 수정                    |
| `refactor:` | 리팩토링 (기능 변화 없이 구조 개선)    |
| `chore:`    | 빌드, 의존성, 환경설정 등 잡일       |
| `docs:`     | 문서 수정                    |
| `test:`     | 테스트 코드 추가 또는 변경          |
| `style:`    | 코드 포맷팅, 세미콜론 누락 등 비기능 변경 |

### 🧪 테스트
Postman Collection: /docs/postman_collection.json
