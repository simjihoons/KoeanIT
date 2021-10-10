#%%
# for i in range(9):
#     for j in range(9):
#         print(f"{(i+2)} * {(j+1)} = {(i+1)*(j+1)}")
#     print("\n")


#%%
#리스트의 합 구하기

list = [1,2,3,4,5,6,7,8,9,15]
sum = 0
for i in list:
    sum += i
print(sum)


# #range 사용
# for i in range(len(list)):
#     sum += list[i]
# print(sum)

#%% for + tuple

tuple = (1,2,3,4,55,6,7,8)

for i in tuple:
    print(i)

#%% for + set

mySet = set()

mySet = {1,23,54,1,1,2,3}
for i in mySet:
    print(i)

#%% for + dict

dict = {
    "name" : "IU",
    "age" : 28,
    "height" : 163.5,
    "company" : "edam"
}

#items() 메서드 사용해야함.
# for i in dict.items():
#     print(i)

for key,value in dict.items():
    print(f"키 : {key}, 값 : {value}")

#%% (1) Test
#리스트에서 세 글자 이상의 문자를 화면에 출력하라

#리스트 = ["I","study","python","language","!"]

#결과값
#study
#python
#language

list = ["I","study","python","language","!"]

for i in list:
    if len(i) > 3:
        print(i)





# %%
i = 3
for j in range(10):
    if (j % 2 == 1):
       print(f"{i} * {j} = {i*j}")
#====================================
i = 3
for j in range(1,10,2):
    # if (j % 2 == 1):
    print(f"{i} * {j} = {i*j}")

#%%
#1~100 까지 합
sum = 0
for i in range(1,101):
    sum += i 
print(sum)


#%% 월드컵은 4년에 한번 개최된다.
#range()를 사용하여 2002~2050년까지 중
#월드컵이 개최되는 연도를 출력하라

for i in range(2002,2051,4):
    print(i)


#%% 아래와 같이 리스트의 데이터를 출력하라
# 0 32100
# 1 32150
# ---
#단, for문과 range문을 사용하라(enumerate 금지)

list = [32100,32150,32000,32500]

for i in range(len(list)):
    print(i,list[i])

#%% msList를 아래와 같이 출력하라.
# 가나
# 나다
# 다라

myList = ['가','나','다','라']


# for i in range(len(myList)-1):
#     print(myList[i],myList[i+1])

for i in range(3):
    print(myList[i],myList[i+1])

    
#%%
#%% 구구단
for i in range(2,10):
    print(f"========{i}단========")
    for j in range(1,10):
        print(f"{(i)} * {(j)} = {(i)*(j)}")
      

#%%
#평균 성적을 구하고 80점 이상이면 합격입니다.
#미만이면 불합격 출력

score = [90,100,77,79,72]
sum = 0
avg = 0.0

for i in range(len(score)):
    sum += score[i] 
avg = sum / len(score)

if avg >=80:
    print(f"평균 성적 {avg}점으로 합격 입니다.")
else:
    print(f"평균 성적 {avg}점으로 불합격 입니다.")

#%% 업다운 게임
import random

num = random.randrange(1,101)
cnt = 0
while True:
    answer = int(input("숫자 입력 : "))
    cnt += 1
    if answer > num:
        print("Down!")
        continue
    elif answer < num:
        print("Up!")
        continue
    else:
        print(f"{cnt}번 만에 정답!")
        break
# %%
#%%
#중간고사 성적이 발표되었습니다.
#한 반에 총 8명의 학생이 있고,
#각 학생의 국어점수를 번호순으로 나열하면 다음과 같습니다.

exam = [99,78,100,91,54,100,71,50]

#100점을 받은 학생의 점수를 제외한 나머지 학생들의 점수를
#5점씩 증가시킨 score 리스트를 생성하고
#출력하는 프로그램을 구현하시오.
#단, 증가된 점수가 100점이 초과하지 않도록 처리해라
finalScore = []

for i in exam:
   # print(i)
    if i <100:
        i += 5
        if i> 100:
            i = 100
    finalScore.append(i) 

print(finalScore)

