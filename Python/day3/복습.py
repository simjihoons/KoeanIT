#(1) 복습
#컬렉션 - 리스트 , 딕셔너리 , 튜플 , 세트

#%% (1) 리스트
# 리스트 - [] 대괄호
# 여러가지 값을 저장할 때 쓰는 자료형

list = ["IU",1,1.1,False]
print(list)

#슬라이싱
print(list[:2])
print(list[1:3])
print(list[2:])

#추가
list.append("edam")
print(list)

#맨뒤에 값 삭제
list.pop()
print(list)


num_list = [3,5,2,4,1]

#정렬
num_list.sort()
print(num_list)

#리스트 뒤집기
num_list.reverse()
print(list)

#다차원 리스트
multiList = [[1,2,3],[2,3,4],[3,4,"python"]]
print(multiList[2][2])
print(multiList[2][2][3])
#%% (2) 딕셔너리
'''
{
  "키" : 값

}
'''

iu = {
    "name" : "IU",
     "age" : 28

}

#추가
iu["company"] = "loen"
print(iu)

#수정
iu["company"] = "edam"
print(iu)

#키만 분리 , 값만 분리
print(iu.keys())
print(iu.values())

#%% (3) 튜플
#()
#수정삭제 안됨
#순서성은 있어서 슬라이싱은 가능

tuple = (1,2,3,4,5)
print(type(tuple))

#%% (4) 세트 = 집합 {}
#중복불가
mySet = {1,1,2,2,3,3,4,4,5,5}
print(mySet)

#빈 세트 선언할때
mySet = set()
print(mySet)

#%% (5) 입출력

user = input("값을 입력하세요 :")
print(user)
