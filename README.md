1. 요구사항
- indent는 1
- else 쓰지 않는다
- 함수 하나의 한가지만 하도록
- UI와 로직 분리

2. 기능 정리
- [O] 심판이 시작한다
- [O] 숫자 생성기가 숫자를 생성한다. 
- [O] 컴퓨터 숫자 생성한다.
- [] 플레이어 숫자 생성한다.
- [] 생성한 숫자가 유효한지 검증한다.
- [] 비교한다. 같은자리면 스트라이크, 다른 자리면 볼, 없으면 낫싱
- [] 다 맞추면 게임이 끝난다
- [] 다 맞추기 전까진 계속 반복한다
- [] 끝난 후 게임을 다시 시작하거나 완전히 종료 할 수 있다.

## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
3. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
4. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
5. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```
