#1일차
#들여쓰기 하면 에러남

print("Hello world!")

# 주석(Comment)
# 코드 설명 , 기록 등에 사용함
# 주석의 종류는 #,''' ''' , """ """

'''
My project
version : 1.0.0
Created : 2021.10.02
Modified : 2021.10.03
'''

"""
주석 테스트
"""


# 변수(Variable)
# 데이터 저장할 때 쓰는 공간
# 파이썬은 변수들의 자료형을 지정해줄 핖요가 없다.

a = 1 # 정수형
b = 1
c = 1

age1 , age2 = 24 , 28 # age1 = 24 , age2 = 28

f = 3.14 # 실수형

s = "BTS" # 문자열
name1 , name2 = "유재석" , "하하"
add = '''
부산광역시 해운대구 우동 123   
''' #변수 안에서 '''의 역할은 다중 문자열을 저장할 수 있음.


c = 'A'   # 문자형



b1 = True # boolean형(앞에 대문자) - 논리형
b2 = False # boolean형(앞에 대문자) - 논리형


#형 변환

print(float(a)) # 정수 -> 실수 형 변환
print(int(f))   # 실수 -> 정수 형 변환 // 3.14가 정수로 형 변환되서 3만 출력

print(bool(a)) # 정수 -> 논리 형 변환

print(str(1)+"a") # 1a가 출력

print(10,"a") #10 a 가 출력

# 타입 묻기
print(type(1.1))
print(type("1.1"))
print(type(1))
print(type(True))


print("\n")
print("\n")

singer = "BTS"
print("내가 좋아하는 가수는"+singer+"입니다.")

print("\n")
print("\n")

# 대입연산자
# =

# 관계연산자 (결과값이 논리로 출력된다)
# == , >= ,<= , > , < , !=
print(1>2) # false
print(12 != 2) # 12와 2가 같지 않다. True

# 논리연산자
# and( & )   , or( | ) , not( ! )

print((3 >1) & (3 >2)) # 3은 1보다 크고 2보다 크다. True // and는 둘 다 참이어야 참이다.
print(3 >1 and 3 >2) # 3은 1보다 크고 2보다 크다. True

print((3>1) | (3>5)) #or 은 둘 중 하나만 참이어도 참이다.
print(3>1 or 3>5)

print("\n")
print("\n")

# 시퀀스 연산자

#list = 배열과 비슷한 의미
#변수들의 집합이다.

#지하철 칸별로 10명 20명 30명이 있다고 가정

subway1 = 10
subway2 = 20
subway3 = 30

subway = [10 , 20 , 30] # 0번째 , 1번째 , 2번째
print(subway[0])        # 0번째만 호출
print(subway[1])        # 1번째만 호출
print(subway[2])        # 2번째만 호출

print(subway[-1])       # 음수는 뒤에서 부터 카운트 한다. 즉, -1번째는 2번째와 같다.




name = "유재석" #String 한줄도 배열로 해석된다.
print(name[0])  #0번째인 유 만 출력

#이런것도 가능
subwayTest = [10 , "유재석" , True , 1.1]
print(subwayTest)



#만약 정형돈의 형 자만 꺼내고싶으면 2차원 배열을 사용함
subwayTest2 =["유재석" , "정형돈","조세호"]
print(subwayTest2[1][1])

print(subwayTest2.index("조세호")) # 배열에서 몇번째 위치에 있는지 묻기

#list에 새로운 값 추가하기
#하하가 다음 정류장에 탔습니다.
subwayTest2.append("하하")
print(subwayTest2)

#배열과 배열 사이에 값 추가하기
#유재석과 정형돈 사이에 박명수가 탔습니다. 
subwayTest2.insert(1,"박명수")
print(subwayTest2)

#맨뒤에 있는 값 빼기
subwayTest2.pop()
print(subwayTest2)

# 숫자 정렬 sort()
# 숫자 배열 거꾸로 뒤집기 reverse()

num_list = [5,3,1,4,2]
print(num_list)

# 숫자 정렬 sort()
num_list.sort()
print(num_list)

# 숫자 배열 거꾸로 뒤집기 reverse()
num_list.reverse()
print(num_list)


print("\n")
print("\n")



#삭제
print(subwayTest2)
subwayTest2.remove("조세호")
print(subwayTest2)

#배열 길이 구하기
print(len(subwayTest2))


#배열에 배열 넣기
Array_test = ["유재석" , "하하" , ["사과" , "바나나"]]
print(Array_test[2][1][1]) #'나'가 출력된다.



# Dictionary // 배열과는 조금 다르다.
cabinet = { 
    "name1" : "유재석", # key : value 의 형태이다.
    "name2" : "하하",
    "name3" : "조세호"
} 

print(cabinet["name1"])     # 유재석만 출력
print(cabinet.get("name1")) # get을 이용해 key의 값을 불러올수 있따.


#값을 추가하는 방법
cabinet["name4"] = "박명수" #key를 정한 후 값을 준다.

print(cabinet)
print(cabinet.get("name4"))

print("name1" in cabinet) #name1 이 cabinet 안에 있는지 검사 (출력 값은 True or False)

cabinet["name5"] = [1,2,3,4,50]
print(cabinet)


#값을 수정하는 방법
cabinet["name1"] = "노홍철"
print(cabinet.get("name1"))

#값을 삭제하는 방법
cabinet.pop("name1")
print(cabinet.get("name1"))  #값이 삭제가 되었기 때문에 none이 나온다.
print(cabinet)

print(cabinet.values())  #key는 제외하고 value의 값만 출력
print(cabinet.keys())    #value는 제외하고 key의 값만 출력

#list의 슬라이싱
#슬라이싱 = 잘라내기(뽑아내기)
num = [1,3,5,7,10]
print(num[0:2])  #0번째 부터 2번째 전까지 출력
print(num[:2])   #0번째 부터 2번째 전까지 출력 (앞에서 부터 뽑아낼때는 0 생략 가능)
print(num[2:4])  #2번쨰 부터 4번째 전까지 출력
print(num[2:])   #2번째 부터 끝까지 다 출력


