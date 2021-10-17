import random

num = random.randrange(1,6)
while True:
    ans = int(input("숫자 입력 : "))
    if ans == num:
        print("정답")
        break
    else:
        print("오답")


# https://tinyurl.com/yhvjaj4e - 수업 코드
# https://tinyurl.com/yzttg92b - 퀴즈