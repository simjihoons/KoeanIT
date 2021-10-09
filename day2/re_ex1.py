#복습

#변수
a , b = 10 , 20

print(a,b)

address = '''부산광역시 금정구 1004'''

print(address)

height = 175.3

print(height)
print(int(height))

#산술연산
1+2
2-1
3*1
6/2
6%3
6 **2
6//2

#관계연산
1==1
1!=1
1>1
1<1
1>=1
1<=1

#논리 연산
# and or not
(3>2) and (5>1) # T and T : T
(3>2) and (0>1) # T and T : F
(1>2) and (0>1) # F and F : F

(3>2) or (5>1) # T and T : T
(3>2) or (0>1) # T and F : T
(1>2) or (0>1) # F and F : F

not(1>0) # F

print("--------------------------")

#list

parkingPlace = [1234,2345,3456]

parkingPlace.append(4567) # 추가
print(parkingPlace)

parkingPlace.remove(2345) #삭제(지정)
parkingPlace.pop()        #삭제(맨 뒤에만 삭제) 
print(parkingPlace)

num_list = [3,2,1,5,4]

num_list.sort()   #리스트 정렬
print(num_list)

num_list.reverse() #리스트 반대로 출력
print(num_list)

# 문자열/배열 슬라이싱

print(address)
print(address[:6])
print(address[3:6])
print(address[3:])


# 딕셔너리
# key value 로 구성
# 인덱싱 슬라이싱 안됨  (순서가 없어서)
# 하나의 key는 하나의 value만 가짐

cabinet ={
    "a" : "줄자",
    "b" : "클립",
    
}

# CRUD (Create , Read , Update , Delete)
print(type(cabinet))

#추가
cabinet["c"] = "가위"
cabinet.setdefault("d","풀")
print(cabinet)

#수정
cabinet["c"] = "풀"
cabinet.update(d="가위")
print(cabinet)

#삭제
cabinet.pop("c")
print(cabinet)

