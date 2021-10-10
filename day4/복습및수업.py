#%% (1)   if

a = 1

if a == 0:
    print("0")
else:
    print("0이 아님")

#%% (2) while , for

a = 0
while a < 5:
    print("a")
    a += 1

#%% (1) for
#반복해야 하는 횟수가 정해져 있을때
#for 변수 in 리스트:
#       실행될 문장

list = ["지하1층","1층","2층","3층",]

for i in list:
    print(f"현재 층은 {i}입니다.")

#%% 3의 배수만 출력

num_list = [3,-20,-3,44]

for i in num_list:
    if( i % 3 ==0):
        if i>0:
            print(i)

#%% 대문자 찾기
# Case 1
chrList = ['A','b','C','d','E']

for i in chrList:
    if i.isupper():
        print(i)

#==========================================
# Case 2
for i in "PYthon":
    if i.isupper():
        print(i)

#소문자만 찾기
chrList = ['A','b','C','d','E']

for i in chrList:
    if i.islower():
        print(i)        

#%%
# 0번째 값은 --입니다.
# 1번째 값은 --입니다.
# 2번째 값은 --입니다.
# 3번째 값은 --입니다.

a = [38,21,63,55,34]


for num,i in enumerate(a):
        print(f"{num}번째 값은 {i}입니다.")


#%% for 문을 이용해 1-99까지 출력
# for 변수 in range(초기값,종료값,증감값)
# 초기값이 0일때 , 증감값이 1 일때 생략 가능

for i in range(10):
    print(i+1)    


#%% break , continue

students = [1,2,3,4,5,6,7,8,9,10]
absent = [2,5]
no_book = [7]

for students in range(1,len(students)):
    if students in absent:
        continue
    elif students in no_book:
        print(f"책없음 ? 집가셈 {students}")
        break
    print(students)

